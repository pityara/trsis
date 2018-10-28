<%--
        Created by IntelliJ IDEA.
        User: promoscow
        Date: 17.07.17
        Time: 23:22
        To change this template use File | Settings | File Templates.
        --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add item</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<section class="body">
    <form method="post" action="create">
        <div class="buttonsContainer">
            <a href="/" class="button">&lt Main page</a>
            <a href="/items" class="button">Items list &gt</a>
        </div>
        <h2>Create new item to buy list</h2>
        <input type="text" name="name" placeholder="Item name"/>
        <input type="number" name="quantity" step="1" placeholder="Quantity"/>
        <input type="submit"/>
    </form>
</section>
</body>
</html>