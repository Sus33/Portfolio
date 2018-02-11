<%@ page import="model.User" %>
<%@ page import="model.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<% User user = (User) session.getAttribute("user");%>
Hello<%=user.getName()%>

<div style="width: 1000px">
    <div style="width: 500px;float: left;">
        <h2>Add Book</h2>
          <%
              if (request.getAttribute ("errMesage") != null) {
          %>
        <span style="color: red"><%=request.getAttribute("errMessage")%></span>
        <%}%>
        <%
            if (request.getAttribute ("info") != null) {
        %>
        <span style="color: red"><%=request.getAttribute("info")%></span>
        <%}%>
        <form action="/addBook" method="post">
            Name:<br/><input type="text" name="name"/><br>
            Author:<br/><input type="text" name="author"/><br>
            Price:<br/><input type="number" name="price"/><br>
            Description:<br/><textarea name="description"></textarea><br/>
            <input type="submit"/>
        </form>
        <a href="index.jsp.jsp">Login</a>
    </div>
    <div style="width: 500px; float: left;">
        <table border="1">
            <tr><th>Book Name</th></tr>
            <%
                if (request.getAttribute ("userBooks") != null) {
                    ArrayList<Book> userBooks = (ArrayList<Book>)
                            request.getAttribute ("userBooks");
                    for (Book userBook : userBooks) {
                        %>
            <tr>
                <td><%=userBook.getName()%>
                </td>
            </tr>
            <%
                    }
                }
            %>

        </table>

    </div>
</div>
</body>
</html>
