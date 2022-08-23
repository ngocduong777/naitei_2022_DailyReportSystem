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
		


		<h3 class="mb-5 mt-5 addDivisionButton"><a href="${baseURL}/admin/AddNewDivision"><i class="fas fa-plus"></i> Thêm bộ phận</a></h3>
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Tên</th>
					<th scope="col">Mô tả</th>
					<th scope="col">Manager ID</th>
					<th scope="col"></th>
					<th scope="col"></th>
					

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listDivisions}" var="division">
					<tr>
						<th scope="row">${division.id}</th>
						<td>${division.name}</td>
						<td>${division.description}</td>
						<td>${division.getManager().getId()}</td>
						<td>Sửa <i class="fas fa-edit"></i></td>
						<td>Xóa <i class="fas fa-trash-alt"></i></td>

					</tr>
				</c:forEach>


			</tbody>
		</table>
	</div>



</body>
</html>