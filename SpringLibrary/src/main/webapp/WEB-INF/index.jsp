<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
All Users:
<ul>
    <c:forEach items="${users}" var="user">
        <img src="/image?fileName=${user.picUrl}" width="30"/>
        <li>${user.name} ${user.surname} <a href="/deleteUser?id=${user.id}">x</a></li>
    </c:forEach>
</ul>

Add User:
<span style="color: red">${message}</span>
<spring:form action="/addUser" modelAttribute="user" method="post" enctype="multipart/form-data">
    <spring:input path="name" title="name"/><br>
    <spring:input path="surname" title="surname"/><br>

    <input type="file" name="picture">
    <input type="submit" value="Save"/>
</spring:form>


</body>
</html>
