<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- AngularJS-->
<!-- <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script> -->
 <script src="${pageContext.request.contextPath}/resources/user/angular/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/user/angular/App.js"></script>

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Home</title>
<!-- Flexisel -->
<script src="${pageContext.request.contextPath}/resources/user/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/user/css/flexisel.css" rel="stylesheet" type="text/css" media="all">
<!-- End Flexisel -->

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

<!-- Start New Code here -->
<link href="${pageContext.request.contextPath}/resources/user/css/component.css" rel="stylesheet" type="text/css" media="all"/>
 <link href="${pageContext.request.contextPath}/resources/user/css/product.css" rel="stylesheet" type="text/css" media="all"/>
 
<link href="${pageContext.request.contextPath}/resources/user/css/pagination.css" rel="stylesheet" type="text/css" media="all"/>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.css">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert-dev.js"></script>


</head>
<body > <!-- ng-app="UserApp" ng-controller="UserCtrl" ng-cloak -->

<%@include file="user/include/header.jsp"%>
<%@include file="user/include/banner.jsp"%>

	<div class="product" ng-app="ProductApp" ng-controller="ProductController">
		<div class="container">
			<div class="row" style="padding-bottom:10px"> 
				<div class="col-sm-3">
					<!-- Trigger the modal with a button -->
					<!-- <button type="button" class="btn btn-info btn-md" data-toggle="modal" data-target="#myModal">Add more Camera</button> -->
				</div> 
				<div class="col-sm-6">
					<div class="input-group">
						<div class="input-group-btn search-panel">
						    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
						    	<span id="search_concept">{{btnFilter.value}}</span> <span class="caret"></span>
						    </button>
						    <ul class="dropdown-menu" role="menu">
								<li class="divider"></li>
								<li ng-repeat="search_Filter in searchFilters"> <!-- ng-repeat="search_Filter in searchFilters" -->
								  <a myVal="{{search_Filter.id}}" style="cursor: pointer;" ng-click="searchFilterClicked($index)">{{search_Filter.value}}</a>
								</li>
								<li class="divider"></li>
						    </ul>
						    <!-- <select class="form-control" id="searchFilter" ng-model="searchFilter" ng-options="search_Filter.value for search_Filter in searchFilters">
						    </select> -->
						</div>
					    <!-- <input type="hidden" name="search_param" value="all" id="search_param">          -->
					    <input type="text" class="form-control" name="x" placeholder="Search ..." ng-model="conditionValue">
					    <span class="input-group-btn">
					    	<button class="btn btn-info btn-md" type="button" ng-click="searchProduct()"><span class="glyphicon glyphicon-search"></span></button>
					    </span>
					</div>
				</div>
				<div class="col-sm-3">
					<!-- Trigger the modal with a button -->
					<!-- <button type="button" class="btn btn-info btn-md" data-toggle="modal" data-target="#myModal">Add more Camera</button> -->
				</div>
			</div>
			<div class="product-main">
				<div class=" product-menu-bar">
				    <div class="col-md-3 prdt-right">
						<div class="w_sidebar">
							<section  class="sky-form">
								<h1>Categories</h1>
								<div class="row1 scroll-pane">
									<div class="col col-4">
										<!-- <h3>All Category</h3> -->
										<a href="#" ng-click="getAllProductFilter('category','')">All Category</a>
									</div>
									<div class="col col-4" ng-repeat="Category in Categorys">
										<!-- <a href="#" ng-click="getAllProductCategory(Category.category_name)">{{Category.category_name}}</a> -->
										<a href="#" ng-click="getAllProductFilter('category',Category.category_name)">{{Category.category_name}}</a>
									</div>					
								</div>
							</section>
							<section  class="sky-form">
								<h2>Brand</h2>
								<div class="row1 row2 scroll-pane">
									<div class="col col-4">
										<a href="#" ng-click="getAllProductFilter('brand','')">All Brand</a>
									</div>
									<div class="col col-4" ng-repeat="Brand in Brands">
										<a href="#" ng-click="getAllProductFilter('brand',Brand.brand_name)">{{Brand.brand_name}}</a>
									</div>
								</div>
							</section>
							
							<section  class="sky-form">
								<h2>Model</h2>
								<div class="row1 row2 scroll-pane">
									<div class="col col-4">
										<!-- <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Model</label> -->
										<!-- <a href="#" value="All Accessories">All Model</a> -->
										<a href="#" ng-click="getAllProductFilter('model','')">All Model</a>
									</div>
									<div class="col col-4" ng-repeat="Model in Models">
										<a href="#" ng-click="getAllProductFilter('model',Model.model_name)">{{Model.model_name}}</a>
									</div>
								</div>
							</section>
							
							<section class="sky-form">
								<h4>Color</h4>
									<ul class="w_nav2">
										<li ng-repeat="Color in Colors" ><a href="#" ng-click="getAllProductFilter('color',Color.color_code)" ng-style="set_color(Color)" ></a></li>
									</ul>
							</section>
						</div>
					</div>
				</div>

				<div class="col-md-9 product-block">   
				<!-- Start New code here -->
					<div class="products-page####">
						<div class="new-product####"> 
				        	<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
								<div class="cbp-vm-options">
									<a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected" data-view="cbp-vm-view-grid" title="grid">Grid View</a>
									<a href="#" class="cbp-vm-icon cbp-vm-list" data-view="cbp-vm-view-list" title="list">List View</a>
								</div>
								<!-- <div class="pages">   
	        	 					<div class="limiter visible-desktop">
	               						<label>Show</label>
	                  						<select>
	                            				<option value="" selected="selected">9</option>
	                            				<option value="">15</option>
	                            				<option value="">30</option>
	                  						</select>per page        
	               					</div>
	       	   					</div> -->
								<div class="clearfix"></div>
								<ul>
									<li ng-repeat="Product in Products">
										<div class="simpleCart_shelfItem">
											<a class="cbp-vm-image" href="/detail">
												<div class="view view-first">
													<div class="inner_content clearfix">
														<div class="product_image">
															<%-- <img src="${pageContext.request.contextPath}/resources/user/img/p2.jpg" class="img-responsive" alt=""/> --%>
															<img ng-src="http://localhost:9999/{{Product.images[0].image_url}}" class="img-responsive" alt=""/>
															<div class="mask">
																<div class="info">View Detail</div>
															</div>
															<div class="product_container">
																<div class="cart-left">
																	<p class="title">{{Product.product_name}}</p>
																</div>
																<div class="pricey"><span class="item_price">{{Product.sell_price | currency}}</span></div>
																<div class="pricey"><p class="title" style="color:red;">{{Product.product_id.substring(1, 2) == "O" ? "USED":"NEW"}}</p></div>
																<div class="clearfix"></div>
															</div>		
														</div>
													</div>
												</div>
											</a>
											<div class="cbp-vm-details">
												{{Product.description}}
											</div>
											<a class="cbp-vm-icon cbp-vm-add item_add" href="#" ng-click = "addToCart($index)">Add to cart</a>
											<a class="cbp-vm-icon cbp-vm-add item_add" href="#" ng-click = "addToWishlist($index)">Add to Wishlist</a>
										</div>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>   
			</div>
			<div>
				<nav role="navigation">
					<ul class="cd-pagination no-space">
						<li class="button"><a href="#" ng-click="getProductsByPagePrev()">Prev</a></li>
						<li  ng-repeat = "page in Pagination"><a href="#" ng-class="($index == bntClickedIndex) ? 'current' : ''" ng-click="getProductsByPage($index)">{{page}}</a></li>
						<li class="button"><a href="#" ng-click="getProductsByPageNext()">Next</a></li>
					</ul>
				</nav> <!-- cd-pagination-wrapper -->
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/resources/user/js/allProducts.js"></script>
<%-- <%@include file="user/include/popular.jsp"%> --%>

<%@include file="user/include/footer.jsp"%>

</body>
</html>