<%--
  Created by IntelliJ IDEA.
  User: Chen Zhuo
  Date: 2016/8/8
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    String path = request.getContextPath();
    System.out.println("________________________________________________________");
    System.out.println(path);
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Test!!</title>
</head>
<body>

</body>
</html>
