package com.demoexercise.ssm4j.web.service.Instance;

import com.demoexercise.ssm4j.core.generic.GenericMapper;
import com.demoexercise.ssm4j.core.generic.GenericServiceInstance;
import com.demoexercise.ssm4j.web.model.User;
import com.demoexercise.ssm4j.web.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Chen Zhuo on 2016/8/9.
 */
@Service
public class UserServiceInstance extends GenericServiceInstance<User, Integer> implements UserService {

  @Override
  public GenericMapper<User, Integer> getDao() {
    return null;
  }

  @Override
  public User selectedById(Integer integer) {
    return null;
  }

  @Override
  public int insert(User user) {
    return 0;
  }

  @Override
  public int update(User user, Integer integer) {
    return 0;
  }

  @Override
  public int delete(Integer integer) {
    return 0;
  }

  @Override
  public User getAllData() {
    return null;
  }
}
