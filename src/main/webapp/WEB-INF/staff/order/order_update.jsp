<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台订单管理查询页</title>
    <link rel="stylesheet" href="/css/mystyle2.css" type="text/css">
</head>
<body>
<script>
    var errormsg = document.getElementById("errorMsg").value;
    if(!errormsg){
        alert(errormsg);
    }
</script>
<div id="head">
    <p class="head1">bling bling</p>
    <p class="head2">欢迎，${sessionScope.currentUser.username}</p>
    <%--todo 退出--%>
    <p><a class="head3"href="login.jsp">退出</a></p>
</div>
<ul id="navigator">
    <li><a href="登录后首页.html">客户端</a></li>
    <li><a href="/nolimit/order_index.jsp">订单管理</a></li>
    <li><a href="/staff/category/category_list.do">品类管理</a></li>
    <li><a href="/staff/item/item_list1.do">商品管理</a></li>
</ul>
<div id="content">
    <h1>订单管理-订单详情页</h1>
    <input type="hidden" id="errorMsg" name="errorMsg" value="${errormsg}">
    <div>
        <form method="post" action="/staff/order/update_order_shipment.do">
            <p><input type="submit" value="提交修改"></p>
            <p><input type="hidden" name="id" value="${ship_detail.id}"></p>
            <p>收货人(reciver):<input name="reciver" type="text" value="${ship_detail.reciver}"></p>
            <p>联系电话(phone):<input name="phone" type="text" value="${ship_detail.phone}"></p>
            <p>快递状态(status):${ship_detail.status}</p>
            <p>收货地址(address):<input type="text" name="address" value="${ship_detail.address}"></p>
            <p>物流单号(shipping_number):<input type="text" name="shipping_number" value="${ship_detail.shipping_number}"></p>
            <p>物流创建时间(create_time):${ship_detail.create_time}</p>
            <p>物流修改时间(update_time):${ship_detail.update_time}</p>
        </form>
    </div>
</div>
</body>
</html>
