<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>registration_page</title>
</head>
<body>
<c:if test="${massage != null}">
    <strong>${massage}</strong>
</c:if>

<f:form action="/home/reg" method="post" modelAttribute="user">
    <f:label path="name">name:</f:label>
    <br>
    <f:input type="text" path="name" />
    <f:errors path="name"/>
    <br>
    <br>
    <f:label path="login">login:</f:label>
    <br>
    <f:input type="text" path="login" />
    <f:errors path="login">login is empty!</f:errors> <%-- (1) Update error-script hear--%>
    <br>
    <br>
    <f:label path="password">password:</f:label>
    <br>
    <f:input type="password" path="password"/>
    <f:errors path="password"/>
    <br>
    <br>
    <f:label path="age">age:</f:label>
    <br>
    <f:input type="test" path="age" />
    <f:errors path="age"/>
    <br>
    <br>
    <f:button>submit</f:button>
</f:form>
<a href="/home">Home</a>
</body>
</html>
