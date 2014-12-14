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
	<form:hidden path="resultadoGrabar" />
	
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
			<div id="divAvios">

			</div>
		</div>
	</div>
	
				<script type="text/javascript">
				$(document).ready(function() {

			        $.ajax({
			            url: '/siraywasi/molde/moldeavios',
			            type: "POST",
			            success: function (data) {
			                $("#divAvios").html(data);
			            }
			        });

			        
					if($("#resultadoGrabar").val()=="OK"){
						alert("Los datos se guardaron exitosamente");
						location.href='/siraywasi/molde/listadomoldeespecificacionprenda';
					}
				});			
			
				function agregarAvio(pIdAvio){
					
			        $.ajax({
			            url: '/siraywasi/molde/agregaravio',
			            type: "POST",
			            data: { idAvio: pIdAvio },
			            success: function (data) {
			                $("#divAvios").html(data);
			            }
			        });					
				}
			
				function eliminarAvio(pIdAvio){
			        $.ajax({
			            url: '/siraywasi/molde/eliminaravio',
			            type: "POST",
			            data: { idAvio: pIdAvio },
			            success: function (data) {
			                $("#divAvios").html(data);
			            }
			        });					
				}
				
			</script>
	
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
				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#modalMedida" onclick="IniciarValores()">Agregar</button>		
			</div>			
		</div>

		<div class="col-lg-7">
			<!-------->
			<div id="divMedidas">
			
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
				<button type="button" class="btn btn-info" data-toggle="modal" data-target="#modalConfeccion" onclick="IniciarValoresConfeccion()">Agregar</button>		
			</div>			
		</div>
		
		<div class="col-lg-6">
			<div id="divConfecciones">
			
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
						<td><!--  <button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button> --></td>
						<td><button type="button" class="btn btn-default btn-xs"> &nbsp; Eliminar &nbsp; </button></td>
					</tr>								
				</c:forEach>
			</tbody>
			</table>
			
			</div>
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
					<div id="divMedida" class="form-group">
						<label class="control-label" for="medida">Medida:</label>
						<form:input path="medida" maxlength="50" class="form-control input-sm" id="medida" />
						<div id="alertaMedida" class="text-danger"></div>
					</div>
						<table class="table table-hover">
							<thead>
								<tr>
									<th>Talla</th>
									<th>Corte</th>													
									<th>Prenda Final</th>
								</tr>								
							</thead>
							<tbody>						
								<tr>
									<td>S</td>
									<td>
										<div id="divCorteS"class="form-group">
										<form:input path="corteS" maxlength="50" class="form-control input-sm" id="corteS" />
										<div id="alertaCorteS" class="text-danger"></div>
										</div>
									</td>
									<td>
										<div id="divPrendaFinalS" class="form-group">
										<form:input path="prendaFinalS" maxlength="50" class="form-control input-sm" id="prendaFinalS" />
										<div id="alertaPrendaFinalS" class="text-danger"></div>
										</div>
									</td>
								</tr>
								<tr>
									<td>M</td>
									<td>
										<div id="divCorteM" class="form-group">
										<form:input path="corteM" maxlength="50" class="form-control input-sm" id="corteM" />
										<div id="alertaCorteM" class="text-danger"></div>
										</div>
									</td>
									<td>
										<div id="divPrendaFinalM" class="form-group">
										<form:input path="prendaFinalM" maxlength="50" class="form-control input-sm" id="prendaFinalM" />
										<div id="alertaPrendaFinalM" class="text-danger"></div>
										</div>
									</td>
								</tr>								
								<tr>
									<td>L</td>
									<td>
										<div id="divCorteL" class="form-group">
										<form:input path="corteL" maxlength="50" class="form-control input-sm" id="corteL" />
										<div id="alertaCorteL" class="text-danger"></div>
										</div>
									</td>
									<td>
										<div id="divPrendaFinalL" class="form-group">
										<form:input path="prendaFinalL" maxlength="50" class="form-control input-sm" id="prendaFinalL" />
										<div id="alertaPrendaFinalL" class="text-danger"></div>
										</div>
									</td>
								</tr>								
								<tr>
									<td>XL</td>
									<td>
										<div id="divCorteXL" class="form-group">
										<form:input path="corteXL" maxlength="50" class="form-control input-sm" id="corteXL" />
										<div id="alertaCorteXL" class="text-danger"></div>
										</div>
									</td>
									<td>
										<div id="divPrendaFinalXL" class="form-group">
										<form:input path="prendaFinalXL" maxlength="50" class="form-control input-sm" id="prendaFinalXL" />
										<div id="alertaPrendaFinalXL" class="text-danger"></div>
										</div>
									</td>
								</tr>	
							</tbody>
						</table>
			
				</div>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>	
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>	
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>	
				&nbsp; <br/>
				&nbsp; <br/>	
					
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	        <button type="button" class="btn btn-primary" onclick="agregarMedida()">Aceptar</button>
	      </div>
	    </div>
	  </div>
	</div>

	<script type="text/javascript">
		function IniciarValores(){
			$('#divMedida').attr("class", "form-group");
			$('#alertaMedida').text("");
			$('#divCorteS').attr("class", "form-group");
			$('#alertaCorteS').text("");
			$('#divPrendaFinalS').attr("class", "form-group");
			$('#alertaPrendaFinalS').text("");	
			$('#divCorteM').attr("class", "form-group");
			$('#alertaCorteM').text("");				
			$('#divPrendaFinalM').attr("class", "form-group");
			$('#alertaPrendaFinalM').text("");				
			$('#divCorteL').attr("class", "form-group");
			$('#alertaCorteL').text("");				
			$('#divPrendaFinalL').attr("class", "form-group");
			$('#alertaPrendaFinalL').text("");				
			$('#divCorteXL').attr("class", "form-group");
			$('#alertaCorteXL').text("");				
			$('#divPrendaFinalXL').attr("class", "form-group");
			$('#alertaPrendaFinalXL').text("");				
		}
	
		function agregarMedida(){
			
			var errores = 0;
			
			var pMedida = $("#medida").val().trim();
			
			var pCorteS = $("#corteS").val().trim();
			var pPrendaFinalS = $("#prendaFinalS").val().trim();
			var pCorteM = $("#corteM").val().trim();
			var pPrendaFinalM = $("#prendaFinalM").val().trim();
			var pCorteL = $("#corteL").val().trim();
			var pPrendaFinalL = $("#prendaFinalL").val().trim();
			var pCorteXL = $("#corteXL").val().trim();
			var pPrendaFinalXL = $("#prendaFinalXL").val().trim();			
			
			
			if(pMedida==""){
				$('#divMedida').attr("class", "form-group has-error");
				$('#alertaMedida').text("Debe ingresar un medida");
				errores++;				
			}else{
				$('#divMedida').attr("class", "form-group");
				$('#alertaMedida').text("");				
			}
			
			if(pCorteS==""){
				$('#divCorteS').attr("class", "form-group has-error");
				$('#alertaCorteS').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divCorteS').attr("class", "form-group");
				$('#alertaCorteS').text("");				
			}			

			if(pPrendaFinalS==""){
				$('#divPrendaFinalS').attr("class", "form-group has-error");
				$('#alertaPrendaFinalS').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divPrendaFinalS').attr("class", "form-group");
				$('#alertaPrendaFinalS').text("");				
			}			

			if(pCorteM==""){
				$('#divCorteM').attr("class", "form-group has-error");
				$('#alertaCorteM').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divCorteM').attr("class", "form-group");
				$('#alertaCorteM').text("");				
			}			

			if(pPrendaFinalM==""){
				$('#divPrendaFinalM').attr("class", "form-group has-error");
				$('#alertaPrendaFinalM').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divPrendaFinalM').attr("class", "form-group");
				$('#alertaPrendaFinalM').text("");				
			}			

			if(pCorteL==""){
				$('#divCorteL').attr("class", "form-group has-error");
				$('#alertaCorteL').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divCorteL').attr("class", "form-group");
				$('#alertaCorteL').text("");				
			}			

			if(pPrendaFinalL==""){
				$('#divPrendaFinalL').attr("class", "form-group has-error");
				$('#alertaPrendaFinalL').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divPrendaFinalL').attr("class", "form-group");
				$('#alertaPrendaFinalL').text("");				
			}				
			
			if(pCorteXL==""){
				$('#divCorteXL').attr("class", "form-group has-error");
				$('#alertaCorteXL').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divCorteXL').attr("class", "form-group");
				$('#alertaCorteXL').text("");				
			}			

			if(pPrendaFinalXL==""){
				$('#divPrendaFinalXL').attr("class", "form-group has-error");
				$('#alertaPrendaFinalXL').text("Debe ingresar un valor");
				errores++;				
			}else{
				$('#divPrendaFinalXL').attr("class", "form-group");
				$('#alertaPrendaFinalXL').text("");				
			}			
			
			if (errores > 0) 
			{
				return;
			}
			
			
			$("#medida").val('');
			$("#corteS").val('');
			$("#prendaFinalS").val('');
			$("#corteM").val('');
			$("#prendaFinalM").val('');
			$("#corteL").val('');
			$("#prendaFinalL").val('');
			$("#corteXL").val('');
			$("#prendaFinalXL").val('');
			
	        $.ajax({
	            url: '/siraywasi/molde/agregarmedida',
	            type: "POST",
	            data: { medida: pMedida, 
	            		corteS: pCorteS, prendaFinalS: pPrendaFinalS, 
	            		corteM: pCorteM, prendaFinalM: pPrendaFinalM,
	            		corteL: pCorteL, prendaFinalL: pPrendaFinalL,
	            		corteXL: pCorteXL, prendaFinalXL: pPrendaFinalXL},
	            success: function (data) {
	                $("#divMedidas").html(data);
	                $('#modalMedida').modal('hide');
	            }
	        });				
		}
		
		function eliminarMedida(pIdMoldeMedidaTalla){
	        $.ajax({
	            url: '/siraywasi/molde/eliminarmedida',
	            type: "POST",
	            data: { idMoldeMedidaTalla: pIdMoldeMedidaTalla },
	            success: function (data) {
	                $("#divMedidas").html(data);
	            }
	        });				
		}
	</script>


	<!-- Modal -->
	<div class="modal fade" id="modalConfeccion" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title" id="myModalLabel">Registrar Detalle Confeccion</h4>
	      </div>
	      <div class="modal-body">
				<div class="col-md-8">
					

						<table class="table table-hover">
							<thead>
								<tr>
									<th></th>											
								</tr>								
							</thead>
							<tbody>						
								<tr>
									<td>
										<div id="divNombreConfeccion" class="form-group">
											<label class="control-label" for="nombreConfeccion">Confeccion:</label>
											<form:input path="nombreConfeccion" maxlength="50" class="form-control input-sm" id="nombreConfeccion" />
											<div id="alertaNombreConfeccion" class="text-danger"></div>
										</div>
									</td>
								</tr>
								
								<tr>
									<td>
										<div id="divDetalleConfeccion" class="form-group">
											<label class="control-label" for="detalleConfeccion">Detalle Confeccion:</label>
											<form:textarea path="detalleConfeccion" class="form-control input-sm" id="detalleConfeccion" rows="5"/>
											<div id="alertaDetalleConfeccion" class="text-danger"></div>
										</div>
									</td>								
								</tr>	
							</tbody>
						</table>

					</div>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>	
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>
				&nbsp; <br/>	
				&nbsp; <br/>
				&nbsp; <br/>
							
				</div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	        <button type="button" class="btn btn-primary" onclick="agregarConfeccion()">Aceptar</button>
	      </div>
	    </div>
	  </div>


	<script type="text/javascript">
		function IniciarValoresConfeccion(){
			
			$('#divNombreConfeccion').attr("class", "form-group");
			$('#alertaNombreConfeccion').text("");	
			$('#divDetalleConfeccion').attr("class", "form-group");
			$('#alertaDetalleConfeccion').text("");				
		}
	
		function agregarConfeccion(){
			var pNombreConfeccion = $("#nombreConfeccion").val().trim();
			var pDetalleConfeccion = $("#detalleConfeccion").val().trim();
			var errores = 0;
			
			if (pNombreConfeccion=="")
			{
				$('#divNombreConfeccion').attr("class", "form-group has-error");
				$('#alertaNombreConfeccion').text("Debe ingresar el nombre de la confeccion");
				errores++;
			}else{
				$('#divNombreConfeccion').attr("class", "form-group");
				$('#alertaNombreConfeccion').text("");				
			}

			if (pDetalleConfeccion=="")
			{
				$('#divDetalleConfeccion').attr("class", "form-group has-error");
				$('#alertaDetalleConfeccion').text("Debe ingresar el detalle de la confeccion");
				errores++;
			}else{
				$('#divDetalleConfeccion').attr("class", "form-group");
				$('#alertaDetalleConfeccion').text("");				
			}			
			
			if (errores > 0) 
			{
				return;
			}			
			
	        $.ajax({
	            url: '/siraywasi/molde/agregarconfeccion',
	            type: "POST",
	            data: { nombreConfeccion: pNombreConfeccion, detalleConfeccion: pDetalleConfeccion},
	            success: function (data) {
	                $("#divConfecciones").html(data);
	                $('#modalConfeccion').modal('hide');
	            }
	        });				
		}
		
		function eliminarConfeccion(pIdMoldeConfeccion){
	        $.ajax({
	            url: '/siraywasi/molde/eliminarconfeccion',
	            type: "POST",
	            data: { idMoldeConfeccion: pIdMoldeConfeccion },
	            success: function (data) {
	                $("#divConfecciones").html(data);
	            }
	        });				
		}
	</script>

	<div id="div06">
		<div class="col-lg-12">
				<div class="form-group">
					<div class="col-lg-3"></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info" onclick="Cancelar()">Cancelar</button></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info" onclick="Enviar();">Guardar</button></div>
					<div class="col-lg-3"></div>
				</div>			
		</div>
	</div>

	<script type="text/javascript">
		function Enviar(){
			$("#moldeForm").submit();
		}
		
		function Cancelar(){
			location.href='/siraywasi/molde/listadomoldeespecificacionprenda';
		}
	</script>

	</form:form>
</body>
</html>


