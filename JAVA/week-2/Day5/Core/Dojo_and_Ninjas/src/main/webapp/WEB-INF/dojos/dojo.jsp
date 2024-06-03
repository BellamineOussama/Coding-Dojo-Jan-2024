<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 02/06/2024
  Time: 21:31
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
<div class="container">
    <h1>New Ninja 🥷</h1>
    <hr/>
    <form:form action="${pageContext.request.contextPath}ninjas/dojo/{dojoId}" method="post" modelAttribute="dojo" class="mt-3">
        <div class="mb-3">
            <form:label path="name" cssClass="form-label"> Name:</form:label>
            <form:errors path="name" cssClass="text-danger"/>
            <form:input path="name" cssClass="form-control"/>
        </div>
        <div class="text-center">
            <input type="submit" value="Create" class="btn btn-primary btn-submit mt-3">
        </div>
    </form:form>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
