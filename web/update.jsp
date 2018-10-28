<%--
  Created by IntelliJ IDEA.
  User: EgorNikitin
  Date: 21/10/2018
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<section class="body">
    <form method="post" action="update">
        <div class="buttonsContainer">
            <a href="/" class="button">&lt Main page</a>
            <a href="/items" class="button">Items list &gt</a>
        </div>
        <h2>Update item</h2>
        <input type="hidden" name="id"  value=${item.getId()} />
        <input type="text" name="name" placeholder="Item name" value=${item.getName()} />
        <input type="number" name="quantity" step="1" placeholder="Quantity" value=${item.getQuantity().toString()} />
        <input type="submit"/>
    </form>
</section>
</body>
</html>
