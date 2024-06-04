<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dorms</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container mt-3">
    <h1>Dorms</h1>
    <p><a href="${pageContext.request.contextPath}/dorms/new" class="btn btn-primary">Add a new dorm</a></p>
    <p><a href="${pageContext.request.contextPath}/students/new" class="btn btn-primary">Add a new student</a></p>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Dorm</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="dorm" items="${dorms}">
            <tr>
                <td><c:out value="${dorm.name}"/></td>
                <td><a href="/dorms/${dorm.id}" class="btn btn-info">See Students</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
