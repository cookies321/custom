package com.holyrobot.common.utils;

import java.util.UUID;

  
/**
 *    
 * @Description: 生成UUID
 * @author 汤玉林
 * @date 2018年3月22日 上午9:12:41
 */
public class CodecUtil {
	
	public static String createUUID(){
		return UUID.randomUUID().toString();
	}
}
