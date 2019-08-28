<%--
  Created by IntelliJ IDEA.
  User: saipavanmaram
  Date: 2019-08-27
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>User Register Page</h2>

<form action="userDetails" method="GET">
    User name:<br>
    <input type="text" name="username"><br>
    password:<br>
    <input type="password" name="password">
    <br>
    <input type="button" name="register"  value="Register" onclick="register()">
</form>
</body>
</html>
