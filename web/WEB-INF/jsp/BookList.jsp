<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: wufeifei
  Date: 2016/12/20
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<div id="global">
    <h1>Book List</h1>
    <a href="<c:url value="/book_input"/>">Add Book</a>
    <table>
        <tr>
            <th>Category</th>
            <th>Title</th>
            <th>ISBN</th>
            <th>Author</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="$(books)" var="book">
            <tr>
                <td>${book.category.name}</td>
                <td>${book.category.title}</td>
                <td>${book.category.isbn}</td>
                <td>${book.category.author}</td>
                <td><a href="/book_edit/${book.id}">Edit</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
