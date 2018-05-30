<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/27
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>item_list2</title>
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
        <tr><a href="/staff/item/add_item1.do">添加商品</a></tr><br>
    <table style="text-align: center" border="2px red" cellpadding="2px" cellspacing="2px">
            <tr>
                <td></td>
                <td>id</td>
                <td>categoryId</td>
                <td>name</td>
                <td>subtitle</td>
                <td>size</td>
                <td>color</td>
                <td>price</td>
                <td>stock</td>
            </tr>
        <c:forEach items="${item_list}" var="item">
            <tr>
                <small>
                    <td><a href="/staff/item/item_info_by_id.do?id=${item.id}"><img src="../../picture/main/${item.categoryId}/${item.mainImage[0]}" style="border:outset bisque;width: 50px;height: 40px" onerror="this.src='../../picture/default.jpg'"></img></a></td>
                    <td>${item.id}</td>
                    <td>${item.categoryId}</td>
                    <td>${item.name}</td>
                    <td>${item.subtitle}</td>
                    <td>${item.size}</td>
                    <td>${item.color}</td>
                    <td>${item.price}</td>
                    <td>${item.stock}</td>
                </small>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
