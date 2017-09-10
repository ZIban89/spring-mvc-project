<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/styles.css">
</head>
<body>
	<header>
		<h1>It's header</h1>
	</header>
	
	<form action="delete" id="deleteForm" name="deleteForm">
		<table>
			<tr>
				<th><input type="checkbox" id="delete"></th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Country</th>
				<th>sex</th>
				<th>Edit user</th>
			</tr>
			<c:forEach var="user" items="${users}">
				<tr>

					<td><input type="checkbox" name="id" value="${user.id}"
						form="deleteForm"></td>
					<td><p>${user.firstName}</p></td>
					<td><p>${user.lastName }</p></td>
					<td><p>${user.age }</p></td>
					<td><p>${user.country.name }</p></td>
					<td><c:if test="${user.sex }">
							<p>man</p>
						</c:if> <c:if test="${!user.sex }">
							<p>woman</p>
						</c:if></td>
					<td><a class="c"
						href="${pageContext.request.contextPath}/edit-user-${user.id}">Edit</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" id="delBtn" value="Delete" disabled="disabled"
			onClick="return delFunction()" /> <input type="button" id="newBtn" value="New"
			onClick='location.href="${pageContext.request.contextPath}/edit-user--1"' />
	</form>

	<footer>
		<h2>It's footer</h2>
	</footer>

	<script
		src="${pageContext.request.contextPath}/resources/del-btn-script.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/del-users-script.js"></script>

</body>
</html>