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
    <title>edit</title>
</head>
<body>
<form action="/user/edit" method="post">
    <%--用一个隐含域来进行传id--%>
    <input type="hidden" name="id" value="${user.id}">
    <table>
        <lable>用户名：</lable>
        <input type="text" name="name" id="loginName" value="${user.name}"><br>
        <lable>密码：</lable>
        <input type="text" name="password" id="password" value="${user.password}"><br>
        <lable>性别： </lable>
        <input type="radio" name="sex"  value="0" checked="checked"/>male
        <input type="radio" name="sex"  value="1"/>female<br>
        <lable>爱好：</lable>
        <input type="checkbox" name="hobby"  value="game" />游戏
        <input type="checkbox" name="hobby"  value="basketball" />打球
        <input type="checkbox" name="hobby"  value="movie" />电影
        <br>
        <%--选择的这些没有更新，修改的时候--%>
        <lable>专业：</lable>
        <select  name="major">
            <option value="math">数学系</option>
            <option value="computer">计算机</option>
            <option value="english">英语</option>

        </select>
        <br>
        <lable>简介：</lable>
        <textarea name="introduce" cols="30" rows="10">
            ${user.introduce}
        </textarea>
        <input type="submit" value="修改" id="editSubmit">
    </table>

</form>

</body>
</html>
