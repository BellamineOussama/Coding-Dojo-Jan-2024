<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 04/06/2024
  Time: 07:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="container mt-3">
    <h1>Welcome, <c:out value="${user.userName}!"/></h1>
    <p> <strong> This is your dashboard.  Nothing to see here yet.</strong></p>
    <a href="${pageContext.request.contextPath}/" class="btn btn-danger btn-sm w-25">Logout</a>
</div>


<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
