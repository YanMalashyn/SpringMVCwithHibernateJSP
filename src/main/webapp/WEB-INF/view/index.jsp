<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Table of User's</h2>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Manage</th>

    </tr>
    <tr>

        <c:forEach var="user" items="${userList}">
    <tr>
        <td>${user.name}</td>
        <td>${user.surname}</td>
        <td><a href="/${user.id}">More information's and manage</a></td>
    </tr>
    </c:forEach>


</table>


<a href="newUser">Add new user</a>
</body>
</html>
