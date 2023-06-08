<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 08.06.2023
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Book Details</title>
</head>
<body>
<h1>Book Details</h1>
<table>
  <tr>
    <td>ISBN:</td>
    <td>${book.isbn}</td>
  </tr>
  <tr>
    <td>Title:</td>
    <td>${book.title}</td>
  </tr>
  <tr>
    <td>Author:</td>
    <td>${book.author}</td>
  </tr>
  <tr>
    <td>Publisher:</td>
    <td>${book.publisher}</td>
  </tr>
  <tr>
    <td>Description:</td>
    <td>${book.description}</td>
  </tr>
</table>
</body>
</html>
