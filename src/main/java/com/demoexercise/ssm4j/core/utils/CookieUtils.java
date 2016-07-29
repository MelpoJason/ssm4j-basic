package com.demoexercise.ssm4j.core.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * the usage of this class is to help browsers set basic cookies settings.
 * Created by Chen Zhuo on 2016/7/19.
 *
 * @since 17:16
 */
public class CookieUtils {

  public static Cookie setCookie(HttpServletResponse httpServletResponse, String name, String value, String path, int duration) {

    return addCookies(httpServletResponse, name, value, path, duration);

  }

  private static Cookie addCookies(HttpServletResponse httpServletResponse, String name, String value, String path, int duration) {
    Cookie cookie = null;
    try {
      cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
      cookie.setMaxAge(duration);
      if (null != path) {
        cookie.setPath(path);
      }
      httpServletResponse.addCookie(cookie);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return cookie;
  }
}
