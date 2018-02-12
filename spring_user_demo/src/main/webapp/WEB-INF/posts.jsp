<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Posts</title>
</head>
<body>
Posts:

<c:forEach items="${posts}" var="post">
    <h2>${post.title}</h2>
    <p>${post.text}</p>
    Author: <span>${post.user.name} ${post.user.surname}</span>
</c:forEach>

</body>
</html>
