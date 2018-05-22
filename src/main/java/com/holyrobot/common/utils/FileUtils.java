/** 
 * Project Name:javaTest 
 * File Name:FileUpload.java 
 * Package Name:manager 
 * Date:2018年3月12日 下午5:16:31 
 * author 汤玉林
 */ 
package com.holyrobot.common.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.processing.FilerException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 文件操作工具类（可根据不同的文件类型上传操作）
 * @author 汤玉林
 * @date 2018年3月12日 下午5:16:31 
 */
public class FileUtils {
	//上传路径
	public static final String UPLOAD_PATH="/upload";
	//图片类型
	public static final String[] TYPE_IMAGE={"jpg","gif","jpeg","png","bmp"};
	//文档类型
	public static final String[] TYPE_DOC={"txt","doc","xls","xml","pdf","htm","html"};
	//压缩类型
	public static final String[] TYPE_ZIP={"zip","rar","jar","gzip","war"};
	//拒绝上传的文件
	public static final String[] TYPE_DENIED={"php","php3","php5","phtml","asp","aspx","ascx","jsp","jsf","cfm"
		,"cfc","pl","bat","exe","mdll","reg","cgi"};
	
	/**
	 * 
	 * @Description 上传文件
	 * @author 汤玉林
	 * @date 2018年3月12日 下午5:36:32
	 * @action upload
	 * @param fileName 文件名
	 * @return
	 * @throws IOException 
	 */
	public static FileProperty upload(String fileName) throws IOException{
		
		FileProperty property = new FileProperty();
		int index = fileName.indexOf(".");
		String suffix = fileName.substring(index+1, fileName.length());
		Map<String, String> map = getFileType(fileName);
		String fileType = map.get("fileType");
		String prefixName = map.get("prefixName");
		property.setType(fileType);
		String suffixName = getRandomName();
		String newFileName = UPLOAD_PATH+File.separator+prefixName+suffixName+"."+suffix;
		property.setName(newFileName);
		FileInputStream input = new FileInputStream(fileName);
		int size = input.available();
		property.setSize((float)size/1024);
		property.setUploadTime(new Date());
		byte[] data = new byte[1024];
		int i = -1;
		FileOutputStream output = new FileOutputStream(newFileName);
		while ((i = input.read(data))!=-1) {
			output.write(data);
		}
		output.flush();  
        output.close();  
        input.close(); 
		return property;
	}
	
	
	/**
	 * 
	 * @Description 文件下载
	 * @author 汤玉林
	 * @date 2018年3月12日 下午6:29:43
	 * @action download
	 * @param request
	 * @param response
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	public static boolean download(HttpServletRequest request,  
	         HttpServletResponse response, String filePath) throws Exception {  
	     boolean bl=false;  
	     if (response != null && request != null && filePath != null  
	             && !filePath.equals("")) {  
	         String browserType=request.getParameter("browserType");  
	         final String userAgent = request.getHeader("USER-AGENT");  
	         
	         // filePath是指欲下载的文件的路径。  
	         filePath = URLDecoder.decode(filePath,"UTF-8");  
	         File file = new File(filePath);  
	         if(!file.exists()){  
	             throw new Exception("文件不存在！");  
	         }  
	         if(!file.isFile()){  
	             throw new Exception("非文件类型！");  
	         }  
	         // 取得文件名。  
	         String fileName = file.getName();  
	         if ("IE".equals(browserType)) {// IE浏览器,页面传过来的值，只用于判断是否为IE浏览器  
	           
	             fileName = URLEncoder.encode(fileName, "UTF8");  
	         } else {  
	            if (userAgent.contains("Mozilla")) {// google,火狐浏览器  
	             fileName = new String(fileName.getBytes(), "ISO8859-1");  
	             } else {  
	                 fileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器  
	             }  
	         }  
	         // 提示框设置  
	         response.reset(); // reset the response  
	         // response.setCharacterEncoding("UTF-8");  
	         response.setContentType("application/octet-stream");//告诉浏览器输出内容为流  
	         response.setHeader("content-disposition", "attachment; filename=\""  
	                 + fileName + "\"");  
	           
	         //读出文件到i/o流    
	         FileInputStream fis=new FileInputStream(file);    
	         BufferedInputStream buff=new BufferedInputStream(fis);   
	         byte [] ary_byte=new byte[1024];//缓存    
	         long k=0;//该值用于计算当前实际下载了多少字节    
	         // 输出流  
	         OutputStream out =  response.getOutputStream();  
	         //开始循环下载    
	         while(k<file.length()){    
	             int j=buff.read(ary_byte,0,1024);    
	             k+=j;    
	             //将b中的数据写到客户端的内存    
	             out.write(ary_byte,0,j);    
	         }    
	         // 关闭输出流  
	         if (out != null) {  
	             out.flush();  
	             out.close();  
	             fis.close();  
	             buff.close();  
	         }  
	         bl=true;  
	     } else {  
	         new NullPointerException(  
	                 "HttpServletRequest Or HttpServletResponse Or fileName Is Null !");  
	     }  
	     return bl;  
	 }  
	
	
	/**
	 * @Description 随机生成名称
	 * @author 汤玉林
	 * @date 2018年3月12日 下午6:11:21
	 * @action getRandomName
	 * @return
	 */
	private static String getRandomName() {
		String fileName = "";  
        Calendar calendar = GregorianCalendar.getInstance();  
        int year = calendar.get(Calendar.YEAR);  
        int month = calendar.get(Calendar.MONTH);  
        int day = calendar.get(Calendar.DATE);  
        String suffixName = String.valueOf(year)+String.valueOf(month)+String.valueOf(day);  
        Random rand = new Random();  
        int num = rand.nextInt(100);  
        fileName = suffixName+"_"+String.valueOf(num);  
        return fileName;  
	}


	/**
	 * @Description 获取文件类型
	 * @author 汤玉林
	 * @date 2018年3月12日 下午5:34:32
	 * @action getFileType
	 * @param fileName
	 * @return
	 * @throws FilerException 
	 */
	private static Map<String, String> getFileType(String fileName) throws FilerException {
		Map<String, String> map = new HashMap<>();
		int index = fileName.indexOf(".");
		String suffix = fileName.substring(index+1, fileName.length());
		String fileType = "";
		String prefixName = "";
		if(Arrays.toString(TYPE_DENIED).indexOf(suffix)!=-1){
			throw new FilerException("The file you upload is denied!");
		}
		else if(Arrays.toString(TYPE_IMAGE).indexOf(suffix)!=-1){
			fileType = "Image File";
			prefixName = "Image";
		}
		else if(Arrays.toString(TYPE_DOC).indexOf(suffix)!=-1){  
            fileType = "Doc File";  
            prefixName = "File";  
        }  
        else if(Arrays.toString(TYPE_ZIP).indexOf(suffix)!=-1){  
            fileType = "Zip File";  
            prefixName = "Zip";  
        }  
        else{  
            fileType = "Other File";  
            prefixName = "Other";  
        }  
		map.put("fileType", fileType);  
        map.put("prefixName", prefixName);  
		return map;
	}


	/**
	 * 
	 * @Description: 文件属性类
	 * @author 汤玉林
	 * @date 2018年3月12日 下午5:28:03
	 */
	public static class FileProperty{
		private String name; 
		private String type;
		private String contentType;
		private float size;
		private Date uploadTime;
		
		public FileProperty() {
			
		}

		public FileProperty(String name, String type, String contentType,
				float size, Date uploadTime) {
			super();
			this.name = name;
			this.type = type;
			this.contentType = contentType;
			this.size = size;
			this.uploadTime = uploadTime;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getContentType() {
			return contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public float getSize() {
			return size;
		}

		public void setSize(float size) {
			this.size = size;
		}

		public Date getUploadTime() {
			return uploadTime;
		}

		public void setUploadTime(Date uploadTime) {
			this.uploadTime = uploadTime;
		}
		
		
	}
	
	
}
