<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        th{
            text-align: left;
        }
        th, td{
            width: 150px;
        }
    </style>
</head>
<body>
    <h1 style="color: aqua">User Management</h1>

    <a href="addpage.jsp">
        <button>Add</button>
    </a>
    <table>
        <tr>
            <th>Email</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>

        <c:forEach var="user" items="${userList}">
            <tr>
                <td>${user.email}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td><a href="./change?id=${user.id}">edit</a></td>
                <td><a href="./delete?id=${user.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>