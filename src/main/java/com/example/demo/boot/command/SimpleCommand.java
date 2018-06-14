package com.example.demo.boot.command;

/**
 * @Description:
 * @Author:tianminghai
 * @Date:下午5:35 2018/6/14
 */
public class SimpleCommand {
  private String code;
  private String name;

  @Override
  public String toString() {
    return "SimpleCommand{" +
      "code='" + code + '\'' +
      ", name='" + name + '\'' +
      '}';
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
