<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>姓名：${sessionScope.loginUser.userName}</h2>
<table border="1">
    <tr>
        <th>${sessionScope.loginUser.userName}</th>
        <th>${sessionScope.loginUser.birthday}</th>
        <th>${sessionScope.loginUser.address}</th>

    </tr>
    <tr>
        <td>January</td>
        <td>$100</td>
    </tr>
</table>
</body>
</html>
