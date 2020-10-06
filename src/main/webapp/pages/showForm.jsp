
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show_operations_form_page</title>
</head>
<body>
<form action="/account/show-by-user-login-and-operation-type" method="post">
    <label for="operation">Operation type for filter:</label>
    <select name="operation" id="operation">
        <option value="SUM">+</option>
        <option value="SUB">-</option>
        <option value="MUL">*</option>
        <option value="DIV">/</option>
    </select>
    <button>submit</button>
</form>

<a href="/home">home</a>
</body>
</html>
