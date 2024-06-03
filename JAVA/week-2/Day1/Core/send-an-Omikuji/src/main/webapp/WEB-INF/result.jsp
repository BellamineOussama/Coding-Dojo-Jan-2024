<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 28/05/2024
  Time: 01:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}./css/result.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Result From</title>
</head>
<body>
<div class="container">
    <div class="result">
        <h1>Here's your Omikuji!</h1>
        <p>In <c:out value="${sessionScope.number}"/> years, you will</p>
        <p>live in <c:out value="${sessionScope.city}"/> with <c:out value="${sessionScope.person}"/> as your roommate,</p>
        <p><c:out value="${sessionScope.hobby}"/> for living.</p>
        <p>The next time you see a <c:out value="${sessionScope.living}"/>, you will have good luck.</p>
        <p>Also, <c:out value="${sessionScope.someone}"/></p>
    </div>
    <a href="${pageContext.request.contextPath}/omikuji">Go Back</a>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
