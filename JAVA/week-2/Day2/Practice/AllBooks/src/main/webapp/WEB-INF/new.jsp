<%--
  Créé par IntelliJ IDEA.
  Utilisateur : Msi
  Date : 31/05/2024
  Heure : 05:27
  Pour modifier ce modèle, utilisez Fichier | Paramètres | Modèles de fichiers.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/form.css">
    <!-- Inclure les polices Google -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Create a New Book</title>
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center mb-4">Create a New Book</h1>
    <div class="form-container">
        <form:form action="${pageContext.request.contextPath}/books" method="post" modelAttribute="book">
            <div class="mb-3">
                <form:label path="title" class="form-label">Title</form:label>
                <form:input path="title" class="form-control"/>
                <form:errors path="title" class="text-danger"/>
            </div>
            <div class="mb-3">
                <form:label path="description" class="form-label">Description</form:label>
                <form:textarea path="description" class="form-control" rows="5"/>
                <form:errors path="description" class="text-danger"/>
            </div>
            <div class="mb-3">
                <form:label path="language" class="form-label">Language</form:label>
                <form:input path="language" class="form-control"/>
                <form:errors path="language" class="text-danger"/>
            </div>
            <div class="mb-3">
                <form:label path="numberOfPages" class="form-label">Number of Pages</form:label>
                <form:input path="numberOfPages" type="number" class="form-control"/>
                <form:errors path="numberOfPages" class="text-danger"/>
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-primary btn-sm">Submit</button>
            </div>
        </form:form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
