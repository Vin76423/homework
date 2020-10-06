<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>authorization_page</title>
    </head>
    <body>
        <c:if test="${massage != null}">
            <strong>${massage}</strong>
        </c:if>

        <f:form action="/home/auth" method="post" modelAttribute="userDto">
            <f:label path="login">login:</f:label>
            <br>
            <f:input type="text" path="login" placeholder="login"/>
            <f:errors path="login"/>
            <br>
            <br>
            <f:label path="password">password:</f:label>
            <br>
            <f:input type="password" path="password" placeholder="password"/>
            <f:errors path="password"/>
            <br>
            <br>
            <f:button>submit</f:button>
        </f:form>
        <a href="/api">Home</a>
    </body>
</html>