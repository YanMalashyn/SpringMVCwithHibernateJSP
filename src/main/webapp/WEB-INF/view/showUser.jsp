<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show User</title>
</head>
<body>
<h2>User Information's </h2>

Id: ${newUser.id}
<br>
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
PhoneNumber: ${newUser.phoneNumber}
<br>
E-male: ${newUser.emale}
<br>
<a href="/${newUser.id}/edit">Manage User</a>
<br>
<a href="/${newUser.id}/delete">Delete User</a>
<br>
<a href="/">To table User's</a>
</body>
</html>
