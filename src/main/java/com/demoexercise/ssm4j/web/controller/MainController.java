package com.demoexercise.ssm4j.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Chen Zhuo on 2016/8/15.
 */
@Controller
@RequestMapping("/page")
public class MainController {
  /**
   * 登录页
   */
  @RequestMapping("/login")
  public String login() {
    return "login";
  }

  /**
   * 404页
   */
  @RequestMapping("/404")
  public String error404() {
    return "404";
  }

  /**
   * 401页
   */
  @RequestMapping("/401")
  public String error401() {
    return "401";
  }

  /**
   * 500页
   */
  @RequestMapping("/500")
  public String error500() {
    return "500";
  }

}
