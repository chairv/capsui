/**
 * Created by tancw on 2016/6/20.
 */
var app = angular.module('app', ["ngCookies", "ui.router"]);


app.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("index");

    $stateProvider.state("index", {
        url: "",
        templateUrl: "index.html",
        controller: function ($scope, $http) {
            $http.get("../../json/leftMenu.json").success(function (response) {
                $scope.menus = response;
            });

            $http.get("../../json/content.json").success(function (response) {
                $scope.contents = response;
            });
        }
    }).state("test", {
        url: "",
        templateUrl: "test.html",
        // controller: function ($scope, $http, $cookies) {
        //     $scope.access_token = $cookies.get('access_token');
        // }
    });
});


app.controller("myIndex", function ($scope, $http) {

});

app.controller("nav", function ($scope, $http) {

});

app.controller('register', function ($scope, $http) {
    $scope.submit = function () {
        $scope.list = {};
        console.info(this);
        $scope.list.openId = this.openId;
        $scope.list.access_token = this.access_token;
        $http.post("/register.do", list).success(function (response) {
            console.info(response);
        });
    }
});

app.controller("myTest", function ($cookies, $scope, $rootScope) {
        var token = $cookies.get("access_token");
        $rootScope.access_token = token;
    }
)

app.controller('myHome', function () {

});