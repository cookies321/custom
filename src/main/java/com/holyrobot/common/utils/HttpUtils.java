/** 
 * Project Name:holyrobot-common 
 * File Name:HttpUtils.java 
 * Package Name:com.jingjie.common.utils 
 * Date:2018年3月21日 下午4:58:56 
 * author 汤玉林
 */ 
package com.holyrobot.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月21日 下午4:58:56 
 */
public class HttpUtils {

	
	/**
	 * 
	 * @Description http get请求
	 * @author 汤玉林
	 * @date 2018年3月21日 下午5:00:22
	 * @action httpClientGet
	 * @param url 请求url
	 * @param maps
	 * @return
	 */
	public static HttpResponse httpClientGet(String url, Map<?, ?>... maps) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse response=null;
		int statusCode=0;
		String result=null;
		try {
			HttpGet get = new HttpGet(url);
			setGetHeaders(get, maps);
			response = httpClient.execute(get);
			statusCode = response.getStatusLine().getStatusCode();
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);

		} catch (Exception e) {
			e.printStackTrace();
			statusCode = response.getStatusLine().getStatusCode();
		} finally {
			try {
				httpClient.close();
				return new HttpResponse().info(statusCode, result);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	/**
	 * @Description http post方法
	 * @author 汤玉林
	 * @date 2018年3月21日 下午5:06:37
	 * @action post
	 * @param url 请求地址
	 * @param param post请求参数
	 * @param encoding 响应编码
	 * @param maps 请求头
	 * @return
	 */
	public static HttpResponse post(String url, String param, String encoding,Map<?,?>...maps){
		PrintWriter out = null;
		BufferedReader in = null;
		String result = null;
		HttpURLConnection conn= null;
		int statusCode=0;
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			conn = (HttpURLConnection) realUrl.openConnection();
			// 设置通用的请求属性
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36"
					+ " (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36");
			conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8");
			for (Map<?, ?> map : maps) {
				Iterator<?> iterator=map.keySet().iterator();
				while (iterator.hasNext()) {
					String next = (String) iterator.next();
					String object = (String) map.get(next);
					if(next.contains("Content-Type")&&object.contains("x-protobuf")){
						object="application/octet-stream";
					}
					conn.setRequestProperty(next, object);
				}
			}

			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			if(StringUtils.isBlank(encoding)){
				in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else{
				in = new BufferedReader(new InputStreamReader(conn.getInputStream(),encoding));
			}
			statusCode = conn.getResponseCode();
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}

		} catch (Exception e) {
			e.printStackTrace();
			try {
				statusCode = conn.getResponseCode();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		// 使用finally块来关闭输出流、输入流
		finally {

			try { 
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
				return new HttpResponse().info(statusCode, result);
			} catch (IOException ex) {
				//ex.printStackTrace();
			}
			
		}
		return null;
	}


	/**
	 * 
	 * @Description 设置头部信息
	 * @author 汤玉林
	 * @date 2018年3月21日 下午5:01:13
	 * @action setGetHeaders
	 * @param get HttpGet参数
	 * @param maps 请求头参数
	 */
	public static void setGetHeaders(HttpGet get, Map<?, ?>... maps) {
		for (Map<?, ?> map : maps) {
			Iterator<?> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				String next = (String) iterator.next();
				String object = (String) map.get(next);
				if(next.contains("Content-Type")&&object.contains("x-protobuf")){
					object="application/octet-stream";
				}
				get.setHeader(next, object);
			} 
		}
	}
	

	public static void main(String[] args) {
		String url = "http://192.168.0.146:8766/api/Comm/GetOrgInfo?domainUrl=test.holyrobotedu.com";
		Map<String, String> header = new HashMap<String, String>();
		header.put("Content-Type", "application/x-protobuf");
		HttpResponse httpClientGet = httpClientGet(url, header);
		System.out.println(httpClientGet.toString());
	}
}




