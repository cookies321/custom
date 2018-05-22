package com.holyrobot.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * @author 周相儒
 *
 * @date 2018年4月9日 下午4:29:49
 */
public class ExcelUtil {
 
	/**
	 * @Description 导出
	 * @author 周相儒
	 * @date 2018年4月9日 下午4:39:49
	 * @action writeExcel
	 * @return void
	 */
  public static void writeExcel(String fileName, String[] titles,
                                List<Map<Integer, String>> lists, HttpServletResponse response, HttpServletRequest request) throws IOException {
    HSSFWorkbook xls = new HSSFWorkbook();
    HSSFSheet sheet = xls.createSheet();
    HSSFRow row = sheet.createRow(0);// 第一行
    for (int i = 0; i < titles.length; i++) {
      sheet.setColumnWidth(i,(short)5000);
      row.createCell(i).setCellValue(titles[i]);
    }
    // 内容
    int rowNum = 1;
    for (Map<Integer, String> map : lists) {
      HSSFRow rowTmp = sheet.createRow(rowNum);
      int cols = map.size();
      for (int i = 0; i < cols; i++) {
        rowTmp.createCell(i).setCellValue(map.get(i));
      }
      rowNum++;
    }
    ByteArrayOutputStream os = new ByteArrayOutputStream();
    xls.write(os);
    byte[] content = os.toByteArray();
    InputStream is = new ByteArrayInputStream(content);
    //根据浏览器不同，对文件的名字进行不同的编码设置
    final String userAgent = request.getHeader("USER-AGENT");
    String finalFileName = null;
    if(userAgent.contains("MSIE")||userAgent.contains("Trident")){    //IE浏览器
      finalFileName = URLEncoder.encode(fileName+".xls", "UTF-8");
    }else if(StringUtils.contains(userAgent, "Mozilla")){   //google,火狐浏览器
      finalFileName = new String((fileName + ".xls").getBytes("UTF-8"), "ISO-8859-1");
    }else{
      finalFileName = URLEncoder.encode(fileName+".xls", "UTF-8");   //其他浏览器
    }
    // 设置response参数，可以打开下载页面
    response.reset();
    response.setContentType("application/vnd.ms-excel;charset=utf-8");
    response.setHeader("Content-Disposition", "attachment;filename="
            +finalFileName);
    ServletOutputStream out = response.getOutputStream();
    BufferedInputStream bis = null;
    BufferedOutputStream bos = null;
    try {
      bis = new BufferedInputStream(is);
      bos = new BufferedOutputStream(out);
      byte[] buff = new byte[2048];
      int bytesRead;
      while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
        bos.write(buff, 0, bytesRead);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (bis != null)
        bis.close();
      if (bos != null)
        bos.close();
    }
    xls.close();
    os.close();
  }

 

    /**
     * @desc 拿到图片OSS路径转换为流
     * @author 周相儒
     *  @date 2018年4月9日 下午4:30:49
     **/
    public static InputStream getInputStream(String path) {
        InputStream inputStream = null;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(path);
            if (url != null) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    inputStream = httpURLConnection.getInputStream();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputStream;

    }
}
