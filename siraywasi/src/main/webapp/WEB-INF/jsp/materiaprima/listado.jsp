<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Lista de Materia Prima</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
</head>
<body>
			<h3>Lista de Materia Prima</h3>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nombre</th>													
						<th>Cantidad</th>
						<th>Unidad</th>
						<th>Ult Costo</th>
						<th>Proveedor</th>
						<th>Eliminar</th>
					</tr>								
				</thead>
				<tbody>
					<c:forEach var="item" items="${listadoMateriaPrima}">
						<tr>
							<td>${item.idMateriaPrima}</td>
							<td>${item.nombreMateriaPrima}</td>
							<td>${item.cantidad}</td>
							<td>${item.nombreUnidadMedida}</td>
							<td>${item.ultimoCosto}</td>
							<td>${item.nombreProveedor}</td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
						</tr>								
					</c:forEach>
				</tbody>
			</table>
</body>
</html>