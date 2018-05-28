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
    <%--todo 退出--%>
    <p><a class="head3"href="login.jsp">退出</a></p>
</div>
<ul>
    <li><a href="/staff/staff_main.do">后台首页</a></li>
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
    name:<input type="text" name="name"><br>
    subtitle:<input type="text" name="subtitle"><br>
    价格：:<input type="text" name="price"><br>
    库存：<input type="text" name="stock"><br>
    size:<input type="text " name="size"><br>
    color:<input type="text" name="color"><br>
    detail:<input type="text" name="detail" style="width: 400px;height: auto"><br>
    展示图片1:<input type="file" name="mainimg1"><br>
    展示图片2:<input type="file" name="mainimg2"><br>
    子图：<input type="file" name="subimg"><br>
    梳妆台图片<input type="file" name="dresserimg"><br>
    <input type="submit" value="新增商品">
</form>
</div>
</body>
</html>
