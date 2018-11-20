<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/10/16
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>register</title>
</head>
<body>
<form action="/user/processRegister" method="post" >
    <table>
    <lable>用户名：</lable>
        <input type="text" name="name" id="loginName"><br>
    <lable>密码：</lable>
        <input type="text" name="password" id="password"><br>
    <lable>确认密码：</lable>
        <input type="text" name="affirmPassword" id="affirmPassword"><br>
    <lable>性别： </lable>
        <input type="radio" name="sex"  value="0" checked="checked"/>male
        <input type="radio" name="sex"  value="1"/>female<br>
    <lable>爱好：</lable>
        <input type="checkbox" name="hobby"  value="game" />游戏
        <input type="checkbox" name="hobby"  value="basketball" />打球
        <input type="checkbox" name="hobby"  value="movie" />电影
        <br>
     <lable>专业：</lable>
        <select  name="major">
            <option value="math">数学系</option>
            <option value="computer">计算机</option>
            <option value="english">英语</option>

        </select>
        <br>
     <lable>简介：</lable>
        <textarea name="introduce" cols="30" rows="10">请写至少50个字符</textarea>
     <input type="submit" value="注册" id="registerSubmit">
    </table>

</form>

</body>
</html>
