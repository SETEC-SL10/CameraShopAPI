<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<div class="lady-in-on container" id="popular">
			<div class="buy-an">
						<h3>Related Product</h3>
						<br>
					</div>
					<ul id="flexiselDemo1">			
				<li><a href="/detail"><img class="img-responsive women" src="${pageContext.request.contextPath}/resources/user/img/p1.jpg" alt=""></a>
				<div class="hide-in">
				<p>Premium Denim Women's Hidden</p>
				<span>$179.00  |  <a href="#">Buy Now </a></span>
				</div></li>
				<li><a href="/detail"><img class="img-responsive women" src="${pageContext.request.contextPath}/resources/user/img/p2.jpg" alt=""></a>
				<div class="hide-in">
				<p>Premium Denim Women's Hidden</p>
				<span>$179.00  |  <a href="#">Buy Now </a></span>
				</div></li>
				<li><a href="/detail"><img class="img-responsive women" src="${pageContext.request.contextPath}/resources/user/img/p3.jpg" alt=""></a>
				<div class="hide-in">
				<p>Premium Denim Women's Hidden</p>
				<span>$179.00  |  <a href="#">Buy Now </a></span>
				</div></li>
				<li><a href="/detail"><img class="img-responsive women" src="${pageContext.request.contextPath}/resources/user/img/p4.jpg" alt=""></a>
				<div class="hide-in">
				<p>Premium Denim Women's Hidden</p>
				<span>$179.00  |  <a href="#">Buy Now </a></span>
				</div></a></li>
            </ul>
            		<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems: 4,
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
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/user/js/jquery.flexisel.js"></script>
</div>