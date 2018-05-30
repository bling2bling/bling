<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" href="/css/mystyle2.css" type="text/css">
</head>
<body>
    <div id="head">
        <p class="head1">bling bling</p>
        <p class="head2">欢迎，${username}</p>
        <p><a class="head3"href="/staff/logout.do">退出</a></p>
    </div>
    <ul id="navigator">
        <li><a href="登录后首页.html">客户端</a></li>
        <li><a href="/nolimit/order_index.jsp">订单管理</a></li>
        <li><a href="/staff/category/category_list.do">品类管理</a></li>
        <li><a href="/staff/item/item_list1.do">商品管理</a></li>
    </ul>
<div id="content">
            <h1>订单管理</h1>
            输入订单号查询：<input type="text" placeholder="输入订单号" required>
            </table>
</div>
</body>
</html>