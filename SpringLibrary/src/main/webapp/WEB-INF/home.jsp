<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
Books:

<c:forEach items="${books}" var="book">
    <h2>${book.title}</h2>
    <p>${book.text}</p>
    User: <span>${book.user.name} ${book.user.surname}</span>
</c:forEach>

</body>
</html>
