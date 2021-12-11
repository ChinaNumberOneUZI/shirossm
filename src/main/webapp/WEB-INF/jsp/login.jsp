<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <style>
        .a{
            font-size: 12px;
            color: red;
        }
    </style>
</head>
<body>
<form action="login" method="post">
   <p class="a"> ${map.msg}</p>
账号：<input type="text" name="username"/><br/>
密码：<input type="password" name="password"/><br/>
    <input type="submit"/>

</form>
</body>
</html>
