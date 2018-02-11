<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Create new account</title>
</head>
<body>
<% if(request.getAttribute("errMessage") != null){
%>
<span style="color:red"><%=request.getAttribute("errMessage")%></span>
<%}%>
<form action="/register" method="post">
  Name:<input type="text" name="name"/><br>
  Surename:<input type="text" name="surename"/><br>
  Email:<input type="text" name="email"/><br>
  Gender: Male<input type="radio" name="gender" value="male"/>
  Female:<input type="radio" name="gender" value="female"/><br/>
  Password:<input type="password" name="password"/><br/>
  Re-Password:<input type="password" name="repassword"/><br/>
  <input type="submit"/>
</form>
<a href="index.jsp.jsp">Login</a>

</body>
</html>
