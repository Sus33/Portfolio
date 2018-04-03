<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zxx">
<head>
    <title>Online SVM Banking</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Online Banking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--// Meta tag Keywords -->
    <!-- css files -->
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" /> <!-- Bootstrap-Core-CSS -->
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" /> <!-- Style-CSS -->
    <link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="all" /> <!-- Banner-Slider-CSS -->
    <!-- //css files -->
    <link rel="stylesheet" type="text/css" href="css/demo.css"/>
    <!-- online-fonts -->
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Ubuntu+Condensed&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext" rel="stylesheet">
    <!-- //online-fonts -->
</head>
<body>
<form action="<c:url value="/loginPage"/> " method="post" name="loginForm">
    <input type="text" placeholder="email" name="j_email"/>
    <input type="password" placeholder="password" name="j_password"/>
    <button type="submit" class="btn btn-default">Login</button>

</form>
<div class="nav-links">
    <div class="header-w3l">
        <div class="container">
            <a class="navbar-brand" href="index.html"><h1>Online<img src="images/SVM-logo.png" width="200px" height="100px">Banking</h1></a>
            <div class="call-w3l">
                <img src="images/call.png">
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <nav class="navbar navbar-inverse">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <div class="w3l-nav">
                <ul class="nav navbar-nav link-effect">
                    <li class="active"><a href="index.html">Home</a></li>
                    <li><a href="#about" class="scroll">About Us</a></li>
                    <li><a href="#services" class="scroll">Services</a></li>
                    <li><a href="#team" class="scroll">Team</a></li>
                    <li><a href="#gallery" class="scroll">Gallery</a></li>
                    <li><a href="#contact" class="scroll">Contact Us</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="codecon_half">
        <div class="expSearchBox">
            <div class="expSearchFrom">
                <input id="field" type="search" placeholder="Search here"/>
                <div class="close">
                    <span class="front"></span>
                    <span class="back"></span>
                </div>
            </div>
        </div>
    </div>
    <div class="clearfix"></div>
</div>
<!-- //navigation -->
<!-- banner section -->
<div class="banner-slider">
    <div class="container">
        <!--Slider-->
        <div class="callbacks_container">
            <ul class="rslides" id="slider3">
                <li>
                    <div class="w3l_banner_info">
                        <h3>Merchant accounts and credit card processing</h3>
                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                        <div class="agileits_w3layouts_more menu__item">
                            <a href="#" class="menu__link" data-toggle="modal" data-target="#myModal">Learn More</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="w3l_banner_info">
                        <h3>Don't hesitate to accept credit cards today!</h3>
                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                        <div class="agileits_w3layouts_more menu__item">
                            <a href="#" class="menu__link" data-toggle="modal" data-target="#myModal">Learn More</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="w3l_banner_info">
                        <h3>Merchant accounts and credit card processing</h3>
                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                        <div class="agileits_w3layouts_more menu__item">
                            <a href="#" class="menu__link" data-toggle="modal" data-target="#myModal">Learn More</a>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="w3l_banner_info">
                        <h3>Don't hesitate to accept credit cards today!</h3>
                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                        <div class="agileits_w3layouts_more menu__item">
                            <a href="#" class="menu__link" data-toggle="modal" data-target="#myModal">Learn More</a>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <!-- //Slider -->

    </div>
</div>
<!-- Modal1 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
    <div class="modal-dialog">
        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <img src="images/g7.jpg" alt=" " class="img-responsive">
                <h5>Donec lobortis pharetra dolor</h5>
                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, rds which don't look even slightly believable..</p>
            </div>
        </div>
        <!-- //Modal content-->
    </div>
</div>
<!-- //Modal1 -->
<!-- //banner section -->
<!-- about -->
<div class="about" id="about">
    <div class="container">
        <h3 class="w3l-title"><span>About</span> Us</h3>
        <div class="w3-agileits-about-grids">
            <div class="col-md-5 agile-about-right">
                <img src="images/3.png" alt="" />
            </div>
            <div class="col-md-7 agile-about-left">
                <h3 class="w3l-sub">Offering the most </h3>
                <p class="sub-p">competitive rates and fees</p>
                <p class="sub-p2">Lorem ipsum dolor sit amet, do eiusmod magna aliqua</p>
                <p class="sub-p3">Lorem ipsum dolor sit amet, do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<!-- //about -->
<!-- wthree-slid -->
<div class="wthree-slid">
    <div class="col-sm-6 col-xs-8 wthree-slid-right">
        <h4>The best way to save your time and money</h4>
        <p>Express bank will save your time, money and improve the way you manage your business finances. You will have the control you need, with multiple disbursement and payment options, along with many other cash management features to help you optimize your business cash flow</p>
        <a class="w3l-cont scroll" href="#contact">Contact Us</a>
    </div>
    <div class="col-sm-6 col-xs-4 wthree-slid-left">

    </div>
    <div class="clearfix"> </div>
</div>
<!-- wthree-slid -->
<!-- services -->
<div class="services" id="services">
    <div class="container">
        <h3 class="w3l-title"><span>Our</span> Services</h3>
        <div class="col-md-4 services-grids-1">

        </div>
        <div class="col-md-4 services-grids">
            <div class="wthree-services-grid">
                <div class="wthree-services-icon">
                    <i class="fa fa-money" aria-hidden="true"></i>
                </div>
                <div class="wthree-services-info">
                    <h5>Free Online </h5>
                    <p>Ut at sagittis nisi,Cras porttitor a purus ac rutrum. </p>
                </div>
            </div>
            <div class="wthree-services-grid w3l-agile">
                <div class="wthree-services-icon">
                    <i class="fa fa-user" aria-hidden="true"></i>
                </div>
                <div class="wthree-services-info">
                    <h5>Accept All Major</h5>
                    <p>Ut at sagittis nisi,Cras porttitor a purus ac rutrum. </p>
                </div>
            </div>
            <div class="wthree-services-grid">
                <div class="wthree-services-icon">
                    <i class="fa fa-car" aria-hidden="true"></i>
                </div>
                <div class="wthree-services-info">
                    <h5>Sales & Trading</h5>
                    <p>Ut at sagittis nisi,Cras porttitor a purus ac rutrum. </p>
                </div>
            </div>
        </div>
        <div class="col-md-4 services-grids w3l-seco">
            <div class="wthree-services-grid">
                <div class="wthree-services-icon">
                    <i class="fa fa-cog" aria-hidden="true"></i>
                </div>
                <div class="wthree-services-info">
                    <h5>Fast Setup</h5>
                    <p>Ut at sagittis nisi,Cras porttitor a purus ac rutrum. </p>
                </div>
            </div>
            <div class="wthree-services-grid w3l-agile">
                <div class="wthree-services-icon">
                    <i class="fa fa-signal" aria-hidden="true"></i>
                </div>
                <div class="wthree-services-info">
                    <h5>Financial Advisors</h5>
                    <p>Ut at sagittis nisi,Cras porttitor a purus ac rutrum. </p>
                </div>
            </div>
            <div class="wthree-services-grid">
                <div class="wthree-services-icon">
                    <i class="fa fa-credit-card" aria-hidden="true"></i>
                </div>
                <div class="wthree-services-info">
                    <h5>Tax Consulting</h5>
                    <p>Ut at sagittis nisi,Cras porttitor a purus ac rutrum. </p>
                </div>
            </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //services -->
<!--stats-->
<div data-vide-bg="video/coins">
    <div class="stats center-container" id="stats">
        <div class="container">
            <div class="stats-info">
                <div class="col-md-4 col-xs-4 stats-grid slideanim">
                    <i class="fa fa-user-o" aria-hidden="true"></i>
                    <div class="agile-one">
                        <h4 class="stats-info">Employees</h4>
                        <div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='12760' data-delay='.5' data-increment="1">12760</div>
                    </div>
                </div>
                <div class="col-md-4 col-xs-4 stats-grid slideanim">
                    <i class="fa fa-globe" aria-hidden="true"></i>
                    <div class="agile-one">
                        <h4 class="stats-info">Locations</h4>
                        <div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='12760' data-delay='.5' data-increment="1">12760</div>
                    </div>
                </div>
                <div class="col-md-4 col-xs-4 stats-grid slideanim">
                    <i class="fa fa-diamond" aria-hidden="true"></i>
                    <div class="agile-one">
                        <h4 class="stats-info">Awards Winning</h4>
                        <div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='12760' data-delay='.5' data-increment="1">12760</div>
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
</div>
<!--//stats-->
<!-- team -->
<div id="team" class="team agileits">
    <div class="team-agileinfo">
        <div class="container">
            <h3 class="w3l-title"><span>Our</span> Team</h3>
            <div class="team-row agileits-w3layouts">
                <div class="col-md-3 col-xs-6 team-grids">
                    <div class="team-agileimg">
                        <img class="img-responsive" src="images/IMG_20180319_232536_639.jpg" alt="">
                        <div class="captn">
                            <div class="captn-top">
                                <h4>Susanna Mkrtchyan </h4>
                                <p>Manager</p>
                            </div>
                            <div class="social-w3lsicon agileinfo-social-grids">
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-rss"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-xs-6 team-grids">
                    <div class="team-agileimg">
                        <img class="img-responsive" src="images/IMG_20180319_232536_639.jpg" alt="">
                        <div class="captn">
                            <div class="captn-top">
                                <h4>Susanna Mkrtchyan</h4>
                                <p>Manager</p>
                            </div>
                            <div class="social-w3lsicon agileinfo-social-grids">
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-rss"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-xs-6 team-grids">
                    <div class="team-agileimg">
                        <img class="img-responsive" src="images/IMG_20180319_232536_639.jpg" alt="">
                        <div class="captn">
                            <div class="captn-top">
                                <h4>Susanna Mkrtchyan</h4>
                                <p>Manager</p>
                            </div>
                            <div class="social-w3lsicon agileinfo-social-grids">
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-rss"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-xs-6 team-grids">
                    <div class="team-agileimg">
                        <img class="img-responsive" src="images/IMG_20180319_232536_639.jpg" alt="">
                        <div class="captn">
                            <div class="captn-top">
                                <h4>Susanna Mkrtchyan</h4>
                                <p>Manager</p>
                            </div>
                            <div class="social-w3lsicon agileinfo-social-grids">
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-rss"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
</div>
<!-- //team -->
<!-- testimonials -->
<div class="testimonials">
    <div class="wthree_testimonial_grids">
        <div class="col-md-6 wthree_testimonial_grid_left">
            <div class="w3ls_testimonial_grid_left_grid">
                <div class="col-xs-4 agileinfo_testimonials_left">
                    <img src="images/f2.jpg" alt=" " class="img-responsive" />
                    <h4>John Crisp</h4>
                </div>
                <div class="col-xs-8 agileinfo_testimonials_right">
                    <div class="agileits_testimonials_right_grid">
                        <p>Donec euismod consequat mi,
                            Quisque id justo sagittis iaculis.</p>
                    </div>
                </div>
                <div class="clearfix"> </div>
            </div>
            <div class="w3ls_testimonial_grid_left_grid w3l_testimonial_grid_left_grid">
                <div class="col-xs-8 agileinfo_testimonials_right agileits_w3layouts_farm_man">
                    <div class="agileits_testimonials_right_grid w3_testimonials_right_grid">
                        <p>Donec euismod consequat mi,
                            Quisque id justo sagittis iaculis.</p>
                    </div>
                </div>
                <div class="col-xs-4 agileinfo_testimonials_left">
                    <img src="images/f3.jpg" alt=" " class="img-responsive" />
                    <h4>Thomus Carl</h4>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <div class="col-md-6 stats_grid_left1">
            <img src="images/img3.png" alt=" " class="img-responsive">
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //testimonials -->
<!--/gallery-->
<div class="gallery" id="gallery">
    <div class="container">
        <h3 class="w3l-title"><span>Our</span> Gallery</h3>
        <div class="agile_gallery_grids w3-agile">
            <ul class="clearfix demo">
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g1.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g2.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g3.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g4.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g5.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g6.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g7.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g8.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="gallery-grid1">
                        <img src="images/g9.jpg" alt=" " class="img-responsive" />
                        <div class="p-mask">
                            <h4><span>Online</span> Banking</h4>
                            <p>Neque porro quisquam est, qui dolorem ipsum.</p>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<!--//gallery-->
<!-- mail -->
<div class="mail" id="contact">
    <div class="container">
        <h3 class="w3l-title"><span>Contact</span> Us</h3>
        <div class="mail-w3l-agile">
            <div class="col-md-6 col-sm-6 contact-left-w3ls">
                <div class="w3l-cont-mk">
                    <img src="images/img2.jpg">
                </div>
                <h3>Contact Info</h3>
                <div class="visit">
                    <div class="col-md-2 col-sm-2 col-xs-2 contact-icon-wthree">
                        <i class="fa fa-home" aria-hidden="true"></i>
                    </div>
                    <div class="col-md-10 col-sm-10 col-xs-10 contact-text-agileinf0">
                        <h4>Visit us</h4>
                        <p>Parma Via Modena,BO, Italy</p>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="mail-w3">
                    <div class="col-md-2 col-sm-2 col-xs-2 contact-icon-wthree">
                        <i class="fa fa-envelope-o" aria-hidden="true"></i>
                    </div>
                    <div class="col-md-10 col-sm-10 col-xs-10 contact-text-agileinf0">
                        <h4>Mail us</h4>
                        <p><a href="mailto:info@example.com">info@example.com</a></p>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="call">
                    <div class="col-md-2 col-sm-2 col-xs-2 contact-icon-wthree">
                        <i class="fa fa-phone" aria-hidden="true"></i>
                    </div>
                    <div class="col-md-10 col-sm-10 col-xs-10 contact-text-agileinf0">
                        <h4>Call us</h4>
                        <p>+18044261149</p>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="col-md-6 col-sm-6 agileinfo_mail_grid_right">
                <h3>Get In Touch</h3>
                <form action="#" method="post">
                    <div class="wthree_contact_left_grid">
                        <input type="text" name="Name" placeholder="Name" required="">
                        <input type="email" name="Email" placeholder="Email" required="">
                        <input type="text" name="number" placeholder="Phone Number" required="">
                    </div>
                    <textarea name="Message" placeholder="Message......." required=""></textarea>
                    <input type="submit" value="Submit">
                </form>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>
<div class="map">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3020.891169502999!2d43.836157315060035!3d40.786406679323825!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4041fbed15cdb0cb%3A0xea64b7ee5515c5de!2sGyumri+Technology+Center!5e0!3m2!1sru!2s!4v1516788863773" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
</div>
<!-- //mail -->
<!-- footer -->
<div class="footer-bot">
    <div class="container">
        <div class="logo2">
            <h2><a href="index.html"><span>Online</span> Banking</a></h2>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<div class="copy-right">
    <div class="agileinfo_social_icons">
        <ul class="agileits_social_list">
            <li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
            <li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
            <li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
            <li><a href="#" class="w3_agile_google"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
        </ul>
    </div>
    <div class="container">
        <p> &copy; 2017 Online Banking. All Rights Reserved | Design by  <a href="http://w3layouts.com/"> W3layouts</a></p>
    </div>
</div>
<!-- //footer -->

<!-- js files -->
<!-- js -->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script> <!-- Necessary-JavaScript-File-For-Bootstrap -->
<!-- //js -->
<!-- js for banner -->
<!-- responsiveslider -->
<script src="js/responsiveslides.min.js"></script>
<script>
    // You can also use "$(window).load(function() {"
    $(function () {
        // Slideshow 4
        $("#slider3").responsiveSlides({
            auto: true,
            pager:true,
            nav:false,
            speed: 500,
            namespace: "callbacks",
            before: function () {
                $('.events').append("<li>before event fired.</li>");
            },
            after: function () {
                $('.events').append("<li>after event fired.</li>");
            }
        });

    });
</script>
<!-- //responsiveslider -->
<!-- stats -->
<script type="text/javascript" src="js/numscroller-1.0.js"></script>
<!-- //stats -->
<!-- /js for banner -->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function($) {
        $(".scroll").click(function(event){
            event.preventDefault();
            $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
        });
    });
</script>
<!-- start-smoth-scrolling -->
<!-- smooth scrolling -->
<script src="js/SmoothScroll.min.js"></script>
<!-- //smooth scrolling -->
<!-- smooth-scrolling-of-move-up -->
<script type="text/javascript">
    $(document).ready(function() {
        /*
        var defaults = {
            containerID: 'toTop', // fading element id
            containerHoverID: 'toTopHover', // fading element hover id
            scrollSpeed: 1200,
            easingType: 'linear'
        };
        */

        $().UItoTop({ easingType: 'easeOutQuart' });

    });
</script>
<!-- //smooth-scrolling-of-move-up -->
<!-- video-js -->
<script src="js/jquery.vide.min.js"></script>
<!-- //video-js -->
<!--gallery-js -->
<script src="js/jquery.picEyes.js"></script>
<script>
    $(function(){
        //picturesEyes($('.demo li'));
        $('.demo li').picEyes();
    });
</script>
<!--//gallery-js -->
<!-- //js files -->

</body>
</html>
