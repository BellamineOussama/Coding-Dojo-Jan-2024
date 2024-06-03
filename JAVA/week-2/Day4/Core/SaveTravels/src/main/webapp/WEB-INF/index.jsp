<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 31/05/2024
  Time: 11:07
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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="container mt-5">
    <div>
        <h1 class="text-center">Save travels</h1>
        <div class="scrollable-table">
            <table class="table table-striped table-bordered">
                <thead class="text-center">
                <tr>
                    <th>Expense</th>
                    <th>Vendor</th>
                    <th>Amount</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="travel" items="${travels}">
                    <tr>
                        <td><a href="/expenses/${travel.id}">${travel.expense}</a></td>
                        <td>${travel.vendor}</td>
                        <td class="text-center">${travel.amount}</td>
                        <td class="d-flex justify-content-between align-items-lg-baseline">
                            <a href="${pageContext.request.contextPath}expenses/edit/${travel.id}" class="edit-link"><strong>Edit</strong></a>
                            <form action="${pageContext.request.contextPath}/expenses/delete/${travel.id}" method="post" >
                                <input type="hidden" name="_method" value="delete"/>
                                <button type="submit" class="btn btn-sm delete-button" onclick="return confirm('Are you sure you want to delete this expense?')">Delete</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <div class="mt-4">
        <h1 class="text-center">Add an expense</h1>
        <form:form action="/expenses" method="post" modelAttribute="travel"  class="mt-3 form-horizontal">
            <div class="mb-3 form-group">
                <form:label path="expense" cssClass="form-label">Expense Name:</form:label>
                <form:errors path="expense" cssClass="text-danger text-nowrap"/>
                <form:input path="expense" cssClass="form-control"/>
            </div>
            <div class="mb-3 form-group">
                <form:label path="vendor" cssClass="form-label">Vendor:</form:label>
                <form:errors path="vendor" cssClass="text-danger text-nowrap"/>
                <form:input path="vendor" cssClass="form-control"/>
            </div>
            <div class="mb-3 form-group">
                <form:label path="amount" cssClass="form-label">Amount:</form:label>
                <form:errors path="amount" cssClass="text-danger text-nowrap"/>
                <form:input path="amount" type="double" cssClass="form-control"/>
            </div>
            <div>
                <form:label path="description" cssClass="form-label">Description:</form:label>
                <form:errors path="description" cssClass="text-danger text-nowrap"/>
                <form:textarea path="description"  cssClass="form-control"/>
            </div>
            <div class="text-center">
                <input type="submit" value="Submit" class="btn btn-submit mt-3">
            </div>
        </form:form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
