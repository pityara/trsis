<%--
        Created by IntelliJ IDEA.
        User: promoscow
        Date: 17.07.17
        Time: 23:22
        To change this template use File | Settings | File Templates.
        --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Items list</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<section class="body">
    <div class="buttonsContainer">
        <a href="/" class="button">&lt Main page</a>
        <a href="/create" class="button">Create new item &gt</a>
    </div>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Quantity</th>
        </tr>
        </thead>
        <c:forEach items="${itemsList}" var="element">
            <tr>
                <td><a href=${element.getItemHref()}>${element.getName()}</a></td>
                <td>${element.getQuantity()}</td>
                <td><a href=${element.getUpdateHref()}>update</td>
                <td><a href=${element.getRemoveHref()}>delete</td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>