<%--
  Created by IntelliJ IDEA.
  User: 断魂
  Date: 2021/12/9
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<ul>
    <s:hasRole name="管理员">
        <li><a href="user/userList">用户管理</a></li>
    </s:hasRole>
</ul>

</body>
</html>
