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
    <script src="js/jquery.min.js"></script>
    <!--- start-rate---->
    <script src="js/jstarbox.js"></script>
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
                <a href="item/index.jsp"><img src="/img/logo.png" alt=""></a>
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
        <h3>重置密码</h3>
        <form method="post"  action="/user/forget_reset_password.do">
            <div class="col-md-6 login-do">
                <br/>
                <div class="login-mail22">
                    <input placeholder="请输入旧密码" required="" type="password" id="password" name="passwordOld">
                    <i  class="glyphicon glyphicon-lock"></i>
                </div>
                <div class="login-mail22">
                    <input placeholder="请输入新密码" required="" type="password" id="passwordNew">
                    <i  class="glyphicon glyphicon-lock"></i>
                </div>
                <div class="login-mail22">
                    <input placeholder="请重复新密码" required="" type="password" id="passwordNew2">
                    <i  class="glyphicon glyphicon-lock"></i><small id="pwdAccord">${resetPwdError}</small>
                </div>
                <label class="hvr-skew-backward">
                    <input type="submit" value=" 重置密码">
                </label>
            </div>
            <div class="clearfix">
            </div>
        </form>

        <div class="ax_default label">
            <div class=""></div>
        </div>
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


<!--//content-->

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/bootstrap.min.js"></script>
<script>
    function checkAccord(){
        var pwd1=$("#passwordNew");
        var pwd2=$("#passwordNew2");
        if (pwd1.val()!=pwd2.val()){
            $("#pwdAccord").html("两次输入不一致");
        }
    }
</script>
</body>
</html>