<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Book</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/create.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>Change your Entry</h1>
    <a href="${pageContext.request.contextPath}/books" class="btn btn-back">⬅️ back to the shelves</a>
    <hr/>
    <form:form action="${pageContext.request.contextPath}/books/${book.id}/update" method="post" modelAttribute="book" class="mt-3">
        <input type="hidden" name="_method" value="put" />
        <div class="mb-3">
            <form:label path="title" cssClass="form-label">Title</form:label>
            <form:errors path="title" cssClass="text-danger"/>
            <form:input path="title" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="author" cssClass="form-label">Author</form:label>
            <form:errors path="author" cssClass="text-danger"/>
            <form:input path="author" cssClass="form-control"/>
        </div>
        <div class="mb-3">
            <form:label path="thoughts" cssClass="form-label">My Thoughts</form:label>
            <form:errors path="thoughts" cssClass="text-danger"/>
            <form:textarea path="thoughts" cssClass="form-control"/>
        </div>
        <div class="text-center">
            <input type="submit" value="Submit" class="btn btn-primary btn-submit mt-3">
        </div>
    </form:form>
</div>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
