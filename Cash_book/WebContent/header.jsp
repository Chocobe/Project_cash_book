<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CashBook</title>
<script type="text/javascript" src="member/member.js"></script>
<script type="text/javascript" src="./input_output.js"></script>
<link href= "css/style.css" rel = "stylesheet" type="text/css">
</head>
<body>
<div id="wrap">
<!--헤더 들어가는곳 시작-->
<header>
<!--로고 들어가는곳 시작-->
	<div id="logo">
		<a href="CashBook?command=main">
		<img src="images/logo.png" width="200" height ="100">
		</a>
	</div>
<nav id="category">
		<ul>  
			<li><a href="CashBook?command=main">MAIN</a></li>
			<li><a href="CashBook?command=login_form">LOGIN</a></li>
			<li><a href="CashBook?command=join_form">JOIN</a></li>
			<li><a href="CashBook?command=logout">LOGOUT</a></li>
		</ul>
	</nav>
	<nav id="top_menu">
		<ul>
			<li><a href="CashBook?command=input_form">가계부 작성하기</a></li>
			<li><a href="CashBook?command=output_form">가계부 보기</a></li>
		</ul>
	</nav>
</header>
<div class = "clear"></div>
<hr>
	
	
	
