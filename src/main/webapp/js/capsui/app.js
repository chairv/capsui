/**
 * Created by tancw on 2016/6/20.
 */
var app = angular.module('app', ["ngCookies"]);

app.controller("myIndex", function ($scope, $http, $cookies,$location,$rootScope) {
    $http.get("../../json/leftMenu.json").success(function (response) {
        $scope.menus = response;
    });

    $http.get("../../json/content.json").success(function (response) {
        $scope.contents = response;
    }).error(function (data, status, headers, config) {
        console.info(data);
    });
    var absUrl = $location.absUrl();
    $rootScope.path = absUrl;
});

app.controller('nav', function ($cookies, $scope) {
    $scope.managerTk = function () {
        $cookies.remove('access_token')
        alert("modify");
    }
});

app.controller('register', function ($scope, $http) {
    $scope.submit = function () {
        $scope.list = {};
        console.info(this);
        $scope.list.openId = this.openId;
        $scope.list.access_token = this.access_token;
        $http.post("/register.do",list).success(function (response) {
            console.info(response);
        });
    }
});

app.controller("myTest", function ($cookies, $scope, $rootScope) {
        var token = $cookies.get("access_token");
        $rootScope.access_token = token;
    }
)
