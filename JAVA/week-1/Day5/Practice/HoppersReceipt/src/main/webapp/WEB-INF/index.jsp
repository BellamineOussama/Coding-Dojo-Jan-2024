<%--
  Created by IntelliJ IDEA.
  User: Msi
  Date: 23/05/2024
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
 <%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>

</head>
<body>
    <h1>Customer Name: <c:out value="${name}"/></h1>
    <p>Item name: <c:out value="${itemName}"/></p>
    <p>Price: $<c:out value="${price}"/></p>
    <p>Description: <c:out value="${description}"/></p>
    <p>Vendor: <c:out value="${vendor}"/></p>
</body>
</html>
