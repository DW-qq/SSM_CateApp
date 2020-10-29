<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/28
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
   <script>
       function a() {
           console.log("aaaa")
         document.getElementById("dx").herf="/userController/toDx/"+document.getElementById("telephone").value;
       }
   </script>
</head>
<body>
请输入手机号码：<input id="telephone" type="text" name="telephone"><a href="#"  id="dx" onclick="a()" >获取验证码</a><br>
请输入验证码：<input name="yz" id="yz" type="text"><br>
<button type="button" id="drBtn"></button>
</body>
</html>
