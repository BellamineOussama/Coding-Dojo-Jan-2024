<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 25/05/2024
  Time: 00:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}./css/style.css">
    <title>Date</title>
</head>
<body>
    <h1><c:out value="${date}"/></h1>


    <script type="text/javascript" src="${pageContext.request.contextPath}./js/app.js"></script>
    <script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
