<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Lista de Especificacion Prenda</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
</head>
<body>
			<h3>Lista de Especificacion Prendas</h3>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Prenda</th>													
						<th>Fecha Probable</th>
						<th>Fecha Entrega</th>
						<th>Cliente</th>
						<th>Molde</th>
						<th>Presupuesto</th>
						<th>Plan Produccion</th>
					</tr>								
				</thead>
				<tbody>
					<c:forEach var="item" items="${listaEspecificacionPrenda}">
						<tr>
							<td>${item.idEspecificacionPrenda}</td>
							<td>${item.nombrePrenda}</td>
							<td><fmt:formatDate pattern="dd/MM/yyyy" value="${item.fechaProbable}" /></td>
							<td><fmt:formatDate pattern="dd/MM/yyyy" value="${item.fechaEntrega}" /></td>
							<td>${item.nombreCliente}</td>
							
							<td><button type="button" class="btn btn-default btn-xs" onclick="location.href='/siraywasi/molde/registrarmolde'"> &nbsp; Crear &nbsp; </button>${item.indicadorMolde}</td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Pendiente &nbsp; </button>${item.indicadorPresupuesto}</td>
							<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Calcular &nbsp; </button>${item.indicadorPlanProduccion}</td>
						</tr>								
					</c:forEach>
				</tbody>
			</table>
</body>
</html>