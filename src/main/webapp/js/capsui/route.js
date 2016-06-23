/**
 * Created by tancw on 2016/6/23.
 */
app.config(function ($stateProvider, $urlRouterProvider) {
    $stateProvider.state('login',{
        url:"",
        views:{
            "main":{ templateUrl:"resources2/login.html"}
        }
    });
});