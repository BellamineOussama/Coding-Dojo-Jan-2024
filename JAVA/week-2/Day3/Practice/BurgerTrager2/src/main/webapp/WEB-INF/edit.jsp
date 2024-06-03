<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 31/05/2024
  Time: 11:23
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
    <title>Edit Burger</title>
</head>
<body>
<div class="container mt-3">
    <div class="d-flex justify-content-between align-items-center" style="padding: 10px 0;">
        <h1 class="text-center" style="flex-grow: 1; margin: 0; color: #343a40; font-size: 24px;">Add a Burger</h1>
        <a href="${pageContext.request.contextPath}/" style="color: #007bff; text-decoration: none; font-size: 16px;">Go Back</a>
    </div>
    <form:form action="/update/${burger.id}" method="put" modelAttribute="burger" class="mt-3 form-horizontal">
        <div class="mb-3 form-group">
            <form:label path="nameOfBurger" cssClass="form-label">Burger Name</form:label>
            <form:input path="nameOfBurger" cssClass="form-control"/>
            <form:errors path="nameOfBurger" cssClass="text-danger text-nowrap"/>
        </div>
        <div class="mb-3 form-group">
            <form:label path="restaurant" cssClass="form-label">Restaurant Name</form:label>
            <form:input path="restaurant" cssClass="form-control"/>
            <form:errors path="restaurant" cssClass="text-danger text-nowrap"/>
        </div>
        <div class="mb-3 form-group">
            <form:label path="rating" cssClass="form-label">Rating</form:label>
            <form:input path="rating" type="number" cssClass="form-control"/>
            <form:errors path="rating" cssClass="text-danger text-nowrap"/>
        </div>
        <div class="mb-3 form-group">
            <form:label path="notes" cssClass="form-label">Notes</form:label>
            <form:textarea path="notes" cssClass="form-control"/>
            <form:errors path="notes" cssClass="text-danger text-nowrap"/>
        </div>
        <div class="text-center">
            <input type="submit" value="Submit" class="btn btn-submit mt-3">
        </div>
    </form:form>
</div>


<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
