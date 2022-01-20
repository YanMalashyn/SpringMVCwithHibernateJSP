<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add new User</title>
</head>
<body>
<form:form action="editUserOk" modelAttribute="newUser">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
    Sex <form:select path="sex">
    <form:options items="${newUser.sexs}"/>
    </form:select>
    <br><br>
    Do you have children?
    <form:radiobuttons path="haveChildren" items="${newUser.haveChildrens}"/>
    <br><br>
    PhoneNumber <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    E-male <form:input path="emale"/>
    <form:errors path="emale"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
