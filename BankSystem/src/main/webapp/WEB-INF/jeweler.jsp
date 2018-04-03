<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DEVELOPER
  Date: 06.03.2018
  Time: 0:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jewelerHome</title>
</head>
<body>
Add Citizen:
<spring:form action="/addCitizen" method="get" modelAttribute="citizen">
    Name: <spring:input path="name"></spring:input><br>
    Surname: <spring:input path="surname"></spring:input><br>
    Email:<spring:input path="email"></spring:input><br>
    Phone:<spring:input path="phone"></spring:input><br>
    <input type="submit" value="ADD">
</spring:form>
    Add Gold:
    <spring:form action="/addGold" method="post" modelAttribute="gold" enctype="multipart/form-data">
        Citizen ID <spring:input path="citizen"></spring:input><br>
        Type: <spring:select path="goldType">
        <option>GOLD</option>
        <option>WHITE_GOLD</option>
    </spring:select><br>
        Whole <spring:input path="whole"></spring:input><br>
        Price <spring:input path="price"></spring:input><br>
        Image <input type="file" id="image" name="image"/><br>

        <input type="submit" value="ADD">
    </spring:form>

    </body>
    </html>
