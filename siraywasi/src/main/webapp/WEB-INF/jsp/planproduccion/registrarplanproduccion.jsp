<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Catalogo de Prenda</title>
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet" />
<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />

<script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script>
<script src="<c:url value="/resources/js/ui/1.11.2/jquery-ui.js" />"></script>
<link rel="stylesheet" href="<c:url value="/resources/js/ui/1.11.2/jquery-ui.css" />" />
<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>

<script>
	$(function() {
		$("#fechaProbableEntrega").datepicker({
			dateFormat : 'dd/mm/yy'
		});
	});
</script>


</head>
<body>
<h3>PLAN PRODUCCION</h3>

	<form:form commandName="planProduccionForm" class="form-horizontal">
	<div id="div01">
		<div class="col-md-12">
			<div class="col-md-6">
				<div class="panel panel-info">
					<div class="panel-heading">Detalle de la Prenda</div>
					<div class="panel-body">
	
						<div class="form-group">
							<label class="col-lg-3 control-label" for="nombrePrenda">Nombre:</label>
							<div class="col-lg-9">
								<form:input path="nombrePrenda" maxlength="50"
									class="form-control input-sm" id="nombrePrenda" />
								<form:errors path="nombrePrenda" />
							</div>
						</div>
				
						<div class="form-group">
							<label class="col-lg-3 control-label" for="fechaProbableEntrega">Probable Entrega:</label>
							<div class="col-lg-9">
								<form:input path="fechaProbableEntrega" maxlength="50"
									class="form-control input-sm" id="fechaProbableEntrega" />
								<form:errors path="fechaProbableEntrega" />
							</div>
						</div>	
			
						<div class="form-group">
							<label class="col-lg-3 control-label" for="prenda">Prenda:</label>
							<div class="col-lg-9">
								<form:input path="prenda" maxlength="50"
									class="form-control input-sm" id="prenda" />
								<form:errors path="prenda" />
							</div>
						</div>	
			
						<div class="form-group">
							<label class="col-lg-3 control-label" for="estado">Estado:</label>
							<div class="col-lg-9">
									<form:select path="estado" class="form-control">
									<form:option value="P" label="Pendiente" />
									<form:option value="A" label="Aprobado" />
									</form:select>						
								<form:errors path="estado" />
							</div>
						</div>
			
						<div class="form-group">
							<label class="col-lg-3 control-label" for="color">Color:</label>
							<div class="col-lg-9">
								<form:select path="color.idColor" id="idColor"
									class="form-control">
									<form:options items="${listaColor}" itemLabel="nombreColor"
										itemValue="idColor" />
								</form:select>
								<form:errors path="color" />					
							</div>
						</div>
						<div class="form-group">
							<div class="col-lg-8">
								<h4>Tallas</h4>
								<table class="table table-hover">
									<thead>
										<tr>
											<th>Talla</th>
											<th>Cantidad</th>
										</tr>								
									</thead>
									<tbody>
										<c:forEach var="item" items="${resumenTallas}">
											<tr>
												<td>${item.talla}</td>
												<td>${item.cantidad}</td>
											</tr>								
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
						<button type="button" class="btn btn-info">Ver Archivo Adjunto</button>
					</div>
				</div>
			</div>
			<div class="col-md-6"></div>
		</div>
	</div>
	<div id="div02">
		<div class="col-md-12">
		<div class="panel panel-info">
		
			<div class="panel-heading">Asignacion de Taller</div>
			<div class="panel-body">

				<div class="col-md-6">
					<h4>Taller Disponible</h4>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Tipo de Taller</th>
								<th>Nombre</th>
								<th>Disponibilidad</th>
								<th>Prox Disponiblidad</th>
								<th>% Avance</th>
							</tr>								
						</thead>
						<tbody>
							<c:forEach var="item" items="${talleresDisponibles}">
								<tr>
									<td>${item.tipoTaller}</td>
									<td>${item.nombre}</td>
									<td>${item.disponibilidad}</td>
									<td>${item.proximaDisponibilidad}</td>
									<td>${item.avance}</td>
								</tr>								
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="col-md-1">
					<br/>
					<br/>
					<br/>
					<br/>
					<button type="button" class="btn btn-info" aria-label="Left Align">
					  	<span class="glyphicon glyphicon-arrow-right" aria-hidden="true"></span>
					</button>
					<br/><br/>
					<button type="button" class="btn btn-info" aria-label="Left Align">
					  	<span class="glyphicon glyphicon-arrow-left" aria-hidden="true"></span>
					</button>					
				</div>
				<div class="col-md-4">
					<h4>Taller Asignado</h4>
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Nombre</th>
								<th>Cantidad</th>
								<th>Fec. Entrega</th>
							</tr>								
						</thead>
						<tbody>
							<c:forEach var="item" items="${talleresAsignados}">
								<tr>
									<td>${item.nombre}</td>
									<td>${item.cantidad}</td>
									<td>${item.fechaEntrega}</td>
								</tr>								
							</c:forEach>
						</tbody>
					</table>
					<button type="button" class="btn btn-info">Cancelar</button>
					<button type="button" class="btn btn-info">Guardar</button>
				</div>

			</div>
		</div>
		</div>
	</div>
	
	
	<div id="div03">
		<div class="col-md-12">
			<div class="col-md-6">
			
				<div class="panel panel-info">
				
					<div class="panel-heading">Resumen de Talleres Asignados</div>
					<div class="panel-body">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Color</th>
									<th>Talla</th>
									<th>Cantidad</th>
									<th>Tipo de Taller</th>
									<th>Nombre</th>
									<th>Fecha</th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${resumenTalleresAsignados}">
									<tr>
										<td>${item.color}</td>
										<td>${item.talla}</td>
										<td>${item.cantidad}</td>
										<td>${item.tipoTaller}</td>
										<td>${item.nombre}</td>
										<td>${item.fechaEntrega}</td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>				
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<br/>
				<br/>
				<br/>
				<br/>
				<h4>Fecha Final de Entrega: 25/10/2014</h4>
			</div>
		</div>	
	
	</div>

	<div id="div04">
		<div class="col-md-4"></div>
		<div class="col-md-4">
			<button type="button" class="btn btn-info">Cancelar</button>
			<button type="button" class="btn btn-info">Confirmar Asignacion</button>
			<br/>
			<br/>
			<br/>		
		</div>
		<div class="col-md-4"></div>
	
	</div>
	</form:form>
</body>
</html>
