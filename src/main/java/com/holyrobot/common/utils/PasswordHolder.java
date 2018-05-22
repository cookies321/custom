package com.holyrobot.common.utils;

/**
 * 
 * @Description: 密码实体类
 * @author 汤玉林
 * @date 2018年3月15日 上午10:00:02
 */
public class PasswordHolder {
  public String password;
  public String salt;

  public PasswordHolder(String password, String salt) {
    this.password = password;
    this.salt = salt;
  }
}
