<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="main.js"></script>
</head>
<style>* {
    margin: 0;
    padding: 0;
}

body,
html {
    font-family: 'Roboto', sans-serif;
    display: flex;
    height: 100%;
    align-items: center;
    justify-content: center;
    color: #999;
    background: #3c5f6c;
}

#wrapper {
    display: flex;
    width: 300px;
    height: 450px;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    background: #1f1f1f;
    padding: 20px;
    box-sizing: border-box;
    border-radius: 10px;
    border: 2px solid #222;
    perspective: 800px;
    position: relative;
    transform-style: preserve-3d;
    transition: transform 1s;
}

.login,
.register {
    display: flex;
    flex: 1;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    width: 100%;
    margin: 0;
    position: absolute;
    width: 100%;
    height: 100%;
    backface-visibility: hidden;
}

.back {
    transform: rotateY(180deg);
}

.flipped {
    transform: rotateY(180deg);
}

h1 {
    text-transform: uppercase;
    letter-spacing: 5px;
    margin-bottom: 30px;
    color: #3c5f6c;
}

input {
    padding: 5px;
    margin: 15px;
    width: 80%;
    padding: 5px;
    padding-left: 35px;
    outline: none;
    border: none;
    background: none;
    color: #999;
    border-bottom: 1px solid #444;
}

button {
    outline: none;
    border: none;
    background: none;
    text-transform: uppercase;
    color: #fcfcfc;
    background: #3c5f6c;
    border: 1px solid #3c5f6c;
    border-radius: 5px;
    width: 100px;
    height: 30px;
    margin: 8px;
    font-weight: bold;
    transition: all 0.5s ease;
}

button:hover {
    cursor: pointer;
    background: #fcfcfc;
    color: #3c5f6c;
}

.links {
    display: flex;
    flex: 1;
    max-height: 50px;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    font-size: 14px;
    width: 100%;
}

.links a {
    text-decoration: none;
    color: #3c5f6c;
    padding: 5px;
}

.links a:hover {
    text-decoration: underline;
}

.login .links {
    padding-top: 20px;
}

.input-wrapper {
    display: flex;
    align-items: center;
    justify-content: center;
    width: 100%;
}

.fa {
    position: relative;
    right: -35px;
    transition: opacity 2s ease-in-out;
}

.flipped .login .fa {
    opacity: 0;
    transition: opacity .2s ease-in-out;
}
</style>
<body>
<div id="wrapper" class="normal">
    <div class="login front">
        <h1>Welcome</h1>
        <div class="input-wrapper">
            <i class="fa fa-envelope" aria-hidden="true"></i>
            <input type="email" placeholder="Email">
        </div>
        <div class="input-wrapper">
            <i class="fa fa-lock" aria-hidden="true"></i>
            <input type="password" placeholder="Password">
        </div>
        <button type="submit"><a href="manager.jsp">Login</a></button>
        <div class="links">
            <a href="#" class="toggler">Don't have and account?</a>
        </div>
    </div>
    <div class="register back">
        <h1>Welcome</h1>
        <form action="<c:url value="/loginPage"/> " method="post" name="loginForm">
            <div class="input-wrapper">
                <i class="fa fa-envelope" aria-hidden="true"></i>
                <input type="email" placeholder="Email">
            </div>
            <div class="input-wrapper">
                <i class="fa fa-user" aria-hidden="true"></i>
                <input type="text" placeholder="Full name">
            </div>
            <div class="input-wrapper">
                <i class="fa fa-lock" aria-hidden="true"></i>
                <input type="password" placeholder="Password">
            </div>
            <div class="input-wrapper">
                <i class="fa fa-lock" aria-hidden="true"></i>
                <input type="password" placeholder="Confirm password">
            </div>

            <button type="submit">Register</button>

            <div class="links">
                <a href="manager.jsp" class="toggler">Login</a>
            </div>
        </form>
    </div>
</div>
<script>
    $(document).ready(function () {

        $(".toggler").on("click", function () {
            $(".normal").toggleClass("flipped");
        });

    });</script>
</body>

</html>
