<%--
  Created by IntelliJ IDEA.
  User: Hung_LV
  Date: 7/23/2021
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit page</title>
</head>
<body>
<h1>Edit Information</h1>
<form action="edit" method="post">
    <table>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="emailEdit" value="${user.email}"></td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><input type="text" name="firstNameEdit" value="${user.firstName}"></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastNameEdit" value="${user.lastName}"></td>
        </tr>
        <tr>
            <td><input type="hidden" name="id" value="${user.id}"></td>
            <td><input type="submit" value="Change"></td>
        </tr>
    </table>
</form>
</body>
</html>
