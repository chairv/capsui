/**
 * Created by tancw on 2016/6/23.
 */
var app = angular.module('app', ["ngCookies", "ui.router"]);


//公共service
app.service('capsuiScope', function ($http) {
    var base = {};
    base.addHour = function (date, hours) {
        var s = date.getTime();
        s += hours * 3600 * 100;
        return new Date(s);
    };
    return base;
});

//初始化
app.run(function ($cookies, $rootScope,$state,capsuiScope,$http) {
    //获取token
    var token = $cookies.get('access_token');
    $rootScope.access_token = token;
});

