<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles.css">
</head>
<body>
<header><h1>It's header</h1></header>

	
		<form:form action="save" modelAttribute="user">
		<table >
			<tr>
				<form:input path="id" value="${user.id }" hidden="true" />
			</tr>

			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" value="${user.firstName}" /></td>

			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" value="${user.lastName }" /></td>

			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country" name="countryList">
						<option></option>
						<c:forEach var="countryVar" items="${countries }">
							<option value="${countryVar}">${countryVar}</option>
						</c:forEach>
					</form:select></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" value="${user.age }" />
					<form:errors path="age" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Sex</td>
				<td>Man<form:radiobutton path="sex" value="true" /> Woman<form:radiobutton
						path="sex" value="false" /></td>
			<tr>
				<td>Login</td>
				<td><form:input path="login" value="${user.login }" /> <form:errors
						path="login" cssClass="error" /></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" value="${user.password }" /> <form:errors
						path="password" cssClass="error" /></td>

			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
				<td><input type="button" value="Cancel"
					onClick='location.href="${pageContext.request.contextPath}/modify"'></td>
			</tr>
			</table>
		</form:form>
	
	
	<footer><h2>It's footer</h2></footer>

	<script>
		if(${user.country!=null}){			
			var select=document.querySelector('select');
			for(var i=0; i<select.options.length;i++){
				if(select.options[i].value=="${user.country}"){
					select.options[i].selected=true;
				}	
			}
		}		
	</script>
</body>
</html>