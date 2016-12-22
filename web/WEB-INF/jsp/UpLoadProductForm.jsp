<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wufeifei
  Date: 2016/12/22
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
</head>
<body>
<div id="global">
    <form:form commandName="product" action="uploadproduct_save" method="post" enctype="multipart/form-data">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <label for="name">Product Name:</label>
                <form:input path="name" id="name"/>
            </p>
            <p>
                <label for="description">Product description:</label>
                <form:input path="description" id="description"/>
            </p>
            <p>
                <label for="price">Product price:</label>
                <form:input path="price" id="price"/>
            </p>
            <p>
                <label for="image">Product image:</label>
                <input type="file" name="images[0]" id="image">
            </p>
            <p>
                <input id="reset" type="reset" tabindex="4">
                <input type="submit" id="submit" value="add a product" tabindex="5">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
