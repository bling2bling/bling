<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/25
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<html>
<head>
    <title>item_info</title>
    <link rel="stylesheet" href="/css/mystyle2.css" type="text/css">
</head>
<body>
<%
    String errorMsg =(String) session.getAttribute("serviceError");
    if (errorMsg != null)
    {
%>
<jsp:forward page="/staff/login"></jsp:forward>
<%
    }
%>
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
    商品名称：${item.name}<br>
    所属分类：${item.categoryId}<br>
    子标题：${item.subtitle}<br>
    详细描述：${item.detail}<br>
    价格：${price}<br>
    库存：${item.stock}<br>
    size:${item.size}<br>
    color:${item.color}<br>
    detail:${item.detail}<br>
    展示图片：<c:forEach items="${mainImgList}" var="node">
        <tr>
            <img src="../../picture/main/${item.categoryId}/${node}" style="border: outset;width: 50px;height: 40px" onerror="this.src='../../picture/default.jpg'">
        </tr>
    </c:forEach><br><br>
    缩略图:<img src="../../picture/sub/${item.categoryId}/${item.subImages}" style="border: inset;width: 50px;height: 40px" onerror="this.src='../../picture/default.jpg'"><br><br>
    化妆台图:<img src="../../picture/dresser/${item.categoryId}/${item.dresserImages}" style="border: dashed;width: 50px;height: 40px" onerror="this.src='../../picture/default.jpg'">
</div>
<script type="text/javascript">
    $(document).ready(function(){
        var id=${item.categoryId};
        var obj=$("#category").find("option");
        obj.each(function(i,n){
            if (n.value==${item.categoryId}){
                n.selected=true;
            }
        });
    });
</script>
</body>
</html>
