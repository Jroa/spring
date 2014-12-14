<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Lista de Molde por Especificacion de Prenda</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
	
	<script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script>
	<script src="<c:url value="/resources/js/ui/1.11.2/jquery-ui.js" />"></script>
	<link rel="stylesheet" href="<c:url value="/resources/js/ui/1.11.2/jquery-ui.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>	
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
							<td>
							<c:if test="${item.idMolde <= 0}">
							   <button type="button" class="btn btn-default btn-xs" onclick="location.href='/siraywasi/molde/registrarmolde'"> &nbsp; Crear &nbsp; </button>
							</c:if>
							<c:if test="${item.idMolde > 0}">
							   <button type="button" class="btn btn-default btn-xs"> &nbsp; Modificar &nbsp; </button>
							</c:if>							
							</td>
							<td>${item.nombreCatalogoPrenda}</td>
							<td>${item.nombreCliente}</td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Asignado &nbsp; </button></td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Crear &nbsp; </button></td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Asignar &nbsp; </button></td>
						</tr>								
					</c:forEach>
				</tbody>
			</table>
</body>
</html>
