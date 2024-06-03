<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Debtor's Prison</title>
</head>
<body>
<div class="container">
    <div class="form-container text-center">
        <h2>Debtor's Prison</h2>
        <p>You have fallen too far into debt and have been sent to the debtor's prison!</p>
        <form method="post" action="${pageContext.request.contextPath}/process">
            <input type="hidden" name="action" value="reset">
            <input type="submit" class="btn btn-danger" value="Restart Game">
        </form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
