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

<div class="container aboutUs">
	<div class="col-md-3 ">
	<h1>About Us</h1>
	<p>
		Welcome to SL10 Camera Shop in Cambodia ! 
SL CAM TEN SHOP. Established in late 2010 and has been a prominent Degital online Shop destination in Cambodia ever since . Our customer service is ready to answer your questions in almost any waking hour. We redefine Degital shopping experience in Cambodia. As a premier photo and video outlet, we are full line dealers for the entire range of photographic equipment and supplies. 
Whether you are a leading professional or new to photography, our expert staff are always ready to assist you in finding the perfect equipment at great prices.
	</p>
	<h2>President : Nemo Ruy Setec Institute</h2>
	<img src="${pageContext.request.contextPath}/resources/user/img/Monster.jpg" class="img-responsive" alt=""/>
	</div>
	
	<div class="col-md-9 ">
	<img src="${pageContext.request.contextPath}/resources/user/img/1.jpg" class="img-responsive" alt=""/>
	<img src="${pageContext.request.contextPath}/resources/user/img/2.jpg" class="img-responsive" alt=""/>
	</div>
</div>

<%@include file="include/footer.jsp"%>

</body>
</html>