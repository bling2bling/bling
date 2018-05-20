<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" href="css/mystyle2.css" type="text/css">
</head>
<body>
    <div id="head">
        <p class="head1">bling bling</p>
        <p class="head2">欢迎，${username}</p>
        <p><a class="head3"href="login.jsp">退出</a></p>
    </div>
        <ul>
            <li><a href="登录后首页.html">客户端</a></li>
            <li><a href="main.jsp">订单管理</a></li>
            <li><a href="商品管理.html">商品管理</a></li>
        </ul>
<div id="content">
            <h1>订单管理</h1>
            输入订单号查询：<input type="text" placeholder="输入订单号" required>
            <button type="submit">查询</button>
            <table id="order_list">
                <tr>
                <th width="90px">订单编号</th>
                <th width="70px">收件人</th>
                <th width="70px">订单状态</th>
                <th width="70px">支付金额</th>
                <th width="90px">创建时间</th>
                <th width="60px">操作</th>
                </tr>
                <tr>
                    <td class="number">12451243542224</td>
                    <td class="name">李先生</td>
                    <td class="state">未支付</td>
                    <td class="payment">￥170</td>
                    <td class="time">2017-1-1</td>
                    <td><a href="订单详情.html" class="operation">查看详情</a></td>
                </tr>
                <tr>
                    <td class="number">12451243542234</td>
                    <td class="name">杨女士</td>
                    <td class="state">已付款</td>
                    <td class="payment">￥200</td>
                    <td class="time">2017-1-1</td>
                    <td><a href="" class="operation">查看详情</a></td>
                </tr>
                <tr>
                    <td class="number">12451243543224</td>
                    <td class="name">张先生</td>
                    <td class="state">已发货</td>
                    <td class="payment">￥270</td>
                    <td class="time">2017-1-1</td>
                    <td><a href="" class="operation">查看详情</a></td>
                </tr>
                <tr>
                    <td class="number">12451243542524</td>
                    <td class="name">王女士</td>
                    <td class="state">订单完成</td>
                    <td class="payment">￥10</td>
                    <td class="time">2017-1-1</td>
                    <td><a href="" class="operation">查看详情</a></td>
                </tr>
                <tr>
                    <td class="number">12451243542224</td>
                    <td class="name">李先生</td>
                    <td class="state">未支付</td>
                    <td class="payment">￥20</td>
                    <td class="time">2017-1-1</td>
                    <td><a href="" class="operation">查看详情</a></td>
                </tr>
                <tr>
                    <td class="number">12451243542274</td>
                    <td class="name">孙女士</td>
                    <td class="state">已发货</td>
                    <td class="payment">￥170</td>
                    <td class="time">2017-1-1</td>
                    <td><a href="" class="operation">查看详情</a></td>
                </tr>
            </table>
</div>
</body>
</html>