<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<<<<<<< HEAD
    <head>
        <title>home_page</title>
    </head>
    <body>
        Hello ${user.login}
        <br>
        <br>
        <div>
            <c:if test="${user != null}">
                <a href="/calc">Calc</a>
                <br>
                <a href="/account">Account</a>
            </c:if>

            <c:if test="${user == null}">
                <a href="/home/reg">Registration</a>
                <br>
                <a href="/home/auth">Authorization</a>
            </c:if>
        </div>
    </body>
=======
<head>
    <title>home_page</title>
</head>
<body>
Hello ${sessionScope.user.login}

<div>
    <c:if test="${sessionScope.user != null}">
        <a href="/api/calc">Calc</a>
    </c:if>

    <c:if test="${sessionScope.user == null}">
        <a href="/api/reg">Registration</a>
        <a href="/api/auth">Authorization</a>
    </c:if>
</div>
</body>
>>>>>>> origin/master
</html>
