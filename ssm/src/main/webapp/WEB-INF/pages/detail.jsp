<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/24
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    编号:<input type="hidden" name="id" id="id" value="${user.id}"><br>
    姓名:<input type="text" name="username" id="username" value="${user.username}"><br>
    出生日期:<input type="date" name="birthday" id="birthday" value="${user.birthday}"><br>
    地址:<input type="text" name="address" id="address" value="${user.address}"><br>
    性别:<input type="text" name="sex" id="sex" value="${user.sex}"><br>
    <input type="submit" value="保存">
    <input type="reset" value="重置">
</form>
</body>
</html>
