<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 06/06/2024
  Time: 06:30
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
    <title>Books</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <div class="d-flex justify-content-between align-items-lg-baseline">
                <h1>Welcome, <c:out value="${user.userName}"/> 👋</h1>
                <a href="${pageContext.request.contextPath}/logout" class="btn btn-danger btn-sm w-25">Logout</a>
            </div>
            <br/>
            <div class="d-flex justify-content-between align-items-lg-baseline">
                <p> <strong>Books from everyone's shelves.</strong></p>
                <a href="${pageContext.request.contextPath}/books/new" class="btn btn-primary btn-create btn-sm w-25">Add a book to my shelf</a>
            </div>
        </div>
    </div>
    <p class="badge bg-success"><c:out value="${success}"/></p>
    <div class="row">
        <div class="col-12">
            <div class="table-responsive">
                <table class="table table-striped table-hover">
                    <thead class="bg-dark text-light">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Author Name</th>
                        <th>Posted By</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="book" items="${allBook}">
                        <tr>
                            <td>${book.id}</td>
                            <td><a class="text-decoration-none" href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
                            <td><c:out value="${book.author}"/></td>
                            <td><c:out value="${book.user.userName}"/></td>
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
