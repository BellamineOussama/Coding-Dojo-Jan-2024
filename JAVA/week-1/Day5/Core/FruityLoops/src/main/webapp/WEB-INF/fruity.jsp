<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 25/05/2024
  Time: 15:07
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
        <h1 class="text-danger mt-5">Fruit Store</h1>
        <table class="table border-danger">
            <thead class="border-danger">
                <tr>
                    <th><h4>Name</h4></th>
                    <th><h4>Price</h4></th>
                </tr>
            </thead>
            <tbody class="border-danger">
                <c:forEach var="fruits" items="${fruits}">
                    <tr>
                         <th><c:out value="${fruits.name}"/></th>
                         <th><c:out value="${fruits.price}"/></th>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>


<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
