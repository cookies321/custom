package com.holyrobot.common.utils;

import java.util.Collection;

  
/**     
 * 
 * @Description: 集合工具类
 * @author 汤玉林
 * @date 2018年3月22日 上午9:12:22
 */
public class CollectionUtil {
	public static boolean isNotEmpty(Collection<?> c){
		if (c != null && c.size() != 0 ) {
			return true;
		}
		return false;
	}
}
