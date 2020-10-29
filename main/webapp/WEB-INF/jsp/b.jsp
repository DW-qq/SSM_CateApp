<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/2
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user}==aaa
${message}
<br>
<h2>
    ${list}
</h2>

<c:forEach  var="user" items="${list}">

111===<img src="../img/${user.uheadePhoto}"><br>
</body>

</c:forEach>
</body>
</html>
