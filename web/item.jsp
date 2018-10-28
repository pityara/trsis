<%--
  Created by IntelliJ IDEA.
  User: EgorNikitin
  Date: 21/10/2018
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${item.getName()}</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>${item.getName()}</h1>
    <span class="fieldName">Quantity</span>
    ${item.getQuantity()}
</body>
</html>
