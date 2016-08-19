<%--
  Created by IntelliJ IDEA.
  User: Chen Zhuo
  Date: 2016/8/15
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head >
    <base href="<%=basePath%>">
    <title>404 Not Found</title>
</head>
<body>
        <h1>NOT FOUND!</h1>
</body>
</html>
