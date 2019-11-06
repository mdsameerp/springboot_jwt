var app = angular.module('myApp', []);


 
 
app.controller('loginCtrl', ['$scope', '$http', function ($scope, $http) {

    // List of user
    
   
    
   
    $scope.user = {};
    $scope.login= function(){
        console.log($scope.user);
        $http.post('authenticate',{
           user: $scope.user
        }).then(function success(e) {
               console.log(e.data.jwt);
                document.cookie= "ipigeon-temp="+e.data.jwt;
                sessionStorage.setItem("jwt",e.data.jwt);
                window.location.href="/hello";
                
            }, function error(e) {
            	 console.log(e);
            });
        
        
    }
    

 
    
    }]);
 

