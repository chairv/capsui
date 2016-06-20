<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <style>
        div{
            border:1px solid red;
        }
    </style>
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-2">
            <div class="panel-group" id="accordion2">
                <div class="panel-heading">
                  <%--所有--%>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" data-toggle="collapse"
                         data-parent="#accordion2" href="#collapseOne">
                        <a class="accordion-toggle">Java</a>
                    </div>
                    <div id="collapseOne" class="panel-collapse collapse"
                         style="height: 0px;">
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="#">Java基础</a></li>
                                <li><a href="#">Java面向对象</a></li>
                                <li><a href="#">Java核心API</a></li>
                                <li><a href="#">JavaEE</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" data-toggle="collapse"
                         data-parent="#accordion2" href="#collapseTwo">
                        <a class="accordion-toggle">数据库</a>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse"
                         style="height: 0px;">
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="#">SQL基础</a></li>
                                <li><a href="#">Oracle</a></li>
                                <li><a href="#">MySQL</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading" data-toggle="collapse"
                         data-parent="#accordion2" href="#collapseThree">
                        <a class="accordion-toggle">技术前沿</a>
                    </div>
                    <div id="collapseThree" class="panel-collapse in"
                         style="height: 0px;">
                        <div class="panel-body">
                            <ul class="nav nav-pills nav-stacked">
                                <li><a href="#">NoSQL</a></li>
                                <li><a href="#">Hadoop</a></li>
                                <li><a href="#">WebService</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
        </div><!--/span-->

        <div class="col-md-10">

            <div class="col-lg-4 col-md-3 col-sm-4">
                <a href="http://www.jq22.com/jquery-info6567" target="_blank"><img src="./jQueryUI插件_files/2016-03-30-22-03-02.png"></a>
                <div class="cover-info">
                    <a href="http://www.jq22.com/jquery-info6567" target="_blank"><h4>仿淘宝业务icon动画图标</h4></a>
                    <small>仿淘宝icon鼠标悬停动画图标，纯手打使用jquery框架</small>
                </div>
                <div class="cover-fields">
                    <i class="fa fa-list-ul"></i> &nbsp;
                    悬停
                </div>
                <div class="cover-stat">
                    <i class="fa fa-eye"></i><span class="f10"> &nbsp;3376</span>
                    <i class="fa fa-heart"></i><span class="f10"> &nbsp;36</span>
                    <div class="cover-yh">
                        <a href="http://www.jq22.com/mem215241" data-container="body" data-toggle="popover" data-placement="top" data-content="度_Li " data-original-title="" title="">
                            <i class="fa fa-user-secret"></i>
                        </a>
                    </div>
                </div>
            </div>
            </div>

        </div>
    </div>

 </div><!--/.fluid-container-->
</body>


</html>
