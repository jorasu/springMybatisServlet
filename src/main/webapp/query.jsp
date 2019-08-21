<%--
  Created by IntelliJ IDEA.
  User: jora
  Date: 2019/5/7
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>查询全部学生信息</title>
</head>
<body>
    <form method="post" action="">
        <table>
            <tr>
                <th>学号</th>
                <th>密码</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年级</th>
                <th>电话</th>
                <th>地址</th>
                <th>出生日期</th>
                <th>邮箱</th>
                <th>身份证号</th>
            </tr>

            <c:forEach var="s"  items="${students}">
                <tr>
                    <td>${s.studentno}</td>
                    <td>${s.studentname}</td>
                    <td>${s.sex}</td>
                    <td>${s.gradeid}</td>
                    <td>${s.phone}</td>
                    <td>${s.address}</td>
                    <td>${s.email}</td>
                    <td>${s.identitycard}</td>

                </tr>
            </c:forEach>
        </table>

    </form>

</body>
</html>

