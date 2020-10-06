
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>account_page</title>
</head>
<body>
    <c:if test="${user != null}">
        <strong>Name: ${user.name}</strong>
        <br>
        <strong>Login: ${user.login}</strong>
        <br>
        <strong>Password: ${user.password}</strong>
        <br>
        <strong>Age: ${user.age}</strong>
    </c:if>

    <br>
    <br>
    <a href="/account/update">Update your profile</a>
    <br>
    <br>
    <a href="/account/delete">Delete your profile</a>
    <br>
    <br>
    <a href="/account/show-by-user-login">Show calculate history</a>
    <br>
    <br>
    <a href="/account/show-by-user-login-and-operation-type">Show calculate history by selected operationCalcDto</a>
    <br>
    <br>
    <a href="/home">Home</a>
    <br>
    <br>

    <c:if test="${massage != null}">
        <strong>${massage}</strong>
    </c:if>
</body>
</html>
