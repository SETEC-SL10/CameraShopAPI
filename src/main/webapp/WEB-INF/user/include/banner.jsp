<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
    
    
<div >
			
			<ul id="slideBanner">			
				<li><a href="#"><img class=" " src="${pageContext.request.contextPath}/resources/user/img/Slide-01.png" alt=""></a>
				</li>
				<li><a href="#"><img class=" " src="${pageContext.request.contextPath}/resources/user/img/Slide-02.png" alt=""></a>
				</li>
				<li><a href="#"><img class=" " src="${pageContext.request.contextPath}/resources/user/img/Slide-03.png" alt=""></a>
				</li>
				<li><a href="#"><img class="" src="${pageContext.request.contextPath}/resources/user/img/Slide-04.png" alt=""></a>
				</li>
            </ul>
            		<script type="text/javascript">
		$(window).load(function() {
			$("#slideBanner").flexisel({
				visibleItems: 1,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 1
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 1
		    		}
		    	}
		    });
		    
		});
	</script> 
	<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/resources/user/js/jquery.flexisel.js"></script> --%>
</div>
    
<%-- <div class="banner ">
	<div class="container">
		<div class="banner-main">
			<div class="col-md-6 banner-left">
				<a href="single.html"><img src="${pageContext.request.contextPath}/resources/user/img/ba.png" alt="" class="img-responsive"></a>
			</div>
			<div class="col-md-6 banner-right simpleCart_shelfItem">
				<span class="bann-heart"> </span>
				<h2>Handbags</h2>
				<h1>Sed perspiciatis unde</h1>
				<h5 class="item_price">$200.00</h5>
				<ul class="bann-small-img">
					<li><a href="single.html"><img src="${pageContext.request.contextPath}/resources/user/img/b1.jpg"></a></li>
					<li><a href="single.html"><img src="${pageContext.request.contextPath}/resources/user/img/b2.jpg"></a></li>
				</ul>
				<h6>Size Charts</h6>
				<ul class="bann-btns">
				<li><select class="bann-size">
					<option value="select your location">Size</option>
					<option value="saab">Small</option>
					<option value="fiat">Medium</option>
					<option value="audi">Large</option>
				</select>
				</li>
				<li><a href="#" class="item_add">Add To Cart</a></li>
               </ul>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
</div> --%>