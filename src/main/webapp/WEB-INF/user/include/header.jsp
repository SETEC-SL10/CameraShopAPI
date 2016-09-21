<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
    
<!-- header-section-starts -->
	<div class="header">
		<div class="header-top-strip">
			<div class="container">
				<div class="header-top-left">
					<ul>
						<!-- <li><a href="/login" id="login"><span class="glyphicon glyphicon-user"> </span>Login</a></li> -->
						<li><a href="/login" id="login"><span class="glyphicon glyphicon-user"> </span>{{user}}</a></li>
						<li><a href="/register"><span class="glyphicon glyphicon-lock"> </span>Register</a></li>	
	
					</ul>
				</div>
				
				 <div style="display:inline">
				 	<select class="" ng-model="type">			       
                       <option ng-repeat="x in search" value="{{x.data}}" >{{x.data}}</option>
                  </select> 
                  
                  
	                
	                  <input type="text" name="" id="" placeholder="Search here ">
	                  <button type="submit"><span class="fa fa-search"></span>Search</button>
	            
	                
				 </div>
				
				<div class="header-right-align">					
					
					<a href="checkout.html">
						<span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span> items)<img src="${pageContext.request.contextPath}/resources/user/img/bag.png" alt="">
					</a>
					<span><a href="javascript:;" class="simpleCart_empty">Empty cart</a></span>	
					<a href="/checkout"> <span>Checkout</span> </a>
					<a href="/wishlist"> <span>Wishlist</span> </a>
					<a href="/cart"> <span>Cart</span> </a>
					<a href="/account"> <span>Account</span> </a>
					
					
					
							
				</div>				
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<div class="inner-banner">
		<div class="container">
			<div class="banner-top inner-head">
				<nav class="navbar navbar-default" role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<div class="navbar-brand logo">
							<a href="/"><img src="${pageContext.request.contextPath}/resources/user/img/logo1.png" alt=""></a>
						</div>
					</div>
	    <!--/.navbar-header-->
	
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	  
	        <ul class="nav navbar-nav" style="float:left">
			<li><a href="/">Home</a></li>
		        
		       
		        <li class="dropdown">
		        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Products <b class="caret"></b></a>
		            <ul class="dropdown-menu multi-column columns-2">
			            <div class="row">
				            <div class="col-sm-6">
					            <ul class="multi-column-dropdown">
									<h6>CAMERAS</h6>
						            <li><a href="/product">New Camera</a></li>
						            <li><a href="/product">Old Camera</a></li>
					            </ul>
				            </div>
				            <div class="col-sm-6">
					             <ul class="multi-column-dropdown">
									<h6>ACCESSORIES</h6>
						            <li><a href="/product">New Accessory</a></li>
						            <li><a href="/product">Old Accessory</a></li>
					            </ul>
				            </div>
							<!-- <div class="clearfix"></div> -->
			            </div>
		            </ul>
		        </li>
		       
		        	<li><a href="/warranty">WARRANTY & SUPPORT</a></li>
					<li><a href="/promotion">PROMOTION</a></li>
					<li><a href="/contact">CONTACT US</a></li>
					<li><a href="/about">ABOUT US</a></li>
	        </ul>
	    </div>
	    <!--/.navbar-collapse-->
			</nav>
	<!--/.navbar-->
		</div>
	</div>
</div>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

<%-- <div class="header">
	<div class="container">
		<div class="header-main">
			<div class="top-nav">
				<div class="content white">
	              <nav class="navbar navbar-default" role="navigation">
					    <div class="navbar-header">
					        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						        <span class="sr-only">Toggle navigation</span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
						        <span class="icon-bar"></span>
					        </button>
					        <div class="navbar-brand logo">
								<a href="/"><img src="${pageContext.request.contextPath}/resources/user/img/logo1.png" alt=""></a>
							</div>
					    </div>
					    <!--/.navbar-header-->
					 <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					        <ul class="nav navbar-nav">
					        	   <li><a href="/product">Product</a></li>
					        	   <li><a href="/contact">Contact</a></li>
					        	   
						            <!--  <li class="dropdown">
						        	<a href="#" class="dropdown-toggle" data-toggle="dropdown">Product <b class="caret"></b></a>
						            <ul class="dropdown-menu multi-column columns-3">
							            <div class="row">
								            <div class="col-sm-12">
									            <ul class="multi-column-dropdown">
										            <li><a href="/product">Accessories New</a></li>
										            <li><a href="/product">Accessories Old</a></li>
										            <li><a href="/product">Cameras New</a></li>
										            <li><a href="/product">Cameras Old</a></li>										    
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m.html">Shirts</a></li>
										            <li><a href="product-m.html">Shoes,Boots</a></li>
										            <li><a href="product-m.html">Shorts</a></li>
										             <li><a href="product-m.html">Watches</a></li>
										            <li><a href="product-m.html">Sunglasses</a></li>
										             <li><a href="product-m.html">Bands</a></li>
										            <li><a href="product-m.html">Swimwear</a></li>
									            </ul>
								            </div>
								            <div class="col-sm-4">
									            <ul class="multi-column-dropdown">
										            <li><a href="product-m.html">Jewellery</a></li>
										            <li><a href="product-m.html">Jack & Jones</a></li>
										            <li><a href="product-m.html">Ray-Ban</a></li>
										             <li><a href="product-m.html">Lipsticks</a></li>
										            <li><a href="product-m.html">Longer wear</a></li>
										            <li><a href="product-m.html">sarees</a></li>
										            <li><a href="product-m.html">Nike</a></li>
									            </ul>
								            </div>
							            </div>
						            </ul>
						        </li> -->
						           
						         
						        <!-- <li><a href="/contact">Contact</a></li> -->
					        </ul>
					    </div>
					    <!--/.navbar-collapse-->
					</nav>
					<!--/.navbar-->
				</div>
			</div>
			<div class="header-right">
					<!-- <select class="form-control" ng-model="catID">			       
                        <option ng-repeat="x in category" value="{{x.CAT_ID}}">{{x.CAT_NAME}}</option>
                   	</select> -->
				<div class="search">
					
				      
					<div class="search-text">
						
					    <input class="serch" type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"/>
					</div>
					
					
					
					
					<div class="cart box_1">
						
						
						<a href="/checkout">
						<h3>
							<img src="${pageContext.request.contextPath}/resources/user/img/cart.png" alt=""/>
							<div class="total">
							<span class="simpleCart_total"></span></div>
							</h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
					</div>   
					 
					<div class="head-signin">
						<h5><a href="/login"><i class="hd-dign"></i>Sign in</a></h5>
					</div>  
					            
                     <div class="clearfix"> </div>					
				</div>
			</div>
		 <div class="clearfix"> </div>
		</div>
	</div>
</div> --%>