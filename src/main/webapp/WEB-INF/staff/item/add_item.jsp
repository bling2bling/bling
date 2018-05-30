<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/24
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<html>
<head>
    <title>添加商品</title>
    <link rel="stylesheet" href="/css/mystyle2.css" type="text/css">
</head>
<body>
<div id="head">
    <p class="head1">bling bling</p>
    <p class="head2">欢迎，${sessionScope.currentUser.username}</p>
    <p><a class="head3" href="/staff/login.do">退出</a></p>
</div>
<ul id="navigator">
    <li><a href="登录后首页.html">客户端</a></li>
    <li><a href="/nolimit/order_index.jsp">订单管理</a></li>
    <li><a href="/staff/category/category_list.do">品类管理</a></li>
    <li><a href="/staff/item/item_list1.do">商品管理</a></li>
</ul>
<div id="content">
<form method="post" enctype="multipart/form-data" action="/staff/item/add_item2.do">
    categoryId:<select name="categoryId">
    <c:forEach items="${clist}" var="node">
        <option value="${node.id}">${node.id}.${node.categoryName}</option>
    </c:forEach>
</select><br>
    name:<input type="text" name="name" required><br>
    subtitle:<input type="text" name="subtitle" required><br>
    价格：:<input type="text" name="price" required><br>
    库存：<input type="text" name="stock" required><br>
    size:<input type="text " name="size" required><br>
    color:<input type="text" name="color" required><br>
    detail:<input type="text" name="detail" style="width: 400px;height: auto" required><br>
    展示图片1:<input type="file" name="mainimg1" required><br>
    展示图片2:<input type="file" name="mainimg2" required><br>
    子图：<input type="file" name="subimg" required><br>
    梳妆台图片<input type="file" name="dresserimg" required><br>
    <input type="submit" value="新增商品">
</form>
</div>
</body>
</html>
