package com.holyrobot.common.utils;

import static javax.xml.bind.JAXBIntrospector.getValue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


/**
 * @Description 读取EXCEL文件中的内容
 * @author 周相儒
 * @date 2018年4月10日 上午9:22:50
 */
public class ReadExecl {
  @Autowired
  private ConversionService conversionService;
  //总行数
  private int totalRows = 0;
  //总条数
  private int totalCells = 0;
  //错误信息接收器
  private String errorMsg;

  //获取总行数
  public int getTotalRows() {
    return totalRows;
  }

  //获取总列数
  public int getTotalCells() {
    return totalCells;
  }

  //获取错误信息-暂时未用到暂时留着
  public String getErrorInfo() {
    return errorMsg;
  }

  /**
   * 读EXCEL文件，获取EXCEL信息集合
   */
  public List<Map<Integer, String>> getExcelInfo(MultipartFile Mfile) {

    //把spring文件上传的MultipartFile转换成CommonsMultipartFile类型
    CommonsMultipartFile cf = (CommonsMultipartFile) Mfile; //获取本地存储路径
    File file = new File("E:\\fileupload");
    //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
    if (!file.exists()) file.mkdirs();
    //新建一个文件
    File file1 = new File("E:\\fileupload\\" + new Date().getTime() + ".xls");
    //将上传的文件写入新建的文件中
    try {
      cf.getFileItem().write(file1);
     
    } catch (Exception e) {
      e.printStackTrace();
    }
    
//    DiskFileItem fileItem = (DiskFileItem) cf.getFileItem();
    //初始化EXECL信息的集合
    List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();
    //初始化输入流
    FileInputStream is = null;
    HSSFWorkbook wb = null;
    try {
      //根据新建的文件实例化输入流
      is = new FileInputStream(file1);
      //根据excel里面的内容读取信息
      //当excel是2003时
      wb = new HSSFWorkbook(is);
      //当excel是2007时
      //wb = new XSSFWorkbook(is);
      //读取Excel里面的信息
      list = readExcelValue(wb);
      is.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (is != null) {
        try {
          is.close();
        } catch (IOException e) {
          is = null;
          e.printStackTrace();
        }
      }
    }
    return list;
  }

  /**
   * 读取皈依登记Excel里面的信息
   */
  private List<Map<Integer, String>> readExcelValue(HSSFWorkbook wb) {
    //得到第一个shell
    Sheet sheet = wb.getSheetAt(0);
    //得到Excel的行数
    this.totalRows = sheet.getPhysicalNumberOfRows();
    //得到Excel的列数(前提是有行数)
    if (totalRows >= 1 && sheet.getRow(0) != null) {
      this.totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
    } else {
      return null;
    }
    List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();//声明一个集合
    //循环Excel行数,从第二行开始。标题不入库
    for (int r = 1; r < totalRows; r++) {
      Row row = sheet.getRow(r);
      if (row == null) continue;
      Map<Integer, String> maps = new HashedMap();
      //循环Excel的列
      for (int c = 0; c < this.totalCells; c++) {
        Cell cell = row.getCell(c);
        if (cell != null) {
          if (cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
            if (DateUtil.isCellDateFormatted(cell)) {
              DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
              Date date = cell.getDateCellValue();
              String date1 = formater.format(date);
              maps.put(c, date1.toString());
            } else {
              DecimalFormat df = new DecimalFormat("#.##");//数字，或者double金额
              maps.put(c, df.format(cell.getNumericCellValue()));
            }
          } else {
            maps.put(c, getValue(cell).toString());
          }
        }
      }
      //添加对象到集合中
      list.add(maps);
    }
    return list;
  }

  /**
 * @Description 验证字符串是否为指定的日期格式
 * @author 周相儒
 * @date 2018年4月10日 上午9:24:26
 * @action isValidDate
 * @return boolean
 */
public boolean isValidDate(String str) {
    boolean flag = true;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    try {
      format.setLenient(false);
      format.parse(str);
    } catch (ParseException e) {
      // e.printStackTrace();
      // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
      flag = false;
    }
    return flag;
  }
}

