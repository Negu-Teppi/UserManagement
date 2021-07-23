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
    <title>Add page</title>
</head>
<body>
    <h1>Add Information</h1>
    <form action="add" method="post">
        <table>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName"></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add"></td>
            </tr>


        </table>
    </form>
</body>
</html>
