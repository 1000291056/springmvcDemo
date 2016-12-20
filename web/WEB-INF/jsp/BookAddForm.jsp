<%--
  Created by IntelliJ IDEA.
  User: wufeifei
  Date: 2016/12/20
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book fORM</title>
</head>
<body>
<div id="global">
    <form:form commandName="book" action="book_save" method="post">
        <fieldset>
            <legend>Add a Book</legend>
            <p>
                <label for="category">Category:</label>
                <form:select path="category.id" id="category" items="${categories}" itemLabel="name" itemValue="id"/>
            </p>
            <p>
                <label for="title">Title:</label>
                <form:input path="title" id="title"/>
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
