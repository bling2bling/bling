<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<jsp:include page="/nolimit/staffIsLogin.jsp"></jsp:include>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
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
	<link href="/css/blingstyle.css" rel="stylesheet" type="text/css" media="all" />
 <link href='/css/jquery.gridly.css' rel='stylesheet' type='text/css'>
    <link href='/css/sample.css' rel='stylesheet' type='text/css'>
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
	<!-- blingdresser梳妆台滑动效果-->
	<script type="text/javascript">
        var documentHeight = 0;
        var topPadding = 15;
        $(function() {
            var offset = $("#blingdresser").offset();
            documentHeight = $(document).height();
            $(window).scroll(function() {
                var sideBarHeight = $("#blingdresser").height();
                if ($(window).scrollTop() > offset.top) {
                    var newPosition = ($(window).scrollTop() - offset.top) + topPadding;
                    var maxPosition = documentHeight - (sideBarHeight + 368);
                    if (newPosition > maxPosition) {
                        newPosition = maxPosition;
                    }
                    $("#blingdresser").stop().animate({
                        marginTop: newPosition
                    });
                } else {
                    $("#blingdresser").stop().animate({
                        marginTop: 0
                    });
                };
            });
        });
	</script>
    <script type="text/javascript" src="/js/jquery.js"></script>
</head>
<body>
<!--1.banner-->
<div class="banner-top-bling">

</div>
<!--2.header-->
<div class="header">
	<!--2.1logo-->
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="index.jsp"><img src="/img/logo.png" alt=""></a>
			</div>
		</div>
	</div>
	<!--2.1个人导航栏-->
	<div class="header-top-bling">
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul id="assert_login">
						<li><a href="../../login">登录</a></li>
						<li><a href="../../register">注册</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
	</div>
	</div>
	<!--菜单栏-购物车	-->
	<!--<div class="container">
			<div class="head-top">
				&lt;!&ndash;购物车&ndash;&gt;
			<div class="col-sm-2 search-right">
				<ul class="heart">
				<li>
				<a href="wishlist.html" >
				<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
				</a></li>
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i></a></li>
					</ul>
					<div class="cart box_1">
						<a href="checkout.html">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="/img/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>

						&lt;!&ndash;-&ndash;&gt;

						&lt;!&ndash;-pop-up-box&#45;&#45;&ndash;&gt;
			<link href="/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="/js/jquery.magnific-popup.js" type="text/javascript"></script>
			&lt;!&ndash;-//pop-up-box&#45;&#45;&ndash;&gt;
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
						<input type="submit" value="">
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}">
					</div>
					<p>Shopin</p>
				</div>
			</div>
		 <script>
			$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
			});

			});
		</script>
						&lt;!&ndash;-&ndash;&gt;
			</div>
			<div class="clearfix"></div>
		</div>
	</div>-->
</div>
	<!--3content-->
<div class="content">
	<div class="container">
        <div class="content-top-bling">
		<!--3.1主要栏目-->
		<!--3.1.1左侧-->
		<div id = "blingdresser" class="col-md-6-bling">
            <!--梳妆台商品栏-->
             <div class="mid-popular-bling">
                    <div><p style="color: #F67777;">点击商品试试BlingBling！</p></div>
                    <div id="dresserpic1" class="dresserpro">
                            <li class="" >

                                <img src="/img/2.jpg"  class="img-responsive"><i></i></li >
                    </div>

                <div  class="dresserpro">
                     <p id="tishi"style="display:none;color: #7f8c8d;font-size:0.8em;">快去选择商品加入Bling梳妆吧</p>
                     <li id="dresserpic2" class="" style="position: relative;">
                         <a style="position:absolute;right:0;top:0;" href="#" >x</a>
                          <img src="/img/2.jpg"  class="img-responsive"><i></i></li >
                 </div>

                 <div id="dresserpic3" class="dresserpro">
                        <li class=""><img src="/img/product2.jpg"  class="img-responsive"><i></i></li ></div>
                    <div id="dresserpic4" class="dresserpro">
                        <li class=""><img src="/img/producthat.jpg"  class="img-responsive"><i></i></li >
                    </div>
                 <div id="text" class="dresserpro" style="display: none;">
                     <p style="color: #7f8c8d;font-size:3em;">快去选择商品加入Bling梳妆吧！</p>
                 </div>
                    <div class="clearfix"></div>
                 <!--梳妆台商品选中和取消选中功能-->
                 <script type="text/javascript">
                     $(function(){
                         $(".dresserpro li ").click(function(){
                             if($(this).hasClass("newlist")){//取消选中
                                $(this).removeClass("newlist") ;

                             }
                             else {//选中
                                 $(this).addClass("newlist").siblings().removeClass("newlist");

                             }
                         })
                     })
                  $(function(){
                         $(".dresserpro li a ").click(function(){
                             $("#dresserpic2").remove();
                             $("#tishi").show();
                         })
                     })

                 </script>
             </div>
            <!--照片区域-->
            <div class="mid-popular-bling" >
                <img id="dresserpic" src="/img/pi.jpg" class="img-responsive" alt=""/>
                <div class="container-bling-blank">
                 <input type="file"  id="open_file" style="display:none">
                    <input type="submit" value="上传照片" onclick="F_Open_dialog()" >
                    <input type="submit" value="分享" style="float:right;">
                </div>
                <!--<input type="submit" value="Subscribe">-->
                <script type="text/javascript">
                    function F_Open_dialog()
                    {
                        document.getElementById("open_file").click();
                    }
                </script>
                <div class="clearfix"></div>
            </div>
            <!--梳妆台商品属性及加入购物车-->
            <div class="mid-popular-bling" id="cartbutton" >
                <div class="container-bling-blank">
                    <input type="submit" value="一键加入购物车" style="float:right;width:40%;">
                </div>

                <div class="clearfix"></div>
            </div>
        </div>
            <!--3.1.2右侧-->
		<div class="col-md-6-bling2">

            <!--3.1.2.1菜单导航-->
					<!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                <ul class="nav navbar-nav nav_1">
                    <c:forEach items="${clist}" var="node">
                    <li>
                        <a class="color1" href="/user/item/item_list_id.do?categoryId=${node.id}" class="dropdown-toggle" a>${node.categoryName}</a>
                    </li>
                    </c:forEach>
                </ul>
               <div class="container-bling-blank">
                   <form method="post"  action="/user/item/search_list.do">
                       <p><input type="submit" style="width:5em;float:right" value="搜索" required/></p>
                       <p> <input type="text"  placeholder="请输入关键字搜索" required name="search" value=""/></p>
                   </form>
               </div>
            </div>
            <!--行1-->
            <div id="noneItem">

            </div>
                <div class="mid-popular">
							<!--单个商品-->
                    <c:forEach items="${item_list}" var="item" varStatus="status">
                            <div class="col-md-3-bling item-grid simpleCart_shelfItem">
                                <div class=" mid-pop">
                                  <!-- 商品图片-->
                                    <div class="pro-img">
                                            <a href="single.html"><img src="../../picture/main/${item.categoryId}/${item.mainImage[0]}" onerror="this.src='../../picture/default.jpg'"class="img-responsive"></a>
                                    </div>
                                    <!--商品属性-->
                                    <div class="mid-1-bling">
                                        <div class="women-top">
                                            <h5><a  href="single.html">${item.name}</a></h5>
                                        </div>
                                        <div class="mid-2">
                                            <p>￥${item.price}</p>
                                            <div class="addtobling" >
                                                <a href="#" >加入Bling</a>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        <c:if  test="${status.count % 4 eq 0 || status.count eq 4}">
                            <br><br>
                        </c:if>
                    </c:forEach>
	<!--3.2products
			<div class="content-mid">
				<h3>Trending Items</h3>
				<label class="line"></label>
				行1
				<div class="mid-popular">
					单个商品
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Women</span>
							<h6><a href="single.html">Sed ut perspiciati</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc1.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc1.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Women</span>
							<h6><a href="single.html">At vero eos</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc2.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc2.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Men</span>
							<h6><a href="single.html">Sed ut perspiciati</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc3.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc3.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Women</span>
							<h6><a href="single.html">On the other</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="clearfix"></div>
				</div>
				行2
				<div class="mid-popular">
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc4.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc4.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Men</span>
							<h6><a href="single.html">On the other</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc5.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc5.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Men</span>
							<h6><a href="single.html">Sed ut perspiciati</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc6.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc6.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Women</span>
							<h6><a href="single.html">At vero eos</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
						<img src="/img/pc7.jpg" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="/img/pc7.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
						<a href="single.html"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
							<span>Men</span>
							<h6><a href="single.html">Sed ut perspiciati</a></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="/img/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$70.00</em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>

								<div class="clearfix"></div>
							</div>

						</div>
					</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			//products-->
        </div>
        </div>
        </div>
    </div>
</div>

	<!--//content-->
	<!--//footer-->
	<div class="footer">
	<div class="footer-middle">
				<div class="container">

					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="footer-bottom">
				<div class="container">
					<p class="footer-class">Bling!Bling!Bling!联系我们：bling@bling.con.cn </p>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!--//footer-->
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="/js/bootstrap.min.js"></script>
<!--light-box-files -->
<script src="/js/jquery.chocolat.js"></script>
<script src='/js/jquery-delete.js' type='text/javascript'></script>
<script src='/js/jquery-ui.js' type='text/javascript'></script>
<script src='/js/jquery.gridly.js' type='text/javascript'></script>
<script src='/js/sample.js' type='text/javascript'></script>
<script src='/js/rainbow.js' type='text/javascript'></script>
<link rel="stylesheet" href="/css/chocolat.css" type="text/css" media="screen" charset="utf-8">
<!--light-box-files -->
<script type="text/javascript" charset="utf-8">
		$(function() {
			$('a.picture').Chocolat();
		});
</script>
</body>
</html>