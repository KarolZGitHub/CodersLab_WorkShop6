<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 07.06.2023
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Book form</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/forForm.css">
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/books/addBook">
    <div>Isbn: <input type="text" name="isbn"></div>
    <div>Title: <input type="text" name="title"></div>
    <div>Author: <input type="text" name="author"></div>
    <div>Publisher: <input type="text" name="publisher"></div>
    <div> Description: <input type="text" name="description"></div>
    <div><input type="submit" value="Create book"></div>
</form>
<script src="/resources/js/forForm.js"></script>
</body>
</html>
