package com.demoexercise.ssm4j.web.dao;

import com.demoexercise.ssm4j.core.generic.GenericMapper;
import com.demoexercise.ssm4j.web.model.User;

/**
 * Created by Chen Zhuo on 2016/7/30.
 */
public interface UserMapper extends GenericMapper<User, Long>{

  User getAllData();

  User getAllDataByDate(int id);

}
