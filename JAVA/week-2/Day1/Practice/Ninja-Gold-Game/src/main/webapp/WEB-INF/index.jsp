<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}css/style.css">
    <!-- Include Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <title>Ninja Gold Game</title>
</head>
<body>
<div class="container">
    <div class="form-container">
        <div>
            <div class="form-group mb-3 row">
                <label for="number" class="col-sm-2 col-form-label"><h6>Your Gold :</h6></label>
                <div class="col-sm-10">
                    <input class="form-control" id="number" value="${sessionScope.gold}" readonly />
                </div>
            </div>
            <br/>
            <div class="f-container" >
                <form method="post" action="${pageContext.request.contextPath}/process">
                    <input type="hidden" name="action" value="farm">
                    <div class="form-group mb-3 professional-border">
                        <h4>Farm</h4>
                        <p>(earns 10-20 gold)</p>
                        <input type="submit" class="btn btn-gold gap-2 col-6 mx-auto" value="Find Gold">
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/process">
                    <input type="hidden" name="action" value="cave">
                    <div class="form-group mb-3 professional-border">
                        <h4>Cave</h4>
                        <p>(earns 5-10 gold)</p>
                        <input type="submit" class="btn btn-gold gap-2 col-6 mx-auto" value="Find Gold">
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/process">
                    <input type="hidden" name="action" value="house">
                    <div class="form-group mb-3 professional-border">
                        <h4>House</h4>
                        <p>(earns 2-5 gold)</p>
                        <input type="submit" class="btn btn-gold gap-2 col-6 mx-auto" value="Find Gold">
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/process">
                    <input type="hidden" name="action" value="quest">
                    <div class="form-group mb-3 professional-border">
                        <h4>Quest</h4>
                        <p>(earns/takes 0-50 gold)</p>
                        <input type="submit" class="btn btn-gold gap-2 col-6 mx-auto" value="Find Gold">
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/process">
                    <input type="hidden" name="action" value="spa">
                    <div class="form-group mb-3 professional-border">
                        <h4>Spa</h4>
                        <p>(loses 5-20 gold)</p>
                        <input type="submit" class="btn btn-gold gap-2 col-6 mx-auto" value="Relax">
                    </div>
                </form>
                <form method="post" action="${pageContext.request.contextPath}/process">
                    <input type="hidden" name="action" value="reset">
                    <div class="form-group mb-3 professional-border">
                        <input type="submit" class="btn btn-danger gap-2 col-6 mx-auto" value="Reset Game">
                    </div>
                </form>
            </div>
            <br/>
            <div class="form-group mb-3">
                <h6>Activities :</h6>
                <ul>
                    <c:forEach var="activity" items="${sessionScope.activities}">
                        <li class="${activity.earned ? 'earned-gold' : 'lost-gold'}">${activity.message}</li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
