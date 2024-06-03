<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 27/05/2024
  Time: 08:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}./css/result.css">
    <title>Title</title>
</head>
<body>
<div class="container">
    <div>
        <h1>Here's Your Omikuji!</h1>
    </div>
    <div class="response">
        <p>In <c:out value="${sessionScope.number}"/>years, you will</p>
        <p>live in <c:out value="${sessionScope.city}"/> with <c:out value="${sessionScope.person}"/> as your roommate,</p>
        <p><c:out value="${sessionScope.profession}"/> for living.</p>
        <p>The next time you see a <c:out value="${sessionScope.living}"/>,</p>
        <p>you will have good luck.</p>
        <p>Also,<c:out value="${sessionScope.nice}"/></p>
    </div>
    <div class="link">
        <a href="/omikuji">Go Back</a>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
