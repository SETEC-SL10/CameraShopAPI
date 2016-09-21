var app = angular.module('MainApp', []);

// Main Controller for admin
app.controller('MainCtrl', function($scope, $http, $sce, $timeout) {
//	CATEGORY	
	$scope.showCategory = function(){			
		$http({
			url:'http://localhost:1111/api/v1/category',
			method:'GET',
			params : $scope.filter
		}).then(function(response){
		//	console.log(response.data.DATA);
			$scope.category=response.data.DATA;	
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
			//console.log("ALL Cat in admin"+$scope.category);
		}, function(response){		
		});
	}	
	$scope.showCategory();
	
	
	
//	$scope.removeCategory = function(id) {
//		$http({
//			url : 'http://localhost:1111/api/v1/category/' + id,
//			method : 'DELETE'
//		}).then(function() {
//			$scope.showCategory();
//		}, function() {
//			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
//		});
//	}

	$scope.remove = function(id) {
	alert(id);
	$http({
		url : 'http://localhost:1111/api/v1/category/' + id,
		method : 'PUT'
	}).then(function() {
		$scope.showCategory();
		alert("success");
	}, function() {
		alert("Fiald");
	});
}
	
	$scope.alertDelete = function(id) {
		swal({
			title : "Are you sure?",
			text : "You will not be able to recover this imaginary file!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Yes, delete it!",
			closeOnConfirm : false
		},
				function() {
					$scope.removeCategory(id);
					swal("Deleted!", "Your imaginary file has been deleted.",
							"success");
				});
	}

	
	$scope.getDataForUpdate = function(category) {

		$scope.folderName = category.c.CAT_NAME;
		$scope.des = category.c.REMARK;
		$scope.sta = category.c.STATUS;
	}
	
//	$scope.updateCategory = function() {
//		$http({
//			url : 'http://localhost:1111/api/v1/category',
//			method : 'PUT',
//			data : {
//				'CAT_NAME' : $scope.folderName,
//				'REMARK' : $scope.des,
//				'STATUS' : $scope.sta
//			}
//		}).then(function(response) {
//			$scope.showCategory();
//		}, function() {
//			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
//		});
//	}

//	$scope.alertUpdate = function() {
//		$scope.updateCategory();
//		swal("Updated!", "You updated the user!", "success")
//	}

	
	$scope.getCategoryCount = function() {
		$http({
			url : 'http://localhost:1111/api/v1/getCategoryCount',
			method : 'GET'
		}).then(function(response) {
			$scope.CategoryCount = response.data.COUNT;
			console.log($scope.CategoryCount);
		}, function(response) {
			
		});
	}
	$scope.getCategoryCount();
	
	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		$scope.filter.page = num;
		$scope.showCategory();
	});
	
	
	// UPLOAD CATEGORY AND SUB-CATEGORY BLOCK
	$scope.ParentID = "0B4RhbtI4DXY_QWVOWkFiSTlRY1E";
	$scope.sta = 1;
	$scope.uploadFolder = function(event) {
		event.preventDefault();
		var frmData = new FormData();
		frmData.append("folderID", $scope.ParentID);
		frmData.append("folderName", $scope.folderName);
		frmData.append("folderDes", $scope.des);
		frmData.append("folderStatus", $scope.sta);
		$http({
			url : 'http://localhost:1111/api/uploadFolder',
			method : 'POST',
			data : frmData,
			transformRequest : angular.identity,
			headers : {
				'Content-Type' : undefined
			}
		}).then(function(response) {
			alert("Folder create Successful");
			// alert("ID: "+$scope.ParentID);
			console.log("Check Upload Foler here!!");
			console.log(response);
			$scope.message = response.data.message;
			$scope.folderName = category.c.CAT_NAME;
			$scope.des = category.c.REMARK;
			$scope.sta = category.c.STATUS;
		}, function(response) {
			console.log(response);
		});
	};
});



// ======================User Controller===========================
app.controller('UserCtrl', function($scope, $http, $sce, $timeout) {
	$scope.getUserData = function() {
		$http({
			url : 'http://localhost:1111/api/v1/user',
			method : 'GET',
			params : $scope.filter
		}).then(function(response) {
			$scope.user = response.data.DATA;
			console.log($scope.user);
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
			
		}, function(response) {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}
	
	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		$scope.filter.page = num;
		$scope.getUserData();
	});
	

	$scope.getUserData();

	$scope.insertUser = function() {
		$http({
			url : 'http://localhost:1111/api/v1/user',
			method : "POST",
			data : {
				// 'USER_ID' : $scope.gid,
				'USER_NAME' : $scope.gname,
				'PASSWORD' : $scope.gpass,
				'EMAIL' : $scope.gemail,
				'PHONE' : $scope.gphone,
				'CREATED_DATE' : $scope.gdate,
				'REMARK' : $scope.gremark,
				'STATUS' : $scope.gstatus,
				'USER_ROLE' : $scope.grole
			}
		}).then(function(respone) {
			$scope.getUserData();
		}, function(respone) {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}

	$scope.getDataForUpdate = function(user) {
		// alert(user.u.EMAIL);
		$scope.gid = user.u.USER_ID;
		$scope.gname = user.u.USER_NAME;
		$scope.gpass = user.u.PASSWORD;
		$scope.gemail = user.u.EMAIL;
		$scope.gphone = user.u.PHONE;
		$scope.gdate = user.u.CREATED_DATE;
		$scope.gremark = user.u.REMARK;
		$scope.gstatus = user.u.STATUS;
		$scope.grole = user.u.USER_ROLE;

	}

	$scope.updateUser = function() {
		$http({
			url : 'http://localhost:1111/api/v1/user',
			method : 'PUT',
			data : {
				'USER_NAME' : $scope.gname,
				'PASSWORD' : $scope.gpass,
				'EMAIL' : $scope.gemail,
				'PHONE' : $scope.gphone,
				'CREATED_DATE' : $scope.gdate,
				'REMARK' : $scope.gremark,
				'STATUS' : $scope.gstatus,
				'USER_ROLE' : $scope.grole,
				'USER_ID' : $scope.gid
			}
		}).then(function() {
			$scope.getUserData();
		}, function() {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}

	$scope.alertUpdate = function() {
		$scope.updateUser();
		swal("Updated!", "You updated the user!", "success")
	}
	
	$scope.removeUser = function(id) {
		$http({
			url : 'http://localhost:1111/api/v1/user/' + id ,
			method : 'PUT'
		}).then(function() {
			$scope.getUserData();
		}, function() {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}

	$scope.alertDelete = function(id) {
		swal({
			title : "Are you sure?",
			text : "You will not be able to recover this imaginary file!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Yes, delete it!",
			closeOnConfirm : false
		},
				function() {
					$scope.removeUser(id);
					swal("Deleted!", "Your imaginary file has been deleted.",
							"success");
				});
	}
	
	$scope.getUserCount = function() {
		$http({
			url : 'http://localhost:1111/api/v1/getUserCount',
			method : 'GET'
		}).then(function(response) {
			$scope.UserCount = response.data.COUNT;
			console.log($scope.UserCount);
		}, function(response) {

		});
	}
	$scope.getUserCount();
	

});
//============================End of User Controller===============

//============================Start Document Controller===============
app.controller('DocumentCtrl', function($scope,$rootScope, $http, $sce, $timeout,$window) {
	$rootScope.userID = $window.userID;
//	alert($scope.userID);
	$scope.theFile = null;
	$scope.catID="0B4RhbtI4DXY_QWVOWkFiSTlRY1E";
	$scope.des="";
	$scope.uploadFile = function(event) {			
		//alert("Upload Block");
		event.preventDefault();	
		var files = event.target.files;
		var frmData = new FormData();					
		var file = $('#filer_input')[0].files[0];
		frmData.append("files", file);				
		frmData.append("title", $scope.theFile.name);
		frmData.append("des", $scope.des);
		frmData.append("usreID", $rootScope.userID);		
		frmData.append("catID", $scope.catID);	
		$http({
			url : 'http://localhost:1111/api/uploadFile',
			method :'POST',
			data : frmData,
			transformRequest : angular.identity,
			headers : {
				'Content-Type' : undefined
			}
		}).then(function(response) {
			//alert($rootScope.currentSubCategory);
			//getAllDocumentByCatID(parentCat.CAT_ID)
			
			swal({  
				title: "File Upload Successful!",   
				text: "",   
				timer: 800,   
				showConfirmButton: false 
			});
			
		}, function(response) {
			swal({  
				title: "File Upload Fail!",   
				text: "",   
				timer: 800,   
				showConfirmButton: false 
			});
			
		});
		
		
	};
	
	
	
		
	$scope.getDocumentCount = function() {
		$http({
			url : 'http://localhost:1111/api/v1/getDocumentCount',
			method : 'GET'
			
		}).then(function(response) {
			$scope.documentCount = response.data.COUNT;
			console.log($scope.documentCount);
		}, function(response) {

		});
	}
	$scope.getDocumentData = function() {
		$http({
			url : 'http://localhost:1111/api/v1/document',
			method : 'GET',
			params : $scope.filter
		}).then(function(response) {
			$scope.document = response.data.DATA;
			console.log($scope.document);
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
		}, function(response) {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}
	$scope.getDocumentData();
	
	$scope.getDocumentCount();

	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		$scope.filter.page = num;
		$scope.getDocumentData();
	});
	
	$rootScope.getAllCategory = function(){
		$http({
			url:'http://localhost:1111/api/v1/category',
			method:'GET'			
		}).then(function(response){
		//	console.log(response.data.DATA);
			$scope.getAllCategory=response.data.DATA;
			console.log("GET ALL CAT ADMIN");
			console.log($scope.getAllCategory);
			
		}, function(response){
		
		});
	}


});

//============================End of Document Controller===============


//============================Start Commnet Controller===============
app.controller('CommentCtrl', function($scope, $http, $window) {
	$scope.getCommentData = function() {
		$http({
			url : 'http://localhost:1111/api/v1/comment',
			method : 'GET',
			params : $scope.filter
			
		}).then(function(response) {
			console.log(response);
			$scope.comment = response.data.DATA;
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
			
		}, function(response) {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}

	$scope.getCommentData();
	
	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		$scope.filter.page = num;
		$scope.getCommentData();
	});
	
	$scope.removeComment = function(id) {
		$http({
			url : 'http://localhost:1111/api/v1/comment/' + id,
			method : 'PUT'
		}).then(function() {
			$scope.getCommentData();
		}, function() {
			alert("Fiald");
		});
	}

	$scope.alertDelete = function(id) {
		swal({
			title : "Are you sure?",
			text : "You will not be able to recover this imaginary file!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Yes, delete it!",
			closeOnConfirm : false
		},
				function() {
					$scope.removeComment(id);
					swal("Deleted!", "Your imaginary file has been deleted.",
							"success");
				});
	}
	
	$scope.faildAlert = function(title,message){
		swal(title, message);
	}
	
});

// =======================Feedback Controller======================
app.controller('FeedbackCtrl', function($scope, $http, $window) {
	$scope.getFeedbackData = function() {
		$http({
			url : 'http://localhost:1111/api/v1/feedback',
			method : 'GET',
			params : $scope.filter
		}).then(function(response) {
			$scope.feedback = response.data.DATA;
			console.log($scope.feedback);
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
		}, function(response) {
			
		});
	}
	$scope.getFeedbackData();
	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		$scope.filter.page = num;
		$scope.getFeedbackData();
	});
	
	
	$scope.removeFeedback = function(id) {
		$http({
			url : 'http://localhost:1111/api/v1/feedback/' + id,
			method : 'DELETE'
		}).then(function() {
			$scope.getFeedbackData();
		}, function() {
			swal("Loading Data Fiald!", "Please check your connection again!");
			alert("Fiald");
		});
	}
	
	$scope.alertDelete = function(id) {
		swal({
			title : "Are you sure?",
			text : "You will not be able to recover this imaginary file!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Yes, delete it!",
			closeOnConfirm : false
		},
				function() {
					$scope.removeComment(id);
					swal("Deleted!", "Your imaginary file has been deleted.",
							"success");
				});
	}
	
});
//=================================================================

// =======================Report Controller========================
app.controller('ReportCtrl', function($scope, $http, $window) {
	$scope.getReportData = function() {
		$http({
			url : 'http://localhost:1111/api/v1/report',
			method : 'GET',
			params : $scope.filter
		}).then(function(response) {
			$scope.report = response.data.DATA;
			console.log($scope.report);
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
		}, function(response) {

		});
	}
	$scope.getReportData();
	
	$scope.removeReport = function(id) {
		$http({
			url : 'http://localhost:1111/api/v1/report/' + id,
			method : 'PUT'
		}).then(function() {
			$scope.getReportData();
		}, function() {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}
	
	$scope.alertDelete = function(id) {
		swal({
			title : "Are you sure?",
			text : "You will not be able to recover this imaginary file!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Yes, delete it!",
			closeOnConfirm : false
		},
				function() {
					$scope.removeReport(id);
					swal("Deleted!", "Your imaginary file has been deleted.",
							"success");
				});
	}

	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		$scope.filter.page = num;
		$scope.getReportData();
	});
	
	
	
});

//=================== Savelist Controller======================
app.controller('SavelistCtrl', function($scope, $http, $window) {
	$scope.getSavelistData = function() {
		$http({
			url : 'http://localhost:1111/api/v1/savelist',
			method : 'GET',
			params : $scope.filter
		}).then(function(response) {
			$scope.savelist = response.data.DATA;
			console.log($scope.savelist);
			$scope.setPagination(response.data.PAGING.TOTAL_PAGES);
		}, function(response) {

		});
	}
	$scope.getSavelistData();
	//TODO: default filter
	$scope.filter = {
		page: 1,
		limit: 10
	};
	
	var PAGINATION = angular.element("#PAGINATION");
	$scope.setPagination = function(totalPage){
		PAGINATION.bootpag({
			total: totalPage,          // total pages
			page: $scope.filter.page,   // default page
			leaps: true,
	        firstLastUse: true,
	        first: '←',
	        last: '→',
	        next: 'Next',
	        prev: 'Prev',
	        maxVisible: 10
		});		
	}
	
	PAGINATION.on("page", function(event, num){
		
		$scope.filter.page = num;
		$scope.getSavelistData();
	});
	
	$scope.removeSavelist = function(id) {
		$http({
			url : 'http://localhost:1111/api/v1/savelist/' + id,
			method : 'PUT'
		}).then(function() {
			$scope.getReportData();
		}, function() {
			$scope.faildAlert("Faild Loading...","Please check or connect to network!");
		});
	}
	
	$scope.alertDelete = function(id) {
		swal({
			title : "Are you sure?",
			text : "You will not be able to recover this imaginary file!",
			type : "warning",
			showCancelButton : true,
			confirmButtonColor : "#DD6B55",
			confirmButtonText : "Yes, delete it!",
			closeOnConfirm : false
		},
				function() {
					$scope.removeSavelist(id);
					swal("Deleted!", "Your imaginary file has been deleted.",
							"success");
				});
	}
	
	
});
