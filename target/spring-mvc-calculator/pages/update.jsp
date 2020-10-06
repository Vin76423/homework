
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update_account_page</title>
</head>
<body>
    <form action="/account/update" method="post">
        <label for="value">Value:</label>
        <input name="value" type="text" id="value"/>
        <label for="field">Updated field:</label>
        <select name="field" id="field">
            <option value="name">name</option>
            <option value="login">login</option>
            <option value="password">password</option>
            <option value="age">age</option>
        </select>
        <button>calculate</button>
    </form>

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
