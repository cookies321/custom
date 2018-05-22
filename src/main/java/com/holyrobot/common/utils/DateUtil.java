/** 
 * Project Name:holyrobot-common 
 * File Name:DateUtil.java 
 * Package Name:com.jingjie.common.utils 
 * Date:2018年3月27日 下午3:35:55 
 * author 汤玉林
 */ 
package com.holyrobot.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月27日 下午3:35:55 
 */
public class DateUtil {
	static SimpleDateFormat simpleDateFormat;
	
	public static String DateToString(Date source, String pattern) {
		simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(source);
    }
	
	public static Date stringToDate(String source, String pattern) {
        simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(source);
        } catch (Exception e) {
        }
        return date;
    }
	
	public static void main(String[] args) {
	}
}
