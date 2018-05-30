<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:float="http://www.w3.org/1999/xhtml">
<head>
    <title>ForgetCheckAnswer</title>
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
                <a href="item/index.jsp"><img src="/img/logo.png" alt=""></a>
            </div>
        </div>
    </div>
    <div class="header-top">
        <div class="container">
            <div class="col-sm-5 col-md-offset-2  header-login">
                <ul >

                    <li><a href="/login">登录</a></li>
                    <li><a href="/registe">注册</a></li>

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
        <h3>忘记密码</h3>
        <br/>
        <form method="post"  action="/user/forget_check_answer.do">
            <div class="col-md-6 login-do">
                <div>
                </div>
                <br/>
                <h3>
                    <small>密保问题：${question}</small>
                </h3>
                <br>
                <div class="login-mail22">
                    <input type="text" placeholder="请输入密保答案" required="" name="answer">
                    <i  class="glyphicon glyphicon-phone"></i><small>${answerError}</small>
                </div>
                <label class="hvr-skew-backward">
                    <input type="submit" value=" 下一步" >
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

</body>
</html>