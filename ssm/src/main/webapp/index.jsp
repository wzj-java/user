<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/findAll">搜索所有</a>
<form method="post" action="user/save">
    姓名:<input type="text" name="username"><br>
    性别:<input type="text" name="sex"><br>
    地址:<input type="text" name="address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
