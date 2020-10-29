<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/2
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script>
        function tj() {
            window.location.href="/userController/addUser"
        }
    </script>
</head>
<body>
<%--<input type="button" value="提交" onclick="tj()">
<img src="${user.uheadePhoto}">
<h2>${message}</h2>--%>
<body>
<form action="/userController/add" method="post" enctype="multipart/form-data">
    <input placeholder="用户名" name="name"><br>
    <input placeholder="密码" name="pwd"><br>
    头像:<input type="file" name="file"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
