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

<!-- Multi Step -->
<style type="text/css">

.stepwizard-step p {
    margin-top: 10px;
}
.stepwizard-row {
    display: table-row;
}
.stepwizard {
    display: table;
    width: 100%;
    position: relative;
    margin-bottom:20px;
}
.stepwizard-step button[disabled] {
    opacity: 1 !important;
    filter: alpha(opacity=100) !important;
}
.stepwizard-row:before {
    top: 14px;
    bottom: 0;
    position: absolute;
    content: " ";
    width: 100%;
    height: 1px;
    background-color: #ccc;
    z-order: 0;
}
.stepwizard-step {
    display: table-cell;
    text-align: center;
    position: relative;
}
.btn-circle {
    width: 30px;
    height: 30px;
    text-align: center;
    padding: 6px 0;
    font-size: 12px;
    line-height: 1.428571429;
    border-radius: 15px;
}
#step-4 img
{
	max-width:50px;
	max-height:50px;
}
</style>
</head>
<body ng-app="UserApp" ng-controller="UserCtrl" ng-cloak>

<%@include file="include/header.jsp"%>



<div class="checkoutForm container">
  
<div class="stepwizard">
    <div class="stepwizard-row setup-panel">
      <div class="stepwizard-step">
        <a href="#step-1" type="button" class="btn btn-primary btn-circle">1</a>
        <p>Login or Register</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled">2</a>
        <p>Billing Address</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled">3</a>
        <p>Shipping Address</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-4" type="button" class="btn btn-default btn-circle" disabled="disabled">4</a>
        <p>Payment Method</p>
      </div>
      <div class="stepwizard-step">
        <a href="#step-5" type="button" class="btn btn-default btn-circle" disabled="disabled">5</a>
        <p>Order Review</p>
      </div>
    </div>
  </div>
  
   <form >
    <div class="row setup-content" id="step-1">
       <div class="form-group col-md-7">
            <!-- <label class="control-label">First Name</label> -->
            <input  maxlength="100" type="text"  class="form-control" placeholder="Username or Email"  />
            <br>
            <input  maxlength="100" type="password" class="form-control" placeholder="Password"  />
            <br>
            <button class="btn btn-primary nextBtn btn-lg  " type="button" >Next</button>
       </div>
    </div>
    
    
    <div class="row setup-content" id="step-2">
     	<div class="form-group col-md-7">
             <label class="control-label">First Name</label>
            <input  maxlength="100" type="text" class="form-control" placeholder="Username or Email"  />
            <br>
            
             <label class="control-label">Last Name</label>
            <input  maxlength="100" type="text" class="form-control" placeholder="Username or Email"  />
            <br>
            
             <label class="control-label">Phone</label>
            <input  maxlength="100" type="text" class="form-control" placeholder="Username or Email"  />
            <br>
            
            <label class="control-label">Email</label>
            <input  maxlength="100" type="email" class="form-control" placeholder="Username or Email"  />
            <br>
            
             <label class="control-label">Address</label>
             <textarea name="" id="" cols="30" rows="10" class="form-control" placeholder="Username or Email"></textarea>
            <br>
            
            <label class="control-label">Town/City</label>
            <select class="" ng-model="type">			       
                 <option ng-repeat="x in search" value="{{x.data}}" >{{x.data}}</option>
            </select> 
            <br>
            <button class="btn btn-primary nextBtn btn-lg  " type="button" >Next</button>
       </div>
    </div>
    
    
    <div class="row setup-content" id="step-3">
      	<div class="form-group col-md-7">
             <label class="control-label">First Name</label>
            <input  maxlength="100" type="text"  class="form-control" placeholder="Username or Email"  />
            <br>
            
             <label class="control-label">Last Name</label>
            <input  maxlength="100" type="text" class="form-control" placeholder="Username or Email"  />
            <br>
            
             <label class="control-label">Phone</label>
            <input  maxlength="100" type="text"  class="form-control" placeholder="Username or Email"  />
            <br>
            
            <label class="control-label">Email</label>
            <input  maxlength="100" type="email"  class="form-control" placeholder="Username or Email"  />
            <br>
            
             <label class="control-label">Address</label>
             <textarea name="" id="" cols="30" rows="10"  class="form-control" placeholder="Username or Email"></textarea>
            <br>
            
            <label class="control-label">Town/City</label>
            <select class="" ng-model="type">			       
                 <option ng-repeat="x in search" value="{{x.data}}" >{{x.data}}</option>
            </select> 
            <br>
            <button class="btn btn-primary nextBtn btn-lg  " type="button" >Next</button>
       </div>
    </div>
    
    <div class="row setup-content" id="step-4">
      <div class="form-group col-md-7">
          <div class="aa-payment-method">                    
            <label> <input type="radio" name="optionsRadios"> Cash on Delivery </label> <br>
            <label><input type="radio" name="optionsRadios" checked> Via Smart Luy </label>
            <img src="${pageContext.request.contextPath}/resources/user/img/smartluy.png" class="img-responsive" alt="Smart Luy"/>                               
          </div>
            <br>
            <button class="btn btn-primary nextBtn btn-lg" type="button" >Next</button>
       </div>
    </div>
    
    <div class="row setup-content" id="step-5">
    	<div class="form-group">
    		
    		<div class="ckeckout">
			<div class="checkoutDiv">
				<div class="ckeckout-top">
				<div class=" cart-items heading">
				 <h1>Your Order</h1>
					
					
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
				
					<ul class=" cart-header1 simpleCart_shelfItem">
						<!-- <div class="close2"> </div> -->
							<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c2.jpg" class="img-responsive" alt=""></a>
							</li>
							<li><span>Watches</span></li>
							<li><span class="item_price">$ 300.00</span></li>
							<li><span>1</span></li>
							<li><span>$400</span></li>
							<!-- <li> <a href="#" class="add-cart cart-check item_add">Add to cart</a></li> -->						
							<div class="clearfix"> </div>
					</ul>
					<ul class="cart-header2 simpleCart_shelfItem">
						<!-- <div class="close3"> </div> -->
							<li class="ring-in"><a href="/detail" ><img src="${pageContext.request.contextPath}/resources/user/img/c3.jpg" class="img-responsive" alt=""></a>
							</li>
							<li><span>Handbag</span></li>
							<li><span class="item_price">$ 360.00</span></li>
							<li><span>1</span></li>
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
    		
    		<br>
            <button class="btn btn-success btn-lg" type="button">Place Order</button>
       </div>
    </div>
    
    
  </form> 
  
</div>
<script type="text/javascript">
$(document).ready(function () {
  var navListItems = $('div.setup-panel div a'),
          allWells = $('.setup-content'),
          allNextBtn = $('.nextBtn');

  allWells.hide();

  navListItems.click(function (e) {
      e.preventDefault();
      var $target = $($(this).attr('href')),
              $item = $(this);

      if (!$item.hasClass('disabled')) {
          navListItems.removeClass('btn-primary').addClass('btn-default');
          $item.addClass('btn-primary');
          allWells.hide();
          $target.show();
          $target.find('input:eq(0)').focus();
      }
  });

  allNextBtn.click(function(){
      var curStep = $(this).closest(".setup-content"),
          curStepBtn = curStep.attr("id"),
          nextStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().next().children("a"),
          curInputs = curStep.find("input[type='text'],input[type='url']"),
          isValid = true;

      $(".form-group").removeClass("has-error");
      for(var i=0; i<curInputs.length; i++){
          if (!curInputs[i].validity.valid){
              isValid = false;
              $(curInputs[i]).closest(".form-group").addClass("has-error");
          }
      }

      if (isValid)
          nextStepWizard.removeAttr('disabled').trigger('click');
  });

  $('div.setup-panel div a.btn-primary').trigger('click');
});
</script>



<%@include file="include/footer.jsp"%>

</body>
</html>