package com.holyrobot.common.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *      
 * @Description: Web上下文工具类
 * @author 汤玉林
 * @date 2018年3月22日 上午9:15:14
 */
public class WebContextUtil {	
	  
	/**     
	 * @description 获取HTTP请求    
	 * @author rico       
	 * @created 2017年7月4日 下午5:18:08     
	 * @return     
	 */	
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		return request;
	}
}
