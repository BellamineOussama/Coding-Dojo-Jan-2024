<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><c:out value="${dorm.name}"/> Students</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container mt-3">
    <h1><c:out value="${dorm.name}"/> Students</h1>
    <p><a href="${pageContext.request.contextPath}/" class="btn btn-primary">Dashboard</a></p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Student</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td><c:out value="${student.name}"/></td>
                <td><a href="/students/remove/${student.id}" class="btn btn-danger">Remove</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
