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
    <title>Dojo Details</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <h1 class="text-center"> 🥷 ${dojo.name} Ninjas 🥷 </h1>
            <br/>
        </div>
    </div>
    <p class="badge bg-success"><c:out value="${success}"/></p>
    <div class="row">
        <div class="col-12">
            <div class="table-responsive">
                <table class="table table-striped table-hover">
                    <thead class="bg-dark text-light">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Age</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="ninja" items="${dojo.ninjas}">
                        <tr>
                            <td><c:out value="${ninja.first_name}"/> </td>
                            <td><c:out value="${ninja.last_name}"/></td>
                            <td><c:out value="${ninja.age}"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
