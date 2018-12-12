<%--
  Created by IntelliJ IDEA.
  User: joaquinsilva
  Date: 12/11/18
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
    <h1>Products</h1>
    <c:forEach items="${ads}" var="ad">
        <div>
            <h3>User ID: ${ad.userId}</h3>
            <h4>Title: ${ad.title}</h4>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</body>
</html>
