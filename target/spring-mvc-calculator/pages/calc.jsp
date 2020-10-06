
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>calc_page</title>
</head>
<body>

    <c:if test="${massage != null}">
        <strong>${massage}</strong>
    </c:if>

    <f:form action="/calc" method="post" modelAttribute="operationDto">
        <f:label path="num1">first number:</f:label>
        <f:input path="num1" type="text"/>
        <f:label path="num2">second number:</f:label>
        <f:input path="num2" type="text"/>
        <f:label path="operationType">operation type:</f:label>
        <f:select path="operationType">
            <f:option value="SUM">+</f:option>
            <f:option value="SUB">-</f:option>
            <f:option value="MUL">*</f:option>
            <f:option value="DIV">/</f:option>
        </f:select>
        <f:button>calculate</f:button>
    </f:form>
    <br>
    <br>

    <c:if test="${result != null}">
        result : ${result}
    </c:if>
    <br>
    <a href="/home">Home</a>
</body>
</html>
