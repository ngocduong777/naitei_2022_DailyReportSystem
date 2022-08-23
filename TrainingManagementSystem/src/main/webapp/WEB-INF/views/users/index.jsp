<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	<div class="container mt-3">
		<h1>${message}</h1>
		<h1>Add User Form</h1>
		<form:form action="/TrainingManagementSystem/users/create" method="POST" modelAttribute="user">
			<form:hidden path="id" />
			<form:label path="name">Name:</form:label>
			<form:input path="name" />
			<form:label path="email">Email:</form:label>
			<form:input path="email" />
			<form:label path="role">Role:</form:label>
			<form:input path="role" />
			<form:label path="division.id">Division ID:</form:label>
			<form:input path="division.id" />
			<input type="submit" value="Submit" />
		</form:form>
	</div>

</body>
</html>