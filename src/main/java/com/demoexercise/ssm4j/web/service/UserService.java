package com.demoexercise.ssm4j.web.service;

import com.demoexercise.ssm4j.core.generic.GenericService;
import com.demoexercise.ssm4j.web.model.User;

/**
 * Created by Chen Zhuo on 2016/8/8.
 */
public interface UserService extends GenericService<User, Integer> {
  /**
   * 用户查询方法
   * @return
   */
  User getAllData();
}
