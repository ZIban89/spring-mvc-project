<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Регистрация нового юзвера</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
		<form:form id="login" action="processNewUser" modelAttribute="user">

		<h1 id="ff-proof" class="ribbon">Форма регистрации &nbsp;&nbsp;</h1>

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
			<form:input id="reg-field" placeholder="username" path="username"/>
			<form:password id="reg-field" placeholder="password" path="password"/>
			<form:input id="reg-field" placeholder="age" path="age"/>
			<div id="reg-field">
			Sex:      
			Man<form:radiobutton path="sex" value="true"/>
			Woman<form:radiobutton path="sex"  value="false"/>
			</div>
			
			
			
		</fieldset>

		<fieldset id="actions">
			<input type="submit" id="submit" value="Подтвердить" />			
		</fieldset>

	</form:form>
</body>
</html>