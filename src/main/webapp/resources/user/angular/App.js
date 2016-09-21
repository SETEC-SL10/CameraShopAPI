
var app = angular.module('UserApp', []);

app.controller('UserCtrl',['$scope', function($scope){	
	$scope.search=[
	               		
           		 	{data:"All Product"},
           		 	{data:"Category"},
           		 	{data:"Brand"},
           		 	{data:"Model"},
        		 	
	              ];
	$scope.type=$scope.search[0].data;
	$scope.user="Login";
	$scope.newUser="";
	$scope.login = function(){	
		
		$scope.user=$scope.newUser;
	}
	
	
	console.log($scope.search[0].data);

	/*$scope.getDocumentByLikeTitle = function(title){			
		$http({
			url:'http://localhost:1111/api/v1/getDocumentByLikeTitle/'+title,
			method:'GET'			
		}).then(function(response){
		
			
			  var preloader = document.querySelector(".preloader");
			  preloader.style.opacity = 0;
			  preloader.style.display ="none";
			
			
			$scope.documentSearch=response.data.DATA;
		
		}, function(response){
		
		});
	}*/
 
	
}]);

function increaseValue()
{
    var value = parseInt(document.getElementById('numberQty').value, 10);
    value = isNaN(value) ? 0 : value;
    value = value + 1;
    document.getElementById('numberQty').value = value;
}
function reduceValue()
{
    var value = parseInt(document.getElementById('numberQty').value, 10);
    value = isNaN(value) ? 0 : value;
    value = value - 1;
    document.getElementById('numberQty').value = value;
}












    



