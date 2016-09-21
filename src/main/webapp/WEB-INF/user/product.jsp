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

<!-- Start New Code here -->
<link href="${pageContext.request.contextPath}/resources/user/css/component.css" rel="stylesheet" type="text/css" media="all"/>
 <link href="${pageContext.request.contextPath}/resources/user/css/product.css" rel="stylesheet" type="text/css" media="all"/>

</head>
<body ng-app="UserApp" ng-controller="UserCtrl" ng-cloak>

<%@include file="include/header.jsp"%>

<div class="product">
	<div class="container">
		<div class="product-main">
			  <div class=" product-menu-bar">
			    	<div class="col-md-3 prdt-right">
					<div class="w_sidebar">
						<section  class="sky-form">
							<h1>Categories</h1>
							<div class="row1 scroll-pane">
								<div class="col col-4">
									<!--  <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Accessories</label> -->									
									 <a href="#" value="All Accessories">All Accessories</a>
								</div>
								
							</div>
						</section>
						<section  class="sky-form">
							<h2>Brand</h2>
							<div class="row1 row2 scroll-pane">
								<div class="col col-4">
									<!-- <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Brands</label> -->
									<a href="#" value="All Accessories">All Brand</a>
								</div>
								
							</div>
						</section>
						
						<section  class="sky-form">
							<h2>Model</h2>
							<div class="row1 row2 scroll-pane">
								<div class="col col-4">
									<!-- <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Model</label> -->
									<a href="#" value="All Accessories">All Model</a>
								</div>
								
							</div>
						</section>
						
						<section class="sky-form">
							<h4>Colour</h4>
								<ul class="w_nav2">
									<li><a class="color1" href="#"></a></li>
									<li><a class="color2" href="#"></a></li>
									<li><a class="color3" href="#"></a></li>
									<li><a class="color4" href="#"></a></li>
									<li><a class="color5" href="#"></a></li>
									<li><a class="color6" href="#"></a></li>
									<li><a class="color7" href="#"></a></li>
									<li><a class="color8" href="#"></a></li>
									<li><a class="color9" href="#"></a></li>
									<li><a class="color10" href="#"></a></li>
									<li><a class="color12" href="#"></a></li>
									<li><a class="color13" href="#"></a></li>
									<li><a class="color14" href="#"></a></li>
									<li><a class="color15" href="#"></a></li>
									<li><a class="color5" href="#"></a></li>
									<li><a class="color6" href="#"></a></li>
									<li><a class="color7" href="#"></a></li>
									<li><a class="color8" href="#"></a></li>
									<li><a class="color9" href="#"></a></li>
									<li><a class="color10" href="#"></a></li>
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
					<div class="pages">   
        	 <div class="limiter visible-desktop">
               <label>Show</label>
                  <select>
                            <option value="" selected="selected">
                    9                </option>
                            <option value="">
                    15                </option>
                            <option value="">
                    30                </option>
                  </select> per page        
               </div>
       	   </div>
					<div class="clearfix"></div>
					<ul>
					  <li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
							 <div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p1.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">perspiciatis</p>
									   </div>
									   <div class="pricey"><span class="item_price">$259.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
		                    </a>
							<div class="cbp-vm-details">
								Silver beet shallot wakame tomatillo salsify mung bean beetroot groundnut.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
							  <div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p2.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Great Explorer</p>
									   </div>
									   <div class="pricey"><span class="item_price">$189.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							 </a>
							<div class="cbp-vm-details">
								Wattle seed bunya nuts spring onion okra garlic bitterleaf zucchini.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p3.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Similique Sunt</p>
									   </div>
									   <div class="pricey"><span class="item_price">$699.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p4.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Shrinking</p>
									   </div>
									   <div class="pricey"><span class="item_price">$599.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean kombu chard.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p5.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Perfectly Simple</p>
									   </div>
									   <div class="pricey"><span class="item_price">$459.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean kombu chard.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p6.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Equal Blame</p>
									   </div>
									   <div class="pricey"><span class="item_price">$119.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean kombu chard.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p7.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Neque Porro</p>
									   </div>
									   <div class="pricey"><span class="item_price">$289.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean kombu chard.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p8.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Perfectly Simple</p>
									   </div>
									   <div class="pricey"><span class="item_price">$169.12</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean kombu chard.
							</div>
							<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
						<li>
							<a class="cbp-vm-image" href="/detail">
								<div class="simpleCart_shelfItem">
								<div class="view view-first">
					   		  <div class="inner_content clearfix">
								<div class="product_image">
									<img src="${pageContext.request.contextPath}/resources/user/img/p9.jpg" class="img-responsive" alt=""/>
									<div class="mask">
			                       		<div class="info">Quick View</div>
					                  </div>
									<div class="product_container">
									   <div class="cart-left">
										 <p class="title">Praising Pain</p>
									   </div>
									   <div class="pricey"><span class="item_price">$199.00</span></div>
									   <div class="clearfix"></div>
								     </div>		
								  </div>
			                     </div>
		                      </div>
							</a>
							<div class="cbp-vm-details">
								Kohlrabi bok choy broccoli rabe welsh onion spring onion tatsoi ricebean kombu chard.
							</div>
								<a class="cbp-vm-icon cbp-vm-add item_add" href="#">Add to cart</a>
							</div>
						</li>
					</ul>
				</div>
				<script src="${pageContext.request.contextPath}/resources/user/js/cbpViewModeSwitch.js" type="text/javascript"></script>
                <script src="${pageContext.request.contextPath}/resources/user/js/classie.js" type="text/javascript"></script>
			</div>
		</div>
			   
		
			  </div> 
			  
			  
		</div>
	</div>
</div>

<%@include file="include/footer.jsp"%>

</body>
</html>