<%@ page import="com.bean.Product" %><%--
  Created by IntelliJ IDEA.
  User: wufeifei
  Date: 2016/12/22
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Save Product</title>
    <script type="text/javascript">
        alert("sssssssssss");
        <%--alert("<%= ${product.name}%>");--%>
    </script>

    <%
        Product p = new Product();
    %>
</head>
<body>
<div id="global">
    <h4>the product has been saves</h4>
    <p>
        Product Name:${product.name}<br/>
        Product Description:${product.description}<br/>
        Product Price:$${product.price}<br/>
    </p>
    <p>Following files are uploaded</p>
    <ol>
        <c:forEach items="${product.images}" var="imageItem">
            <li>${imageItem.originalFilename}

                <img width="100" src="<c:url value="/image/${imageItem.originalFilename}"/>"/>
            </li>
        </c:forEach>
    </ol>
</div>
</body>
</html>
