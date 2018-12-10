<%--
  Created by IntelliJ IDEA.
  User: joaquinsilva
  Date: 12/10/18
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
//    String userName = (request.getParameter("username") != null) ? request.getParameter("username") : "";
//    String passWord = (request.getParameter("password") != null) ? request.getParameter("password") : "";
//
//    String methodType = request.getMethod();
//
//    if (methodType.equalsIgnoreCase("post")) {
//        if ((userName.equals("admin"))
//                && (passWord.equals("password"))) {
//            response.sendRedirect("profile.jsp");
//        } else {
//            response.sendRedirect("login.jsp");
//        }
//    }



    String userName = (request.getParameter("username"));
    String passWord = (request.getParameter("password"));

    String methodType = request.getMethod();

    if (methodType.equalsIgnoreCase("post")) {
        if (userName != null && passWord != null)
        if ((userName.equals("admin")) && passWord.equals("password")) {
            response.sendRedirect("profile.jsp");
        }
    }

%>


<html>
<head>
    <title>Login</title>
    <style>
        <%@include file="login.css"%>
    </style>
</head>
<body>
    <main>
        <form action="login.jsp" method="POST">
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
</body>
</html>
