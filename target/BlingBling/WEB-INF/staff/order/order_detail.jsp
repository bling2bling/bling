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
<script type="application/javascript">
    function updShipping() {
        var shipping_id = document.getElementById("ship_id").value;
        //todo 打开修改页面
        window.location.href = "/staff/order/order_update_prepare.do?ship_id="+shipping_id;
    }
    
</script>
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
    <h1>订单管理-订单详情页</h1>
    <div>
        <div>
            <%--&lt;%&ndash;订单状态&ndash;%&gt;--%>
            <%--<p><input type="button" value="修改订单状态" onclick="updOrder()"></p>--%>
            <p>订单编号(order_id)：<span id="orderNumber">${order_detail.order_id}</span></p>
            <p>支付用户(user_id)：${order_detail.user_id}</p>
            <p>订单状态(status)：${order_detail.status}</p>
            <p>支付状态(payment_status)：${order_detail.payment_status}</p>
            <p>创建时间(create_time)：${order_detail.create_time}</p>
            <p>修改时间(update_time)：${order_detail.update_time}</p>
            <p>支付编号(payment_id)：${order_detail.payment_id}</p>
        </div>
        <div>
            <%--物流状态--%>
            <p>
                <input type="hidden" value="${ship_detail.id}" id="ship_id">
                <input type="button" value="修改订单物流信息" onclick="updShipping()">
            </p>
            <p>收货人(reciver):${ship_detail.reciver}</p>
            <p>联系电话(phone):${ship_detail.phone}</p>
            <p>快递状态(status):${ship_detail.status}</p>
            <p>收货地址(address):${ship_detail.address}</p>
            <p>物流单号(shipping_number):${ship_detail.shipping_number}</p>
            <p>物流创建时间(create_time):${ship_detail.create_time}</p>
            <p>物流修改时间(update_time):${ship_detail.update_time}</p>
        </div>
        <br>
        <br>
        <p>购物清单:</p>
        <div>
            <table>
                <tr>
                    <td>商品名称</td>
                    <td>商品ID（item_id)</td>
                    <td>商品单价</td>
                    <td>数量</td>
                    <td>总价</td>
                    <td>创建时间</td>
                    <td>修改时间</td>
                </tr>
    <c:forEach items="${detail}" var="node">
                <tr>
                    <td><a href="${node.product_url}">${node.product_name}</a></td>
                    <td>${node.item_id}</td>
                    <td>${node.current_unit_price}</td>
                    <td>${node.quanity}</td>
                    <td>${node.total_price}</td>
                    <td>${node.create_time}</td>
                    <td>${node.update_time}</td>
                </tr>
    </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>
