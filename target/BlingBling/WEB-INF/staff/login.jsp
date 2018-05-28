<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>blingbling.login2</title>
    <link rel="stylesheet" href="/css/mystyle1.css" type="text/css">
    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<body>
<script type="text/javascript">
    function login(){
        var username=$("input[name='username']");
        var nameerror=$("#nameerror");
        var password=$("input[name='password']");
        var pattern = /^\w{6,10}$/;
        var username=username.val();
        if(!pattern.test(username)){
            errname.html("用户名不合规范");
            return false;
        }else{
            return true;
        }
    }
</script>
    <div id="head">
        <h1>bling bling</h1><br><br>
    </div>
    <div id="register">
        <ul>
            <form method="post"  action="/staff/login.do" onsubmit="return login()">
                <li>管理员登录</li><br>
                <li>username <input name="username" value="" type="text" placeholder="请输入用户名" required></li><span id="nameerror"></span><br>
                <li>password <input name="password" value="" type="password" placeholder="请输入密码" required></li><span id="psderror"></span><br>
                <input type="submit" value="登录"><br>
                <a href="find_password" id="forget_password" onclick="">忘记密码</a>
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