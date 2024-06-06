<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${book.title}"/></title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/showBookDetails.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <div class="d-flex align-items-center justify-content-between mb-5">
        <h1 class="display-4"><c:out value="${book.title}"/></h1>
        <a href="${pageContext.request.contextPath}/books" class="btn btn-back">⬅️ back to the shelves</a>
    </div>
    <div>
        <c:choose>
            <c:when test="${book.user.id == user.id}">
                <p>You read <strong><c:out value="${book.title}"/></strong> by <em><c:out value="${book.author}"/></em></p>
                <p>Here are your thoughts:</p>
            </c:when>
            <c:otherwise>
                <p><c:out value="${book.user.userName}"/> read <strong><c:out value="${book.title}"/></strong> by <em><c:out value="${book.author}"/></em></p>
                <p>Here are <c:out value="${book.user.userName}'s"/> thoughts:</p>
            </c:otherwise>
        </c:choose>
    </div>
    <hr>
    <div class="thoughts">
        <p><c:out value="${book.thoughts}"/></p>
    </div>
    <hr>
    <div class="text-right">
        <c:if test="${book.user.id == user.id}">
            <a href="${pageContext.request.contextPath}/books/${book.id}/edit" class="btn btn-primary btn-sm">Edit</a>
            <form action="${pageContext.request.contextPath}/books/${book.id}/delete" method="post" class="d-inline">
                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure you want to delete this book?')">Delete</button>
            </form>
        </c:if>
    </div>
</div>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
