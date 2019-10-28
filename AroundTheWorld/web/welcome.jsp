<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27.10.2019
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    request.getSession(false);
    if (session == null) { %>
<a href="http://localhost:8080/AroudTheWorld/login.jsp">Login</a>
<%
} else {
%>
<a href="http://localhost:8080/AroundTheWorld/logout.jsp">Logout</a><%
    }
    String name = request.getParameter("name");
%>
<br><br>
<%
    out.println("Welcome: " + name);
%>


</body>
</html>
