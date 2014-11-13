<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Lista de Catalogo de Prendas</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
</head>
<body>
			<h3>Lista de Catalogo de Prendas</h3>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Nombre</th>													
						<th>Tipo Tela</th>
						<th>Eliminar</th>
					</tr>								
				</thead>
				<tbody>
					<c:forEach var="item" items="${listadoPrendas}">
						<tr>
							<td>${item.idPrenda}</td>
							<td>${item.nombrePrenda}</td>
							<td>${item.nombreTipoTela}</td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
						</tr>								
					</c:forEach>
				</tbody>
			</table>
</body>
</html>
