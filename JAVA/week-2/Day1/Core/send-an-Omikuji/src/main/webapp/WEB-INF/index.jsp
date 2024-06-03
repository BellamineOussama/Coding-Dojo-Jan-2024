<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 28/05/2024
  Time: 00:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}./css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Omikuji Form</title>
</head>
<body>
<div class="container">
    <div class="form-container">
        <h1 class="text-center">Send an Omikuji!</h1>
        <form action="${pageContext.request.contextPath}/send" METHOD="post">
            <div class="form-group mb-3">
                <label for="number" class="form-label">Pick any number from 5 to 25:</label>
                <select id="number" name="number" class="form-select">
                    <c:forEach begin="5" end="25" var="i">
                        <option value="${i}">${i}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group mb-3">
                <label for="city" class="form-label">Enter the name of any city:</label>
                <input id="city" name="city" type="text" class="form-control">
            </div>
            <div class="form-group mb-3">
                <label for="person" class="form-label">Enter the name of any real person:</label>
                <input id="person" name="person" type="text" class="form-control">
            </div>
            <div class="form-group mb-3">
                <label for="hobby" class="form-label">Enter professional endeavor or hobby:</label>
                <input id="hobby" name="hobby" type="text" class="form-control">
            </div>
            <div class="form-group mb-3">
                <label for="living" class="form-label">Enter any type of living thing:</label>
                <input id="living" name="living" type="text" class="form-control">
            </div>
            <div class="form-group mb-3">
                <label for="someone" class="form-label">Say something nice to someone:</label>
                <textarea id="someone" name="someone" class="form-control"></textarea>
            </div>
            <div class="text-center mb-3">
                <p>Send and show a friend</p>
            </div>
            <div class="form-group text-center">
                <input type="submit" class="btn btn-primary" value="Send">
            </div>
        </form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
