<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add new User</title>
</head>
<body>
<form:form action="showUser" modelAttribute="newUser">

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <br><br>
    Sex <form:select path="sex">
    <form:options items="${newUser.sexs}"/>
    </form:select>
    <br><br>
    Do you have children?
    <form:radiobuttons path="haveChildren" items="${newUser.haveChildrens}"/>
    <br><br>
    Known languages?
    <form:checkboxes path="language" items="${newUser.languages}"/>
    <br><br>
    PhoneNumber <form:input path="phoneNumber"/>
    <br><br>
    E-male <form:input path="emale"/>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>
</html>
