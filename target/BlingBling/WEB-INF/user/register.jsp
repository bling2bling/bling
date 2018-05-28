<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:float="http://www.w3.org/1999/xhtml">
<head>
    <title>Register</title>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--theme-style-->
    <link href="/css/style4.css" rel="stylesheet" type="text/css" media="all" />
    <!--//theme-style-->
    <script src="/js/jquery.min.js"></script>
    <!--- start-rate---->
    <script src="/js/jstarbox.js"></script>
    <link rel="stylesheet" href="/css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
    <script type="text/javascript">
        jQuery(function() {
            jQuery('.starbox').each(function() {
                var starbox = jQuery(this);
                starbox.starbox({
                    average: starbox.attr('data-start-value'),
                    changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
                    ghosting: starbox.hasClass('ghosting'),
                    autoUpdateAverage: starbox.hasClass('autoupdate'),
                    buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
                    stars: starbox.attr('data-star-count') || 5
                }).bind('starbox-value-changed', function(event, value) {
                    if(starbox.hasClass('random')) {
                        var val = Math.random();
                        starbox.next().text(' '+val);
                        return val;
                    }
                })
            });
        });
    </script>
    <!---//End-rate---->
</head>
<body>

<!--banner-->
<div class="banner-top">
    <div class="container">

    </div>
</div>
<!--banner-->

<!--header-->
<div class="header">
    <div class="container">
        <div class="head">
            <div class=" logo">
                <a href="index.jsp"><img src="/img/logo.png" alt=""></a>
            </div>
        </div>
    </div>
    <div class="header-top">
        <div class="container">
            <div class="col-sm-5 col-md-offset-2  header-login">
                <ul >

                    <li><a href="/login">登录</a></li>
                    <li><a href="/register">注册</a></li>
                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>

    <div class="container">

        <div class="head-top">

            <div class="col-sm-8 col-md-offset-2 h_menu4">

            </div>

            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--header-->

<!--login-->
<div class="container">
    <div class="login">
        <h3>用户注册</h3>
        <br/>
        <form method="post"  action="/user/register.do">
            <div class="col-md-6 login-do">
                <div>
                </div>
                <br/>
                <div class="login-mail22">
                    <input type="text" placeholder="请输入邮箱" required="" name="email" onblur="checkEmail()">
                    <i  class="glyphicon glyphicon-user"></i><small id="emailError">${emailError}</small>
                </div>
                <div class="login-mail22">
                    <input type="text" placeholder="请输入用户名" required=""name="username" onblur="checkName()">
                    <i  class="glyphicon glyphicon-phone"></i><small id="nameError">${nameError}</small>
                </div>
                <div class="login-mail22">
                    <input placeholder="请输入密保问题" required="" type="password" name="question">
                    <i  class="glyphicon glyphicon-lock"></i><small>${questionError}</small>
                </div>
                <div class="login-mail22">
                    <input placeholder="请输入密保答案" required="" type="password" name="answer">
                    <i  class="glyphicon glyphicon-lock"></i><small>${answerError}</small>
                </div>
                <div class="login-mail22">
                    <input placeholder="请输入密码" required="" type="password" name="password">
                    <i  class="glyphicon glyphicon-lock"></i><small>${passwordError}</small>
                </div>
                <div class="login-mail22">
                    <input placeholder="请重复密码" required="" type="password" name="password2" onblur="checkAccord()">
                    <i  class="glyphicon glyphicon-lock"></i><small id="pwdAccord">${password2Error}</small>
                </div>
                <label class="hvr-skew-backward">
                    <input type="submit" value="     注册    "  >
                </label>
                <br/>

            </div>
            <div class="clearfix"> </div>
        </form>
    </div>

</div>
<!--login-->

<!--brand-->
<div class="container">
    <div class="brand">
        <div class="blank">

        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!--//brand-->



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<script src="/js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="/js/bootstrap.min.js"></script>
<script type="text/javascript">
    function checkEmail(){
        var email=$("input[name='email']");
        $.ajax({
            type:"POST",
            url:"/user/check_valid.do",
            data:"str="+email.val()+"&type="+"email",
            success:function(msg){
                var status = msg['status'];
                var msg=msg['msg'];
                if (status!=0){
                    $("#emailError").html(msg);
                }else{
                    $("#emailError").html("");
                }
            },
            error:function(er){
                alert(er.message);
            }
        });
    }
    function checkName(){
        var username=$("input[name='username']");
        $.ajax({
            type:"POST",
            url:"/user/check_valid.do",
            data:"str="+username.val()+"&type="+"username",
            success:function(msg){
                var status = msg['status'];
                var msg=msg['msg'];
                if (status!=0){
                    $("#nameError").html(msg);
                }
            },
            error:function(er){
                alert(er.message);
            }
        });
    }
    function checkAccord(){
        var pwd1=$("input[name='password']");
        var pwd2=$("input[name='password2']");
        if (pwd1.val()!=pwd2.val()){
            $("#pwdAccord").html("两次输入不一致");
        }
    }
</script>
</body>
</html>