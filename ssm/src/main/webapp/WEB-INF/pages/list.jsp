<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/23
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
    function deleteUser(id){
        //用户安全提示
        if(confirm("您确定要删除吗？")){
            //访问路径
            location.href="${pageContext.request.contextPath}/user/deleteUser?id="+id;
        }
    }

</script>
    </head>
    <body>
    <table>
        <tr>
            <td>编号</td>       `
            <td>姓名</td>
            <td>出生日期</td>
            <td>地址</td>
            <td>性别</td>
        </tr>
    </table>

    <c:forEach items="${list}" var="user">
<tr>
    <td>${user.id}</td>
    <td>${user.username}</td>
    <td>${user.birthday}</td>
    <td>${user.address}</td>
    <td>${user.sex}</td>
    <td> <a href="javascript:deleteUser(${user.id});">删除</a></td>
    <td> <a href="findUserById">修改</a></td>
    <br>
<tr>

    </c:forEach>
</body>
</html>
