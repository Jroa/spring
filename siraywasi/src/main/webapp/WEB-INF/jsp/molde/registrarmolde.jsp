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


</head>
<body>
<h3>MOLDE DE CASACA POLAR TS</h3>

	<form:form commandName="moldeForm" class="form-horizontal">

	<div id="div01"> 
		<div class="col-lg-4">
			<div class="form-group">
				<label class="col-lg-3 control-label" for="nombreMolde">Nombre:</label>
				<div class="col-lg-9">
					<form:input path="nombreMolde" maxlength="50"
						class="form-control input-sm" id="nombreMolde" />
					<form:errors path="nombreMolde" />
				</div>
			</div>
		
			<div class="form-group">
				<label class="col-lg-3 control-label" for="nombrePrenda">Prenda:</label>
				<div class="col-lg-9">
					<form:input path="nombrePrenda" maxlength="50"
						class="form-control input-sm" id="nombrePrenda" />
					<form:errors path="nombrePrenda" />
				</div>
			</div>
		</div>
		<div class="col-lg-4"></div>

		<div class="col-lg-4">
			<button type="button" class="btn btn-info">Asignar Materia Prima</button><br/><br/>
			<button type="button" class="btn btn-info">Asignar Operaciones</button>
		</div>
	</div>


	<div id="div02">
		<div class="col-md-12">
			<div class="form-group">
				<div class="col-md-3">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Avio Disponible</th>
							</tr>								
						</thead>
						<tbody>
							<c:forEach var="item" items="${listaAvioDisponible}">
								<tr>
									<td>${item.nombreAvio}</td>
								</tr>								
							</c:forEach>
						</tbody>
					</table>
				</div>
				
				<div class="col-md-1">
					<br/>
					<button type="button" class="btn btn-info">Asignar</button><br/><br/>
					<button type="button" class="btn btn-info">Desasignar</button>
				</div>
				
				<div class="col-md-3">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Avio Asignado</th>
							</tr>								
						</thead>
						<tbody>
							<c:forEach var="item" items="${listaAvioAsignado}">
								<tr>
									<td>${item.nombreAvio}</td>
								</tr>								
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
	<div id="div03">
		
		<div class="form-group">
			<label class="col-lg-1 control-label" for="detalle">Detalle:</label>
		</div>	
		
		<div class="form-group">
			<div class="col-lg-7">
				<form:textarea path="detalle" class="form-control input-sm" id="detalle" rows="5"/>
				<form:errors path="detalle" />
			</div>
		</div>
	</div>				
	

	<div class="div04">
		<div class="col-lg-12">
			<div class="col-lg-3">
				<h4>Descripcion de la Prenda</h4>
			</div>
			<div class="col-lg-9">
				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#modalMedida">Agregar</button>		
			</div>			
		</div>

		<div class="col-lg-7">
			<!-------->
			<div id="medidaPrenda" role="tabpanel">
			    <ul id="tabs" class="nav nav-tabs" data-tabs="tabs" role="tablist">
			        <li role="presentation" class="active"><a href="#tallas" data-toggle="tab">Talla S</a></li>
			        <li role="presentation"><a href="#tallam" data-toggle="tab">Talla M</a></li>
			        <li role="presentation"><a href="#tallal" data-toggle="tab">Talla L</a></li>
			        <li role="presentation"><a href="#tallaxl" data-toggle="tab">Talla XL</a></li>
			    </ul>
			    <div id="my-tab-content" class="tab-content">
			        <div role="tabpanel" class="tab-pane active" id="tallas">           
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Medidas</th>
									<th>Corte</th>													
									<th>Prenda Final</th>
									<th></th>
									<th></th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMoldeMedidaTallaS}">
									<tr>
										<td>${item.nombreMoldeMedida}</td>
										<td>${item.corte}</td>
										<td>${item.prendaFinal}</td>
										<td><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button></td>
										<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>         
			        </div>
			        <div role="tabpanel" class="tab-pane" id="tallam">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Medidas</th>
									<th>Corte</th>													
									<th>Prenda Final</th>
									<th></th>
									<th></th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMoldeMedidaTallaM}">
									<tr>
										<td>${item.nombreMoldeMedida}</td>
										<td>${item.corte}</td>
										<td>${item.prendaFinal}</td>
										<td><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button></td>
										<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>
			        </div>
			        <div role="tabpanel" class="tab-pane" id="tallal">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Medidas</th>
									<th>Corte</th>													
									<th>Prenda Final</th>
									<th></th>
									<th></th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMoldeMedidaTallaL}">
									<tr>
										<td>${item.nombreMoldeMedida}</td>
										<td>${item.corte}</td>
										<td>${item.prendaFinal}</td>
										<td><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button></td>
										<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
									</tr>								
								</c:forEach>
							</tbody>
						</table>
			        </div>
			        <div role="tabpanel" class="tab-pane" id="tallaxl">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Medidas</th>
									<th>Corte</th>													
									<th>Prenda Final</th>
									<th></th>
									<th></th>
								</tr>								
							</thead>
							<tbody>
								<c:forEach var="item" items="${listadoMoldeMedidaTallaXL}">
									<tr>
										<td>${item.nombreMoldeMedida}</td>
										<td>${item.corte}</td>
										<td>${item.prendaFinal}</td>
										<td><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button></td>
										<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
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

	
	<div id="div05">
		<div class="col-lg-12">
			<div class="col-lg-3">
				<h4>Detalle de Confeccion</h4>
			</div>
			<div class="col-lg-9">
				<button type="button" class="btn btn-info">Agregar</button>		
			</div>			
		</div>
		
		<div class="col-lg-6">
			<table class="table table-hover">
			<thead>
				<tr>
					<th>Confeccion</th>
					<th>Detalle Confeccion</th>
					<th></th>
					<th></th>
				</tr>								
			</thead>
			<tbody>
				<c:forEach var="item" items="${listaConfeccion}">
					<tr>
						<td>${item.nombreConfeccion}</td>
						<td>${item.detalleConfeccion}</td>
						<td><button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button></td>
						<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
					</tr>								
				</c:forEach>
			</tbody>
			</table>
		</div>		
	</div>
	
	<!-- Modal -->
	<div class="modal fade" id="modalMedida" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title" id="myModalLabel">Registrar Medida</h4>
	      </div>
	      <div class="modal-body">
				<div class="col-md-8">
					<div class="form-group">
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Medidas</th>
									<th>Corte</th>													
									<th>Prenda Final</th>
								</tr>								
							</thead>
							<tbody>
								<tr>
									<td><form:input path="medida" maxlength="50" class="form-control input-sm" id="medida" /></td>
									<td><form:input path="corte" maxlength="50" class="form-control input-sm" id="corte" /></td>
									<td><form:input path="prendaFinal" maxlength="50" class="form-control input-sm" id="prendaFinal" /></td>
								</tr>								
							</tbody>
						</table>
					</div>			
				</div>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>	
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	        <button type="button" class="btn btn-primary">Aceptar</button>
	      </div>
	    </div>
	  </div>
	</div>

	</form:form>
</body>
</html>


