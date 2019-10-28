<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27.10.2019
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="LoginRegister" method="post">
    <table>

        <tr><td> <h3>${message}</h3>
            <h3>${SuccessMessage}</h3>
        </td>
            <td></td>
        </tr>

        <td>
        <td> UserName :</td>
        <td><input type="text" name="name"></td>
        </tr>


        <tr>
        <td> Password :</td>
        <td><input type="password" name="password"></td>
        <td><input type="submit" name="submit" value="login"></td><td><a href="register.jsp">Login</a></td>
            <a href="http://localhost:8080/AroundTheWorld/register.jsp">Register</a>
        </tr>

    </table>
</form>

</body>
</html>
