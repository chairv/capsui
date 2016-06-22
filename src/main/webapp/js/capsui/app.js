/**
 * Created by tancw on 2016/6/20.
 */
var app = angular.module('app', ["ngCookies", "ui.router"]);

app.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("index");
    $stateProvider.state("index", {
        url: "",
        templateUrl: "resources/html/index.html",
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
        templateUrl: "resources/html/test.html",
        controller: function ($scope, $http, capsuiScope) {
            $scope.contents = capsuiScope.selfTemps;
        }
    }).state("getToken", {
        url: "",
        templateUrl: "resources/html/register.html"
    });
}).run(function ($cookies, $rootScope,$state,capsuiScope,$http) {
    var token = $cookies.get('access_token');
    $rootScope.access_token = token;
    $state.go('index');
    if(token != null){
        capsuiScope.getTokenTemp(token);
    }
    $http.get("../../json/errorcode.json").success(function (response) {
        capsuiScope.esg = response;
    });
});


app.factory('capsuiScope', function ($http) {
    var base = {};
    base.addHour = function (date, hours) {
        var s = date.getTime();
        s += hours * 3600 * 100;
        return new Date(s);
    };
    base.getTokenTemp = function (token) {
        $http.get("/register.do?access_token=" + token).success(function (response) {
            if (response.success == 1) {
                base.selfTemps = response.data;
            }
        })
    };
    return base;
});

app.controller("myIndex", function ($scope, $http) {

});

app.controller("nav", function ($scope, $cookies,$state,$rootScope) {
    $scope.managerTk = function () {
        var token = $cookies.get('access_token');
        if (null != token) {
            layer.confirm(token, {
                btn: ['清除', '确定'] //按钮
            }, function () {
                $cookies.remove('access_token');
                $rootScope.access_token = null;
                layer.msg('清除完成', {icon: 1});
            }, function () {

            });
        }else{
            $state.go("getToken");
        }
    }
});

app.controller('register', function ($scope, $http, $cookies, $rootScope, $state, capsuiScope) {
    $scope.submit = function () {
        $scope.list = {};
        $scope.list.access_token = this.access_token;
        $http.get("/register.do?access_token=" + this.access_token).success(function (response) {
            console.info(response);
            if (response.success == 1) {
                $cookies.put("access_token", $scope.list.access_token, capsuiScope.addHour(new Date(), 2));
                $rootScope.access_token = $scope.list.access_token;
                capsuiScope.selfTemps = response.data;
                $state.go("test");
            } else {
                $scope.result = capsuiScope.esg[response.success] + ' , '+ response.data;
            }
        });
    }
});

app.controller("myTest", function ($cookies, $scope) {

})

app.controller('myHome', function () {

});