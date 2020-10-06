<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
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
</html>
