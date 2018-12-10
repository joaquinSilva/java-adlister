<%--
  Created by IntelliJ IDEA.
  User: joaquinsilva
  Date: 12/10/18
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Your name is: ${param.name}</h1>
    <h1>Your age is: ${param.age}</h1>


    <h2>Username = ${user.name}</h2>
    <p>User Age = ${user.age}</p>
    <p>User Email = ${user.email}</p>


    <h3>User status: ${userRoleMessage}</h3>
</body>
</html>
