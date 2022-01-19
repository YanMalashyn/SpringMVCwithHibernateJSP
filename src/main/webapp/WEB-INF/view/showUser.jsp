<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show User</title>
</head>
<body>

Name: ${newUser.name}
<br>
Surname: ${newUser.surname}
<br>
Age: ${newUser.age}
<br>
Sex: ${newUser.sex}
<br>
Children: ${newUser.haveChildren}
<br>
Language:
<ul>
    <c:forEach var="lang" items="${newUser.language}">
        <li>${lang}</li>
    </c:forEach>
</ul>
PhoneNumber: ${newUser.phoneNumber}
<br>
E-male: ${newUser.emale}
</body>
</html>
