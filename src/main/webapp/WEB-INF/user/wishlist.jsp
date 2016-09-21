<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Home</title>

<script src="${pageContext.request.contextPath}/resources/user/angular/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/user/angular/App.js"></script>

<link href="${pageContext.request.contextPath}/resources/user/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/resources/user/js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/resources/user/css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Hind:400,500,300,600,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/user/js/move-top.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/user/js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
<script src="${pageContext.request.contextPath}/resources/user/js/simpleCart.min.js"> </script>
<script src="${pageContext.request.contextPath}/resources/user/js/bootstrap.min.js"></script>

<link href="${pageContext.request.contextPath}/resources/user/css/pagination.css" rel="stylesheet" type="text/css" media="all"/>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.css">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert-dev.js"></script>

</head>
<body ng-app="wishlistApp" ng-controller="wishlistController">

<%@include file="include/header.jsp"%>

<div class="ckeckout">
		<div class="container">
			<div class="ckeckout-top">
			<div class=" cart-items heading">
			 <h1>My Wishlist ({{countWishlist}})</h1>
			<!-- <script>
				$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
					});	  
				});
		   </script>
			<script>$(document).ready(function(c) {
					$('.close2').on('click', function(c){
						$('.cart-header1').fadeOut('slow', function(c){
							$('.cart-header1').remove();
						});
						});	  
					});
			   </script>
			   <script>$(document).ready(function(c) {
					$('.close3').on('click', function(c){
						$('.cart-header2').fadeOut('slow', function(c){
							$('.cart-header2').remove();
						});
						});	  
					});
			   </script> -->
				
			<div class="in-check" >
				<ul class="unit">
					<li style="width:100px;"><span>Item</span></li>
					<li style="width:450px;"><span>Product Name</span></li>	
					<li style="width:100px;"><span>Color</span></li>	
					<li style="width:100px;"><span>Unit Price</span></li>
					<li style="width:100px;"><span>Type</span></li>
					<li ><span>Add To Cart</span></li>
					<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header simpleCart_shelfItem" ng-repeat = "wishlist in wishlists">
					<div class="close1" ng-click = "deleteWishlist($index)"> </div>
					<li class="ring-in" style="width:100px;">
						<a href="/detail" >
							<img ng-src="http://localhost:9999/{{wishlist.product.images[0].image_url}}" class="img-responsive" style="width:80px;hieght:80px" alt="">
						</a>
					</li>
					<li style="width:450px;">
						<a href="/detail" ><span>{{wishlist.product.product_name}}</span></a>
					</li>
					<li style="width:100px;"><span ng-style = "set_color(wishlist.product.color)">{{wishlist.product.color.color_name}}</span></li>
					<li style="width:100px;"><span class="item_price">{{wishlist.product.sell_price | currency}}</span></li>
					<li style="width:100px;"><span style="color:red;">{{wishlist.product.product_id.substring(1, 2) == "O" ? "USED":"NEW"}}</span></li>
					<li> <a href="#" class="add-cart cart-check item_add" ng-click = "addToCart(wishlist.product)">Add to cart</a></li>				
					<div class="clearfix"> </div>
				</ul>
<%-- 
				
				
				
				<ul class="cart-header simpleCart_shelfItem">
					<div class="close1"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Bracelets</span></li>
						<li><span class="item_price">$ 290.00</span></li>
						<li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li>				
					<div class="clearfix"> </div>
				</ul> --%>
				<%-- <ul class="cart-header simpleCart_shelfItem">
					<div class="close1"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Bracelets</span></li>
						<li><span class="item_price">$ 290.00</span></li>
						<li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li>				
					<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header simpleCart_shelfItem">
					<div class="close1"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Bracelets</span></li>
						<li><span class="item_price">$ 290.00</span></li>
						<li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li>				
					<div class="clearfix"> </div>
				</ul>
				<ul class=" cart-header1 simpleCart_shelfItem">
					<div class="close2"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c2.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Watches</span></li>
						<li><span class="item_price">$ 300.00</span></li>
						<li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li>						
						<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header2 simpleCart_shelfItem">
					<div class="close3"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c3.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Handbag</span></li>
						<li><span class="item_price">$ 360.00</span></li>
						<li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li>						
						<div class="clearfix"> </div>
				</ul> --%>
			</div>
			</div>  
		 </div>
		<div>
			<nav role="navigation">
				<ul class="cd-pagination no-space">
					<li class="button"><a href="#" ng-click="getWishlistByPagePrev()">Prev</a></li>
					<li  ng-repeat = "page in Pagination"><a href="#" ng-class="($index == bntClickedIndex) ? 'current' : ''" ng-click="getWishlistByPage($index)">{{page}}</a></li>
					<li class="button"><a href="#" ng-click="getWishlistByPageNext()">Next</a></li>
				</ul>
			</nav> <!-- cd-pagination-wrapper -->
		</div>
		</div>
	</div>

<%@include file="include/footer.jsp"%>

	<script src="${pageContext.request.contextPath}/resources/user/js/wishlist.js"></script>
</body>
</html>