<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台订单管理首页</title>
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
        <li><a href="/staff/product/product_list.do">商品管理</a></li>
    </ul>
    <div id="content">
        <h1>订单管理首页</h1>
        <div>
            <p>订单搜索：</p>
            <input placeholder="输入订单编号" value="" name="orderNumber">

        </div>
    </div>
</body>
</html>