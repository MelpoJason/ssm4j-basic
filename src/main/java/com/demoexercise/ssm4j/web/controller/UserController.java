package com.demoexercise.ssm4j.web.controller;

import com.demoexercise.ssm4j.web.model.User;
import com.demoexercise.ssm4j.web.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Chen Zhuo on 2016/8/8.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
  @Resource
  private UserService userService;



  /**
   * 用户登录
   *
   * @param user
   * @param result
   * @return
   */
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
    try {
      Subject subject = SecurityUtils.getSubject();
      // 已登陆则 跳到首页
      if (subject.isAuthenticated()) {
        return "redirect:/";
      }
      if (result.hasErrors()) {
        model.addAttribute("error", "参数错误！");
        return "login";
      }
      final User allUser = userService.getAllData();
      request.getSession().setAttribute("userInfo", allUser);
    } catch (AuthenticationException e) {
      // 身份验证失败
      model.addAttribute("error", "用户名或密码错误 ！");
      return "login";
    }
    return "redirect:/";
  }
}
