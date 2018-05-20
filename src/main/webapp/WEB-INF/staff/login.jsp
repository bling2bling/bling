<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>blingbling.login2</title>
    <link rel="stylesheet" href="/css/mystyle1.css" type="text/css">
</head>
<body>
    <div id="head">
        <h1>bling bling</h1><br><br>
    </div>
    <div id="register">
        <ul>
            <form method="post"  action="/staff/login.do">
                <li>管理员登录</li><br>
                <li>username <input name="username" value="" type="text" placeholder="请输入用户名" required></li><br>
                <li>password <input name="password" value="" type="password" placeholder="请输入密码" required></li><br>
                <%--<button type="button" id="button" onclick="">登录</button>&nbsp;--%>
                <input type="submit" value="登录">
                <span id="reflect"></span><br>
                <a href="find_password" id="forget_password" onclick="userLogin()">忘记密码</a>
            </form>
        </ul>
    </div>
    <br>
    <br>
    <br>
    <div id="footer">
        <p>联系我们 @******@**.**</p>
    </div>
</body>
</html>