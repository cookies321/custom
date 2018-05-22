package com.holyrobot.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 
 * @Description: 获取异常堆栈信息
 * @author 汤玉林
 * @date 2018年3月22日 上午9:13:11
 */
public class ExceptionUtil {

	/**
	 * 获取异常的堆栈信息
	 * 
	 * @param t
	 * @return
	 */
	public static String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		try {
			t.printStackTrace(pw);
			return sw.toString();
		} finally {
			pw.close();
		}
	}
}
