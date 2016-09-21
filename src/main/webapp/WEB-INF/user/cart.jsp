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
</head>
<body ng-app="UserApp" ng-controller="UserCtrl" ng-cloak>

<%@include file="include/header.jsp"%>

<div class="ckeckout">
		<div class="container">
			<div class="ckeckout-top">
			<div class=" cart-items heading">
			 <h1>My Cart (3)</h1>
				<script>$(document).ready(function(c) {
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
			   </script>
				
			<div class="in-check" >
				<ul class="unit">
					<li><span>Item</span></li>
					<li><span>Product Name</span></li>		
					<li><span>Unit Price</span></li>
					<li><span>Quantity</span></li>
					<li><span>Total</span></li>
					<li> </li>
					<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header simpleCart_shelfItem">
					<div class="close1"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Bracelets</span></li>
						<li><span class="item_price">$ 290.00</span></li>
						<li>
							<span>
								<form>
								    <input type="button" onclick="reduceValue()" value="-" id="decrease" / >
								   <input type="text" id="numberQty" value="0" size="10" />
								   <input type="button" onclick="increaseValue()" value="+" id="increase" / >
								</form>
							
							</span>
						</li>
						<li><span>$400</span></li>
						<!-- <li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li> -->				
					<div class="clearfix"> </div>
				</ul>
				<ul class=" cart-header1 simpleCart_shelfItem">
					<div class="close2"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c2.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Watches</span></li>
						<li><span class="item_price">$ 300.00</span></li>
						<li>
							<span>
								<form>
								    <input type="button" onclick="reduceValue()" value="-" id="decrease" / >
								   <input type="text" id="numberQty" value="0" size="10" />
								   <input type="button" onclick="increaseValue()" value="+" id="increase" / >
								</form>
							
							</span>
						</li>
						<li><span>$400</span></li>
						
						<!-- <li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li> -->						
						<div class="clearfix"> </div>
				</ul>
				<ul class="cart-header2 simpleCart_shelfItem">
					<div class="close3"> </div>
						<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c3.jpg" class="img-responsive" alt=""></a>
						</li>
						<li><span>Handbag</span></li>
						<li><span class="item_price">$ 360.00</span></li>
						<li>
							<span>
								<form>
								    <input type="button" onclick="reduceValue()" value="-" id="decrease" / >
								   <input type="text" id="numberQty" value="0" size="10" />
								   <input type="button" onclick="increaseValue()" value="+" id="increase" / >
								</form>
							
							</span>
						</li>
						<li><span>$400</span></li>
						<!-- <li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li> -->						
						<div class="clearfix"> </div>
				</ul>
			</div>
			
			<div id="TotalSumarry">
				<div class="col-md-7"></div>			 	
			 
			 <div class="well col-md-5">
			 	<h4>Sub Total: <span class="alignRight">$2434</span></h4> 
			 	<h4>Shipping: <span class="alignRight">sdfsdfwerewr</span></h4>	
			 	<h4>Grand Total: <span class="alignRight">$2434</span></h4>	
			 	
			 </div>
			 
			 <a href="/checkout" class="alignRight btn btn-primary" > Process Checkout</a>
			</div>
			
			
			</div>  
		 </div>
		 
		 
		 
		 
		 
		</div>
	</div>

<%@include file="include/footer.jsp"%>

</body>
</html>