<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="baseURL" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	<div class="container mt-3">


		<h1 class="text-center">Danh sách các bộ phận</h1>



		<h3 class="mb-5 mt-5 addDivisionButton">
			<a href="${baseURL}/admin/divisions/new"><i class="fas fa-plus"></i>
				Thêm bộ phận</a>
		</h3>
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Tên</th>
					<th scope="col">Manager ID</th>
					<th scope="col">Hành động</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listDivisions}" var="division">
					<tr>
						<th scope="row">${division.id}</th>
						<td>${division.name}</td>
						<td>${division.getManager().getId()}</td>
						<td><i class="fas fa-edit EditIcon me-3"></i> <i
							class="fas fa-trash-alt TrashIcon"></i></td>
						<td><a class="btn btn-warning seeDetailButton" href="#"
							role="button">Xem chi tiết <i class="fas fa-eye"></i></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>



</body>
</html>