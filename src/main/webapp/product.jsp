<%@ page import="GbServlet.Model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: aleksey
  Date: 23.03.2022
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product page</title>
</head>
<body>
<h1>Product</h1>
<hr>
<ul>
    <% for (Product prod : (List<Product>) (List<Product>) request.getAttribute("product")) {%>
    <li>
        Id: <%=prod.getId()%>;
        Title: <%=prod.getTitle()%>;
        Cost: <%=prod.getCost()%>;
    </li>
    <% } %>
</ul>
</body>
</html>
