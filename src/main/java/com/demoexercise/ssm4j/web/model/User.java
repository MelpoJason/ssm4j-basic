package com.demoexercise.ssm4j.web.model;

import java.sql.Date;
import java.sql.JDBCType;

/**
 * Created by Chen Zhuo on 2016/7/30.
 */
public class User {
  private int _id;
  private String _name;
  private String _password;
  private String _email;
  private boolean state;
  private Date createDate;
  private String context;

  public User() {
  }

  public User(int _id, String _name, String _password, String _email, boolean state, Date createDate, String context) {
    this._id = _id;
    this._name = _name;
    this._password = _password;
    this._email = _email;
    this.state = state;
    this.createDate = createDate;
    this.context = context;
  }

  public int get_id() {
    return _id;
  }

  public void set_id(int _id) {
    this._id = _id;
  }

  public String get_name() {
    return _name;
  }

  public void set_name(String _name) {
    this._name = _name;
  }

  public String get_password() {
    return _password;
  }

  public void set_password(String _password) {
    this._password = _password;
  }

  public String get_email() {
    return _email;
  }

  public void set_email(String _email) {
    this._email = _email;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  @Override
  public String toString() {
     return "User [id=" + _id + ", username=" + _name + ", context=" + context + ", state=" + state + ", createTime=" + createDate.toString() + "]";
  }
}
