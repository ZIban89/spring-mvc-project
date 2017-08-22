<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Вход</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>



	<form:form id="login" action="processUser" modelAttribute="user">

		<h1 id="ff-proof" class="ribbon">Форма входа &nbsp;&nbsp;</h1>

		<div class="apple">
			<div class="top">
				<span></span>
			</div>
			<div class="butt">
				<span></span>
			</div>
			<div class="bite"></div>
		</div>

		<fieldset id="inputs">
			<form:input id="username" path="username"/>
			<form:password id="password" path="password"/>
		</fieldset>

		<fieldset id="actions">
			<input type="submit" id="submit" value="ВОЙТИ" />
			<p class="option">
				<a href="https://ru.wikipedia.org/wiki/Spring_Framework#MVC">О Spring MVC</a>&nbsp;&nbsp;|<a href="${pageContext.request.contextPath}/signup">Регистрация</a>
			</p>
		</fieldset>

	</form:form>
</body>
</html>

