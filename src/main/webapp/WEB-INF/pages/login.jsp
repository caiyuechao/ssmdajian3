<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login" method="post">
    <span style="color: green">${loginErr}</span>
    用户：<input name="userCode" type="text">
    密码：<input name="userPassword" type="password">
    <button type="submit">提交</button>
</form>
</body>
</html>