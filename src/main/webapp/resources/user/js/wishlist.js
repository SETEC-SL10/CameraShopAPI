/**
*  Module
*
* Description
*/
var wishlistApp = angular.module('wishlistApp', []);
wishlistApp.controller('wishlistController', function($scope,$http){
	
	$scope.numPagination = 0;
	$scope.Pagination = [];
	$scope.bntClickedIndex = 0;
	
	$scope.pageForm = {
						  "columnName": "all",
						  "conditionValue": "4",
						  "limit": 10,
						  "page": 0
						};

	$scope.getWishlist = function(){
		$http({
				url : "http://localhost:9999/api/front_end/wishlist/all",
		        method : "POST",
		        headers:{
		        	"accept": "application/json; charset=utf-8"
		        },
		        data:$scope.pageForm
		    }).then(function mySucces(response) {
		    	if(response.data.Message != "Record found"){
		    		swal("Request Data!", response.data.Message, "error");
		    		$scope.wishlists = response.data.DATA;
		    	}else{
		    		$scope.wishlists = response.data.DATA;
//		    		console.log($scope.wishlists);
//		    		$scope.getPageProduct();
		    	}
		    }, function myError(response) {
		        swal("Error Connection!", "Try to check your network connection", "error");
		});
	};	
	
	$scope.addToCart = function(product){
		$http({
				url : "http://localhost:9999/api/front_end/cart",
		        method : "POST",
		        headers:{
		        	"accept": "application/json; charset=utf-8"
		        },
		        data:{"cart_id": 0, "customer_id": 4, "product": product,"product_qty": 1}
		    }).then(function mySucces(response) {
		    	if(response.data.Message != "Success Insert Cart"){
		    		swal("Request Data!", response.data.Message, "success");
		    	}else{
		    		swal("Request Data!", response.data.Message, "success");
		    	}
		    }, function myError(response) {
		        swal("Error Connection!", "Try to check your network connection", "error");
		});
	};
	
	$scope.getPageWishlist = function(){
		$http({
				url : "http://localhost:9999/api/front_end/wishlist/page",
		        method : "POST",
		        headers:{
		        	"accept": "application/json; charset=utf-8"
		        },
		        data:$scope.pageForm
		    }).then(function mySucces(response) {
	    		$scope.numPagination = 0;
	    		$scope.Pagination = [];
	    		$scope.bntClickedIndex = 0;
		    	$scope.generatePagination(response.data);
//		    	console.log(response.data);
		    }, function myError(response) {
		        swal("Error Connection!", "Try to check your network connection", "error");
		});
	};
	
	$scope.countAllWishlist = function(){
		$http({
				url : "http://localhost:9999/api/front_end/wishlist/count",
		        method : "POST",
		        headers:{
		        	"accept": "application/json; charset=utf-8"
		        },
		        data:$scope.pageForm
		    }).then(function mySucces(response) {
		    	$scope.countWishlist = response.data;
		    }, function myError(response) {
		        swal("Error Connection!", "Try to check your network connection", "error");
		});
	};
	
	$scope.generatePagination = function (numPage){
		for (var i = 1; i <= numPage; i++) {
			$scope.Pagination[i - 1] = i;
		}
	};
	
	$scope.getWishlistByPage = function(page){
		$scope.bntClickedIndex = page;
		$scope.pageForm.page = page;
		$http({
			url : "http://localhost:9999/api/front_end/wishlist/all",
	        method : "POST",
	        headers:{
	        	"accept": "application/json; charset=utf-8"
	        },
	        data:$scope.pageForm
	    }).then(function mySucces(response) {
	    	if(response.data.Message != "Record found"){
	    		swal("Request Data!", response.data.Message, "error");
	    	}else{
	    		$scope.wishlists = response.data.DATA;
	    		console.log($scope.wishlists);
//	    		$scope.getPageProduct();
	    	}
	    }, function myError(response) {
	        swal("Error Connection!", "Try to check your network connection", "error");
	});
	};
	
	$scope.getWishlistByPagePrev = function(){
		if($scope.bntClickedIndex > 0){
			$scope.getWishlistByPage($scope.bntClickedIndex - 1);
		}
	};
	
	$scope.getWishlistByPageNext = function(){
		if($scope.bntClickedIndex < $scope.Pagination.length - 1){
			$scope.getWishlistByPage($scope.bntClickedIndex + 1);
		}
	};
	
	$scope.set_color = function (color) {
		return { color: color.color_code}
	};
	
	$scope.deleteWishlist = function(ind){
		swal({   title: "Are you sure?",   text: "You want to delete this product!",   type: "warning",   showCancelButton: true,   confirmButtonColor: "#DD6B55",   confirmButtonText: "Delete",   cancelButtonText: "Cancel",   closeOnConfirm: false,   closeOnCancel: false }, 
			function(isConfirm){  
			 	if (isConfirm) {  
					$http({
						method:'DELETE',
						url:'http://localhost:9999/api/front_end/wishlist/'+$scope.wishlists[ind].wishlist_id,
						}).then(function successCallback(response){
							if(response.data.Message != "Success Delete Wishlist"){
								swal("Error delete", "Error delete this record!!!!", "error");
							}else{
								swal("Deleted!", "Your record has been deleted.", "success");
								//$scope.wishlists.splice(ind,1);
								$scope.getWishlist();
								$scope.countAllWishlist();
								$scope.getPageWishlist();
							}
						},function errorCallback(response){
							swal("Error delete", "Error delete this record!!!!", "error");
						}
					);
					//$('#myModal').modal('toggle');   
				} else {     
					swal("Cancelled", "Your record is safe :)", "error");   
				} 
			}
		);
	};
	
	$scope.getWishlist();
	$scope.getPageWishlist();
	$scope.countAllWishlist();
});