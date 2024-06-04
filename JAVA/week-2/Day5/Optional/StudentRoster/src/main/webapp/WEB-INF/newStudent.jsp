<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New Student</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container mt-3">
    <h1>New Student</h1>
    <p><a href="${pageContext.request.contextPath}/" class="btn btn-primary">Dashboard</a></p>
    <form:form action="/students/new" modelAttribute="student" method="post">
        <div class="mb-3">
            <form:errors path="name" class="text-danger"/>
            <form:label path="name" for="name" class="form-label">Name:</form:label>
            <form:input path="name" type="text" class="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="dorm" for="dorm" class="form-label">Dorm:</form:label>
            <form:select path="dorm" class="form-select">
                <c:forEach var="dorm" items="${dorms}">
                    <option value="${dorm.id}">${dorm.name}</option>
                </c:forEach>
            </form:select>
        </div>
        <button type="submit" class="btn btn-primary">Add</button>
    </form:form>
</div>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
