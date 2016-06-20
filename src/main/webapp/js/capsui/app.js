/**
 * Created by tancw on 2016/6/20.
 */
var app = angular.module('app', []);

app.controller("myCtrl", function ($scope, $http) {
    $http.get("json/leftMenu.json").success(function (response) {
        console.info(response);
        $scope.menus = response;
    });
});
