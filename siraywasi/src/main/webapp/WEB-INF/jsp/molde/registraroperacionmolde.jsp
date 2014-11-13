<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Operacion por Molde</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
</head>
<body>
			<h3>Operacion por Molde</h3>
			<div class="col-md-4">
				<br/>
				<div class="form-group">
					<div class="col-lg-12">
						<label> Nombre:	Casaca Polar TS</label>
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-12">
						<label> Prenda:  Casaca / Polar / Cuello Alto </label>
					</div>
				</div>
				<br/>
				<div class="form-group">
					<button type="button" class="btn btn-info">Agregar Operacion</button>
				</div>
				<div class="form-group">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Operacion</th>
								<th></th>													
							</tr>								
						</thead>
						<tbody>
							<c:forEach var="item" items="${listaOperaciones}">
								<tr>
									<td>${item.nombreOperacion}</td>
									<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
								</tr>								
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="form-group">
					<div class="col-lg-2"></div>
					<div class="col-lg-8">
						<button type="button" class="btn btn-info">Cancelar</button>
						<button type="button" class="btn btn-info">Guardar</button>
					</div>
					<div class="col-lg-2"></div>
				</div>
		</div>				
</body>
</html>
