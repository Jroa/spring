<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Lista de Molde por Especificacion de Prenda</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
</head>
<body>
			<h3>Lista de Molde por Especificacion de Prenda</h3>
			<table class="table table-hover">
				<thead>
					<tr>
						<th></th>
						<th>Nombre</th>													
						<th>Cliente</th>
						<th>Estado</th>
						<th>Operaciones</th>
						<th>Materia Prima</th>
					</tr>								
				</thead>
				<tbody>
					<c:forEach var="item" items="${listadoMoldeEspecificacionPrenda}">
						<tr>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Crear &nbsp; </button></td>
							<td>${item.nombreMolde}</td>
							<td>${item.nombreCliente}</td>
							<td>${item.estado}</td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Crear &nbsp; </button></td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Asignar &nbsp; </button></td>
						</tr>								
					</c:forEach>
				</tbody>
			</table>
</body>
</html>
