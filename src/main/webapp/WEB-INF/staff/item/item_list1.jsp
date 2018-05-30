<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/27
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>item_list1</title>
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
    <div id="category_navigator">
        <tr><a href="/staff/item/add_item1.do">添加商品</a></tr><br><br>
            <c:forEach items="${clist}" var="node">
                <tr><a href="/staff/item/item_list2.do?categoryId=${node.id}">${node.id}.${node.categoryName}</a></tr><br>
            </c:forEach>
    </div>
</div>
</body>
</html>
