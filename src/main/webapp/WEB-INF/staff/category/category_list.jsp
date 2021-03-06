<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>品类列表</title>
    <link rel="stylesheet" href="/css/mystyle2.css" type="text/css">
</head>
<body>
<div id="head">
    <p class="head1">bling bling</p>
    <p class="head2">欢迎，${sessionScope.currentUser.username}</p>
    <p><a class="head3"href="login.jsp">退出</a></p>
</div>
<ul id="navigator">
    <li><a href="登录后首页.html">客户端</a></li>
    <li><a href="/nolimit/order_index.jsp">订单管理</a></li>
    <li><a href="/staff/category/category_list.do">品类管理</a></li>
    <li><a href="/staff/item/item_list1.do">商品管理</a></li>
</ul>
<div id="content">
    <script>
        if("${errorMsg}"!=""){
            alert("${errorMsg}");
        }
    </script>
    这里是商品分类列表的页面
    <a href="/nolimit/add_category.jsp">新增分类</a>
    <p>商品列表</p>
    <table>
        <tr>
            <td>分类名</td>
            <td>分类id</td>
            <td>分类说明</td>
        </tr>
        <c:forEach items="${clist}" var="node">
            <tr>
                <td>${node.categoryName}</td>
                <td>${node.id}</td>
                <td>${node.detail}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
