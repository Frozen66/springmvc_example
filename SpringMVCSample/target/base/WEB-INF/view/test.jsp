<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/10/30
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${hello.name}
<%--action就是对应controller里边的方法--%>
<form action="/user/login" method="post">
    <p>用户名：<input type="text" name="userName" value=""/></p>
    <p>密码： <input type="password" name="password" value=""/></p>
    <p><input type="submit" value="登陆"></p>
</form>
</body>
</html>
