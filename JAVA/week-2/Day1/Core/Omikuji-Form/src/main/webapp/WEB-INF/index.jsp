<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 27/05/2024
  Time: 02:22
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
<body>
<div class="container">
    <h1 class="mb-3">Send an Omikuji!</h1>
    <div class="form">
        <form action="${pageContext.request.contextPath}/send" method="post">
            <div class="form-group">
                <div class="mb-1">
                    <label for="number">Pick any number from 5 to 25:</label>
                    <select class="form-select select" id="number" name="number">
                        <c:forEach begin="5" end="25" var="i">
                            <option value="${i}">${i}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="mb-1">
                    <label for="city">Enter the name of any city:</label>
                    <input type="text" class="form-control" id="city" name="city">
                </div>
                <div class="mb-1">
                    <label for="person">Enter the name of any real person:</label>
                    <input type="text" class="form-control" id="person" name="person">
                </div>
                <div class="mb-1">
                    <label for="profession">Enter professional endeavor or hobby:</label>
                    <input type="text" class="form-control" id="profession" name="profession">
                </div>
                <div class="mb-1">
                    <label for="living">Enter any type of living thing :</label>
                    <input type="text" class="form-control" id="living" name="living">
                </div>
                <div class="mb-1">
                    <label for="nice">Say something nice to someone:</label>
                    <textarea class="form-control" id="nice" name="nice"></textarea>
                </div>
                <div class="mb-1">
                    <p>Send and show a friend</p>
                </div>
                <div class="button">
                    <input type="submit" class="btn btn-primary" value="Send">
                </div>
            </div>
        </form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
