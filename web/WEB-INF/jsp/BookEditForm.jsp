<%--
  Created by IntelliJ IDEA.
  User: wufeifei
  Date: 2016/12/20
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edir Book Form</title>
</head>
<body>
<div id="global">
    <form:form commandName="book" action="/book_update" method="post">
        <fieldset>
            <legend>Edit a Book</legend>
            <form:hidden path="id"/>
            <p>
                <label for="category">Category:</label>
                <form:select path="category.id" id="category" items="${categories}" itemLabel="name" itemValue="id"/>
            </p>
            <p>
                <label for="title">Title:</label>
                <form:input path="title" id="title"/>
            </p>
            <p>
                <label for="author">Author:</label>
                <form:input path="author" id="author"/>
            </p>
            <p>
                <label for="isbn">ISBN:</label>
                <form:input path="isbn" id="isbn"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Update Book">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
