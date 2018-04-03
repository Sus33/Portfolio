<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DEVELOPER
  Date: 04.03.2018
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Lion - Bootstrap Admin Theme</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <link href="assets/css/main.css" rel="stylesheet">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
    <style type="text/css">
        body {
            padding-top: 60px;
        }
    </style>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    <!-- Google Fonts call. Font Used Open Sans -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans" rel='stylesheet' type='text/css'>

</head>
<body>
<span>${user.name}</span>
<spring:form action="/addCollega" method="post" modelAttribute="manager" enctype="multipart/form-data">
    Name <spring:input path="name"></spring:input><br>
    Surname <spring:input path="surname"></spring:input><br>
    Age <spring:input path="age"></spring:input><br>
    Gender: <spring:select path="genderType">
    <option>MALE</option>
    <option>FEMALE</option>
</spring:select><br>
    Email <spring:input path="email"></spring:input><br>
    Password <spring:input path="password"></spring:input><br>
    Type: <spring:select path="userType">
    <option>MANAGER</option>
    <option>CREDIT_MANAGER</option>
    <option>FINANCIAL_EXPERT</option>
    <option>OPERATOR_CASHIER</option>
    <option>MANAGER_MODERATOR</option>
    <option>SECURITY</option>
    <option>JEWELER</option>
</spring:select><br>
    Image <input type="file" id="image" name="image"/><br>
    <input type="submit" value="ADD">
</spring:form>
<spring:form action="/addRoom" method="post" modelAttribute="room" enctype="multipart/form-data">
    Name <spring:input path="name"></spring:input><br>
    Image <input type="file" id="image" name="image"/><br>
    <input type="submit" value="ADD">
</spring:form>

<!-- NAVIGATION MENU -->

<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="index.html"><img src="assets/img/logo-small.png" alt=""> Lion Admin Theme</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li class="active"><a href="index.html"><i class="icon-home icon-white"></i> Home</a></li>
                    <li><a href="charts.html"><i class="icon-signal icon-white"></i> Charts</a></li>
                    <li><a href="manager.html"><i class="icon-folder-open icon-white"></i> File Manager</a></li>
                    <li><a href="calendar.html"><i class="icon-calendar icon-white"></i> Calendar</a></li>
                    <li><a href="ui-elements.html"><i class="icon-bookmark icon-white"></i> UI Elements</a></li>
                    <li><a href="tables.html"><i class="icon-th icon-white"></i> Tables</a></li>

                    <li class="dropdown">
                        <a href="index.html#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-file icon-white"></i> Sample Pages <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="buttons.html"><i class="icon-gift icon-white"></i> Buttons & Icons</a></li>
                            <li><a href="invoice.html"><i class="icon-pencil icon-white"></i> Invoice</a></li>
                            <li><a href="forms.html"><i class="icon-align-justify icon-white"></i> Forms</a></li>
                            <li><a href="gallery.html"><i class="icon-picture icon-white"></i> Gallery</a></li>
                            <li><a href="grid.html"><i class="icon-align-left icon-white"></i> Grid</a></li>
                            <li class="divider"></li>
                            <li><a href="map.html"><i class="icon-globe icon-white"></i> Map</a></li>
                            <li><a href="404.html"><i class="icon-warning-sign icon-white"></i> 404 Error</a></li>
                            <li><a href="login.html"><i class="icon-wrench icon-white"></i> Login</a></li>
                        </ul>
                    </li>
                    <li><a href="user.html"><i class="icon-user icon-white"></i> User</a></li>

                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>

<div class="container">

    <!-- Example row of columns -->
    <div class="row">
        <div class="span3">
            <div class="dash-unit">
                <img src="assets/img/brian.jpg" alt="Brian Smith">
                <h1>BRIAN SMITH</h1>
                <h4>London, UK.</h4>
                <h6>Joined April 19, 2009</h6>
                <p><i class="icon-envelope icon-white"></i> <a href="index.html#" class="tooltip-test" data-placement="top" title="New Mails"><span class="badge badge-one">6</span></a>
                    - <i class="icon-comment icon-white"></i> <a href="index.html#" class="tooltip-test" data-placement="top" title="New Messages"><span class="badge badge-one">2</span></a></p>
            </div>
        </div>
        <div class="span3">
            <hr>
            <h4>REVENUE INFO</h4>
            <div id="money"></div>
            <h5>- DETAILS:</h5>
            <p><i class="icos-heart" style="vertical-align:baseline"></i> Total Earnings: <b style="color:#ff6e01">$44.550</b></p>
        </div>
        <div class="span3">
            <hr>
            <h4>MONTHLY VISITS</h4>
            <div id="site"></div>
            <h5>- DETAILS:</h5>
            <p><i class="icos-fire" style="vertical-align:baseline"></i> Total Visits: <b style="color:#ff6e01">447.763</b></p>
        </div>
        <div class="span3">
            <hr>
            <h4>TOTAL USERS</h4>
            <div id="users"></div>
            <h5>- DETAILS:</h5>
            <p><i class="icos-user1" style="vertical-align:baseline"></i> Total Users: <b style="color:#ff6e01">17.110</b></p>
        </div>

    </div><!-- /row -->
</div> <!-- /container -->
<br>
<div id="middlewrap">
    <br>

    <footer class="clearfix"></footer>
    <div class="container">
        <div class="row">
            <div class="span2">
                <div class="dash2-unit">
                    <h1>Important Site Stat</h1>
                    <br>
                    <p style="text-align:center"><img src="assets/img/stat01.png" alt="" ></p>
                    <h2>Detailed Information</h2>
                    <h6>46%</h6>
                    <br>
                    <p>More...</p>
                </div><!-- /dash2-unit -->
            </div><!-- /span2 -->
            <div class="span2">
                <div class="dash2-unit">
                    <h1>Important Site Stat</h1>
                    <br>
                    <p style="text-align:center"><img src="assets/img/stat02.png" alt="" ></p>
                    <h2>Detailed Information</h2>
                    <h6>Stable</h6>
                    <br>
                    <p>More...</p>
                </div><!-- /dash2-unit -->
            </div><!-- /span2 -->
            <div class="span2">
                <div class="dash2-unit">
                    <h1>Important Site Stat</h1>
                    <br>
                    <p style="text-align:center"><img src="assets/img/stat03.png" alt="" ></p>
                    <h2>Detailed Information</h2>
                    <h6>75%</h6>
                    <br>
                    <p>More...</p>
                </div><!-- /dash2-unit -->
            </div><!-- /span2 -->
            <div class="span2">
                <div class="dash2-unit">
                    <h1>Important Site Stat</h1>
                    <br>
                    <p style="text-align:center"><img src="assets/img/stat04.png" alt="" ></p>
                    <h2>Detailed Information</h2>
                    <h6>82 ms.</h6>
                    <br>
                    <p>More...</p>
                </div><!-- /dash2-unit -->
            </div><!-- /span2 -->
            <div class="span2">
                <div class="dash2-unit">
                    <h1>Important Site Stat</h1>
                    <br>
                    <p style="text-align:center"><img src="assets/img/stat05.png" alt="" ></p>
                    <h2>Detailed Information</h2>
                    <h6>Good</h6>
                    <br>
                    <p>More...</p>
                </div><!-- /dash2-unit -->
            </div><!-- /span2 -->
            <div class="span2">
                <div class="dash2-unit">
                    <h1>Important Site Stat</h1>
                    <br>
                    <p style="text-align:center"><img src="assets/img/stat06.png" alt="" ></p>
                    <h2>Detailed Information</h2>
                    <h6>Low</h6>
                    <br>
                    <p>More...</p>
                </div><!-- /dash2-unit -->
            </div><!-- /span2 -->

        </div><!-- /row -->
    </div><!-- /container -->
</div><!-- /middlewrap -->
<div id="footerwrap">
    <footer class="clearfix"></footer>
    <div class="container">
        <div class="row">
            <div class="span12">
                <p><img src="assets/img/logo.png" alt=""></p>
                <p>Lion Admin Theme - Crafted With Love - Copyright 2012</p>
            </div>

        </div><!-- /row -->
    </div><!-- /container -->
</div><!-- /footerwrap -->


<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script type="text/javascript" src="assets/js/bootstrap-transition.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-alert.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-modal.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-dropdown.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-tooltip.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-button.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-collapse.js"></script>
<script type="text/javascript" src="assets/js/bootstrap-typeahead.js"></script>
<script type="text/javascript" src="assets/js/highcharts.js"></script>
<script type="text/javascript" src="assets/js/dash-charts.js"></script>
<script type="text/javascript" src="assets/js/noty/jquery.noty.js"></script>
<script type="text/javascript" src="assets/js/noty/layouts/topRight.js"></script>
<!-- You can add more layouts if you want -->
<script type="text/javascript" src="assets/js/noty/themes/default.js"></script>
<script type="text/javascript" src="assets/js/dash-noty.js"></script>

<script type="text/javascript" src="assets/js/admin.js"></script>
</body>
</html>

