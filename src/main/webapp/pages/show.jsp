
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>show_operations_page</title>
</head>
<body>
    <c:forEach items="${operations}" var="operation">
        <strong>    date: ${operation.date}</strong>
        <strong>    number 1: ${operation.num1}</strong>
        <strong>    number 2: ${operation.num2}</strong>
        <strong>    operation type: ${operation.operationType}</strong>
        <strong>    result: ${operation.result}</strong>
        <br>
        <br>
    </c:forEach>

    <a href="/home">home</a>
</body>
</html>
