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
		$("#fechaEntrega").datepicker({
			dateFormat : 'dd/mm/yy'
		});
	});
</script>


</head>
<body>
	<h3>PRESUPUESTO PLAZA VEA</h3>
	<form:form commandName="presupuestoForm" class="form-horizontal">

	<div id="div01">
		<div class="col-md-12">
			<div class="col-md-6">
				<div class="panel panel-info">
					<div class="panel-heading">Detalle de la Prenda</div>
					<div class="panel-body">
	
						<div class="form-group">
							<label class="col-lg-3 control-label" for="nombre">Nombre:</label>
							<div class="col-lg-9">
								<form:input path="nombre" maxlength="50"
									class="form-control input-sm" id="nombre" />
								<form:errors path="nombre" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-lg-3 control-label" for="fechaEntrega">Fecha Entrega:</label>
							<div class="col-lg-9">
								<form:input path="fechaEntrega" maxlength="50"
									class="form-control input-sm" id="fechaEntrega" />
								<form:errors path="fechaEntrega" />
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-lg-3 control-label" for="estado">Estado:</label>
							<div class="col-lg-9">
									<form:select path="estado" class="form-control">
									<form:option value="P" label="Pendiente" />
									<form:option value="A" label="Aprobado" />
									<form:option value="E" label="Enviado" />
									</form:select>						
								<form:errors path="estado" />
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-lg-1 control-label" for="detalle">Detalle:</label>
						</div>	
						
						<div class="form-group">
							<div class="col-lg-8">
								<form:textarea path="detalle" class="form-control input-sm" id="detalle" rows="5"/>
								<form:errors path="detalle" />
							</div>
						</div>												
					</div>
				</div>
			</div>
			<div class="col-md-6"></div>
		</div>
	</div>

	<div class="div02">
		<div class="col-lg-12">
			<div class="col-lg-3">
				<h4>Materia Prima: Casaca - MC32</h4>
			</div>
			<div class="col-lg-9">
					
			</div>			
		</div>

		<div class="col-lg-7">
			<!-------->
			<div id="medidaPrenda" role="tabpanel">
			    <ul id="tabs" class="nav nav-tabs" data-tabs="tabs" role="tablist">
			        <li role="presentation" class="active"><a href="#tallat" data-toggle="tab">Resumen</a></li>
			        <li role="presentation"><a href="#tallas" data-toggle="tab">Talla S</a></li>
			        <li role="presentation"><a href="#tallam" data-toggle="tab">Talla M</a></li>
			        <li role="presentation"><a href="#tallal" data-toggle="tab">Talla L</a></li>
			        <li role="presentation"><a href="#tallaxl" data-toggle="tab">Talla XL</a></li>
			    </ul>
			    <div id="my-tab-content" class="tab-content">
			        <div role="tabpanel" class="tab-pane active" id="tallat">           
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Tipo Costo</th>
									<th>Concepto</th>													
									<th>Cantidad</th>
									<th>Precio</th>
									<th>Costo</th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMateriaPrimaResumen}">
									<tr>
										<td>${item.tipoCosto}</td>
										<td>${item.concepto}</td>
										<td>${item.cantidad}</td>
										<td>${item.precio}</td>
										<td>${item.costo}</td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>         
			        </div>			    
			        <div role="tabpanel" class="tab-pane" id="tallas">           
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Tipo Costo</th>
									<th>Concepto</th>													
									<th>Cantidad</th>
									<th>Precio</th>
									<th>Costo</th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMateriaPrimaTallaS}">
									<tr>
										<td>${item.tipoCosto}</td>
										<td>${item.concepto}</td>
										<td>${item.cantidad}</td>
										<td>${item.precio}</td>
										<td>${item.costo}</td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>         
			        </div>
			        <div role="tabpanel" class="tab-pane" id="tallam">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Tipo Costo</th>
									<th>Concepto</th>													
									<th>Cantidad</th>
									<th>Precio</th>
									<th>Costo</th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMateriaPrimaTallaM}">
									<tr>
										<td>${item.tipoCosto}</td>
										<td>${item.concepto}</td>
										<td>${item.cantidad}</td>
										<td>${item.precio}</td>
										<td>${item.costo}</td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>
			        </div>
			        <div role="tabpanel" class="tab-pane" id="tallal">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Tipo Costo</th>
									<th>Concepto</th>													
									<th>Cantidad</th>
									<th>Precio</th>
									<th>Costo</th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMateriaPrimaTallaL}">
									<tr>
										<td>${item.tipoCosto}</td>
										<td>${item.concepto}</td>
										<td>${item.cantidad}</td>
										<td>${item.precio}</td>
										<td>${item.costo}</td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>
			        </div>
			        <div role="tabpanel" class="tab-pane" id="tallaxl">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Tipo Costo</th>
									<th>Concepto</th>													
									<th>Cantidad</th>
									<th>Precio</th>
									<th>Costo</th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMateriaPrimaTallaXL}">
									<tr>
										<td>${item.tipoCosto}</td>
										<td>${item.concepto}</td>
										<td>${item.cantidad}</td>
										<td>${item.precio}</td>
										<td>${item.costo}</td>
									</tr>								
								</c:forEach>
							</tbody>
						</table> 
			        </div>
			    </div>
			</div>
			<!-- ----------- -->
		</div>
		 
		<script type="text/javascript">
		    jQuery(document).ready(function ($) {
		        $('#tabs').tab();
		    });
		</script>   
	</div> 
	
	<div id="div03">
		<div class="col-md-6">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Concepto</th>
						<th>%</th>													
						<th>Total</th>
					</tr>								
				</thead>
				<tbody>
					<c:forEach var="item" items="${listadoResumenTotal}">
						<tr>
							<td>${item.concepto}</td>
							<td>${item.porcentaje}</td>
							<td>${item.total}</td>
						</tr>								
					</c:forEach>
				</tbody>
			</table> 	
		</div>
		<div class="col-md-6">
			<div class="col-md-6">
				<br/>
				<br/>
				<br/>
				<br/>
				<br/>
				<br/>	
				<div class="form-group">
					<label class="col-lg-6 control-label" for="porcentajeProduccionAdm">% Prod y Adm:</label>
					<div class="col-lg-3">
						<form:input path="porcentajeProduccionAdm" maxlength="50"
							class="form-control input-sm" id="porcentajeProduccionAdm" />
						<form:errors path="porcentajeProduccionAdm" />
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-lg-6 control-label" for="porcentajeUtilidad">% Utilidad:</label>
					<div class="col-lg-3">
						<form:input path="porcentajeUtilidad" maxlength="50"
							class="form-control input-sm" id="porcentajeUtilidad" />
						<form:errors path="porcentajeUtilidad" />
					</div>
				</div>
				<button type="button" class="btn btn-info">Calcular</button>		
			</div>
		</div>
	</div>

	<div id="div04">
		<div class="col-md-12">

			<button type="button" class="btn btn-info">Cancelar</button>
			<button type="button" class="btn btn-info">Guardar</button>
			<button type="button" class="btn btn-info">Ver Cotizacion</button>
			<button type="button" class="btn btn-info">Enviar</button>
			<button type="button" class="btn btn-info">Imprimir</button>
		<br/>
		<br/>
		<br/>

		</div>
	</div>

	</form:form>
</body>

</html>