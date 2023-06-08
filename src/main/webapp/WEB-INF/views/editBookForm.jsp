<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 07.06.2023
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit book form</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/books/editBook">
  Isbn: <input type="text" name="isbn"><br>
  Title: <input type="text" name="title"><br>
  Author: <input type="text" name="author"><br>
  Publisher: <input type="text" name="publisher"><br>
  Description: <input type="text" name="description"><br>
  <input type="hidden" name="id" value="${book.id}">
  <input type="submit" value="Edit book">
</form>
</body>
</html>
