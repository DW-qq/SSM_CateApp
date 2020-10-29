<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/19
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>支付页面</title>

</head>
<body>
<h2>请扫码支付</h2>
<img src="/wxpay/doPay/1">
</body>
<script type="text/javascript" src="http://cdn-hangzhou.goeasy.io/goeasy.js"></script>
<script type="text/javascript">
    var goEasy = new GoEasy({
        appkey: "BC-cb5debe56ddc447781555fd78863b3b2",//替换为您的应用appkey
    });
    goEasy.subscribe({
        channel:'name',
        onMessage:function (message) {
            console.log("收到1"+message.content)
            if(message.content=='你好'){
                console.log("成功")
                location.href='./success.jsp'
            }
        }
    });
</script>

</html>
