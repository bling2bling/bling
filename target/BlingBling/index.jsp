<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/5/5
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BlingBlingUserRegister</title>
    <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
    <%--<base href="http://localhost:8080/user/">--%>
    <link rel="stylesheet" type="text/css" href="../css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="../css/demo.css" />
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="../css/component.css" />
</head>
<body>
<script type="text/javascript">
    function userLogin() {
        var xhr=null;
        var username=$('#username');
        var password=$('#password');
        if (window.XMLHttpRequest) {
            xhr = new XMLHttpRequest();
        }else{
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xhr.onreadystatechange=function(){
            if (xhr.readyState==4){
                if (xhr.status==200){
                    var str=xhr.responseText;
                    var value=JSON.parse(str);
                    var status=value.status;
                    if (status==0){
                        location.href="main.jsp";
                    }else{
                        alert(value.msg);
                    }
                }else{
                    alert(xhr.status+"不成功");
                }
            }
        }
        xhr.open("POST","http://localhost:8080/staff/login.do",true);
        //只有form才能提交post,下面必须有;在这里处理浏览器的字符集与服务器字符集不相同问题
        xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8")
        xhr.send("username="+username.val()+"&password="+password.val());
    }
</script>

<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>Bling Bling 欢迎你</h3>
                <form name="f">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input id="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户" onblur="checkUsername()">
                    </div>
                    <div class="input_outer">
                        <span class="us_uer"></span>
                        <input id="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
                    </div>
                    <div class="mb2"><input type="button" value="登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录" onclick="userLogin()" class="act-but submit"></div>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="../js/TweenLite.min.js"></script>
<script src="../js/EasePack.min.js"></script>
<script src="../js/rAF.js"></script>
<script src="../js/demo-1.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>

