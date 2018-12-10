<%--
  Created by IntelliJ IDEA.
  User: joaquinsilva
  Date: 12/10/18
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <style>
        <%@include file="login.css"%>
    </style>
</head>
<body>
    <main>
        <form action="#" method="post">
            <fieldset class="width-80">
                <div class="form-group">
                    <label for="username" class="form-label">Username</label><br>
                    <input type="text" id="username" name="username" class="form-control">
                </div>
                <div class="form-group">
                    <label for="password" class="form-label">Password</label><br>
                    <input type="password" id="password" name="password" class="form-control">
                </div>
                <button class="btn btn-block">Login</button>
            </fieldset>
        </form>
    </main>

    <%--if request.getMethod() == post--%>

<%--<c:when test='${(username == "admin") && password == "password"}'>--%>

<%--</c:when>--%>
</body>
</html>
