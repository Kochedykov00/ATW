<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 28.10.2019
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
%
session.invalidate();
response.sendRedirect("login.jsp");
%
</body>
</html>
