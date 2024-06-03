<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 31/05/2024
  Time: 21:46
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
    <title>Edit Expense</title>
</head>
<body>
<div class="container mt-3">
    <div class="d-flex justify-content-between align-items-center" style="padding: 10px 0;">
        <h1 class="text-center" style="flex-grow: 1; margin: 0; color: #343a40; font-size: 24px;">Edit Expense</h1>
        <a href="${pageContext.request.contextPath}/expenses" style="color: #007bff; text-decoration: none; font-size: 16px;">Go Back</a>
    </div>
    <form:form action="/expenses/edit/${travel.id}" method="put" modelAttribute="travel" class="mt-3 form-horizontal">
        <div class="mb-3 form-group">
            <form:label path="expense" cssClass="form-label">Expense Name:</form:label>
            <form:errors path="expense" cssClass="text-danger text-nowrap"/>
            <form:input path="expense" cssClass="form-control"/>
        </div>
        <div class="mb-3 form-group">
            <form:label path="vendor" cssClass="form-label">Vendor:</form:label>
            <form:errors path="vendor" cssClass="text-danger text-nowrap"/>
            <form:input path="vendor" cssClass="form-control"/>
        </div>
        <div class="mb-3 form-group">
            <form:label path="amount" cssClass="form-label">Amount:</form:label>
            <form:errors path="amount" cssClass="text-danger text-nowrap"/>
            <form:input path="amount" type="double" cssClass="form-control"/>
        </div>
        <div>
            <form:label path="description" cssClass="form-label">Description:</form:label>
            <form:errors path="description" cssClass="text-danger text-nowrap"/>
            <form:textarea path="description"  cssClass="form-control"/>
        </div>
        <div class="text-center">
            <input type="submit" value="Submit" class="btn btn-submit mt-3">
        </div>
    </form:form>
</div>


<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
