
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>calc_page</title>
</head>
<body>
<<<<<<< HEAD
=======
    <form action="/api/calc" method="post" <%--id="form"--%>>
        <label for="num1">first number:</label>
        <input id="num1" name="num1" type="text">
        <label for="num2">second number:</label>
        <input id="num2" name="num2" type="text">
<%--        <label for="operationType">operation type:</label>--%>
<%--        <input id="operationType" name="operationType" type="text">--%>
        <label for="operationType">operation type:</label>
        <select id="operationType" name="operationType" typeof="text">
            <option value="SUM">+</option>
            <option value="SUB">-</option>
            <option value="MUL">*</option>
            <option value="DIV">/</option>
        </select>

        <button>calculate</button>
    </form>
>>>>>>> origin/master

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
<<<<<<< HEAD
    <br>
    <a href="/home">Home</a>
=======

    ${massage}

    <a href="/api">Home</a>

<%--    <script>--%>
<%--        var form = document.getElementById('form');--%>

<%--        form.onsubmit = function () {--%>
<%--            if (isNaN(Number(form.num1.value))) {--%>
<%--                alert('You write invalid value for FIRST number!')--%>
<%--                return false;--%>
<%--            }--%>
<%--            else if (isNaN(Number(form.num2.value))) {--%>
<%--                alert('You write invalid value for SECOND number!')--%>
<%--                return false;--%>
<%--            }--%>
<%--            else if (form.num2.value == 0 && form.operationType.value === 'DIV') {--%>
<%--                alert('Cannot be division by zero!')--%>
<%--                return false;--%>
<%--            }--%>

<%--            return true;--%>
<%--        }--%>
<%--    </script>--%>
>>>>>>> origin/master
</body>
</html>
