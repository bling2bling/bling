<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加品类</title>
    <link rel="stylesheet" href="/css/mystyle2.css" type="text/css">
</head>
<body>
    <div id="head">
        <p class="head1">bling bling</p>
        <p class="head2">欢迎，${sessionScope.currentUser.username}</p>
        <p><a class="head3"href="login.jsp">退出</a></p>
    </div>
    <ul>
        <li><a href="/staff/staff_main.do">后台首页</a></li>
        <li><a href="/nolimit/order_index.jsp">订单管理</a></li>
        <li><a href="/staff/category/category_list.do">品类管理</a></li>
        <li><a href="/staff/product/product_list.do">商品管理</a></li>
    </ul>
    <div id="content">
        <h1>这里是商品分类列表的页面</h1>
        <form action="/staff/category/add_category.do" method="post">
            分类名称：<input type="text" name="categoryName" value="" required />
            <br>
            状态：
            <select name="status">
                <option value ="1" selected="selected">生效</option>
                <option value ="2">待生效</option>
                <option value="3">失效</option>
                <option value="4">其他</option>
            </select>
            <br>
            说明：<input type="text" name="detail" value="">
            <br />
            <input type="submit" value="新增分类">
        </form>
    </div>
</body>
</html>
