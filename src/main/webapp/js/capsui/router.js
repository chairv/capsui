/**
 * Created by qiao on 2016/6/22.
 */
var app = angular.module('app', ["ngRoute"]);

app.controller("myHome",function ($scope, $route) {
    $scope.$on('$viewContentLoaded',function () {
        console.info("ng-viw content loaded!");
    });

    $scope.$on('$routeChangeStart',function (event, next, current) {
        console.info("route change start");
    });
});

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider.when("/index",{
        templateUrl:"resources/html/index.html",
    }).when('/test',{
        templateUrl :"resources/html/test/html"
    }).otherwise({
        redirectTo:'/index'
    });
});