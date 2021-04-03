package com.bobo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huangjiangbo
 * @date 2021-03-28 9:46
 * @description TODO
 */
@Data
@NoArgsConstructor
public class LoginUser {

  private String name;
  private String password;
  private String sex;
  private Integer age;

  public LoginUser(String name){
    this.name=name;
  }
}
