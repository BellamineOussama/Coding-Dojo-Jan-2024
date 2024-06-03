<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 01/06/2024
  Time: 03:27
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
    <title>Show Expense</title>
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-header bg-dark text-white d-flex justify-content-between ">
            <h1 class="card-title mb-0 text-primary">Expense Details</h1>
            <a href="${pageContext.request.contextPath}/expenses" style="color: #007bff; text-decoration: none; font-size: 16px;">Go Back</a>
        </div>
        <div class="card-body">
            <ul class="list-group">
                <li class="list-group-item"><strong>Expense Name:</strong>  <c:out value="${travel.expense}"/></li>
                <li class="list-group-item"><strong>Expense Description:</strong>  <c:out value="${travel.description}"/></li>
                <li class="list-group-item"><strong>Vendor:</strong>  <c:out value="${travel.vendor}"/></li>
                <li class="list-group-item"><strong>Amount Spent:</strong>  <c:out value="${travel.amount}"/></li>
            </ul>
        </div>
    </div>
</div>



<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
