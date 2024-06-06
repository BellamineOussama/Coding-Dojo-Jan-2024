<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 04/06/2024
  Time: 03:17
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <!-- Include Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <title>Login-Registration</title>
</head>
<body>
<div class="container">
    <h1>🗝 Authentication  ️</h1>
    <hr/>
    <div class="auth-container">
        <!-- REGISTER A NEW USER -->
        <div class="auth-form">
            <h3 class="text-primary text-center">Register</h3>
            <br/>
            <form:form action="/register" method="post" modelAttribute="newUser">
                <div class="form-group mb-3">
                    <form:label path="userName" class="form-label">User Name</form:label>
                    <form:input path="userName" class="form-control"/>
                    <form:errors path="userName" class="text-danger"/>
                </div>
                <div class="form-group mb-3">
                    <form:label path="email" class="form-label">Email</form:label>
                    <form:input path="email" class="form-control"/>
                    <form:errors path="email" class="text-danger"/>
                </div>
                <div class="form-group mb-3">
                    <form:label path="password" class="form-label">Password</form:label>
                    <form:input path="password" type="password" class="form-control"/>
                    <form:errors path="password" class="text-danger"/>
                </div>
                <div class="form-group mb-3">
                    <form:label path="confirm" class="form-label">Confirm Password</form:label>
                    <form:input path="confirm" type="password" class="form-control"/>
                    <form:errors path="confirm" class="text-danger"/>
                </div>
                <div class="text-center">
                    <input type="submit" value="Register" class="btn btn-primary btn-submit mt-3">
                </div>
            </form:form>
        </div>

        <!-- LOGIN -->
        <div class="auth-form">
            <h3 class="text-success text-center">Login</h3>
            <br/>
            <form:form action="/login" method="post" modelAttribute="newLogin">
                <div class="form-group mb-3">
                    <form:label path="email" class="form-label">Email</form:label>
                    <form:input path="email" class="form-control"/>
                    <form:errors path="email" class="text-danger"/>
                </div>
                <div class="form-group mb-3">
                    <form:label path="password" class="form-label">Password</form:label>
                    <form:input path="password" type="password" class="form-control"/>
                    <form:errors path="password" class="text-danger"/>
                </div>
                <div class="text-center">
                    <input type="submit" value="Login" class="btn btn-success btn-submit mt-3">
                </div>
            </form:form>
        </div>


    </div>
</div>


<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
