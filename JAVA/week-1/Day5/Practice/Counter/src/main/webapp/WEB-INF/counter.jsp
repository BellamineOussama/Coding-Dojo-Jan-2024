<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 26/05/2024
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}./css/style.css">
    <title>Title</title>
</head>
<body class="bg-light">
    <div class="container py-5">
        <p class="lead">You have visited <a href="<c:url value="/"/>">http://localhost:8080</a> <c:out value="${count}" /> times.</p>
        <a href="<c:url value="/"/>">Test another visit?</a>
    </div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
