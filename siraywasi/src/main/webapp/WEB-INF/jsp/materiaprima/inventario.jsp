<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Invenario Materia Prima</title>
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet" />
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />"
	rel="stylesheet" />


<script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script>
<script src="<c:url value="/resources/js/ui/1.11.2/jquery-ui.js" />"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/js/ui/1.11.2/jquery-ui.css" />" />

</head>
<body>

	<form:form commandName="materiaPrimaForm"
		class="form-horizontal">
		<legend>Materia Prima</legend>

		<form:hidden path="resultadoGrabar" />

		<spring:hasBindErrors name="materiaPrimaForm">
		  <c:if test="${errors.hasFieldErrors('nombreMateriaPrima')}">
		    <c:set var="errorClass01" value="has-error" />
		  </c:if>
		  <c:if test="${errors.hasFieldErrors('cantidad')}">
		    <c:set var="errorClass02" value="has-error" />
		  </c:if>
		  <c:if test="${errors.hasFieldErrors('costo')}">
		    <c:set var="errorClass03" value="has-error" />
		  </c:if>		  
		  				  
		</spring:hasBindErrors>

		<div class="col-md-6">
			<div class="col-md-6">
				<div id="divNombreMateriaPrima" class="form-group <c:out value='${errorClass01}' />">
					<label class="col-lg-3 control-label" for="nombreMateriaPrima">Nombre:</label>
					<div class="col-lg-9">
						<form:input path="nombreMateriaPrima" maxlength="50"
							class="form-control input-sm" id="nombreMateriaPrima" />
							<form:errors path="nombreMateriaPrima" class="text-danger"/>
							<div id="alertaNombreMateriaPrima" class="text-danger"></div>
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-lg-3 control-label" for="idMarca">Marca:</label>
					<div class="col-lg-9">
						<form:select path="marca.idMarca" id="idMarca" class="form-control">
							<form:options items="${listaMarcas}" itemLabel="nombreMarca" itemValue="idMarca" />
						</form:select>
					</div>
				</div>
				
				<div id="divCantidad" class="form-group <c:out value='${errorClass02}' />">
					<label class="col-lg-3 control-label" for="cantidad">Cantidad:</label>
					<div class="col-lg-9">
						<form:input path="cantidad" maxlength="50" class="form-control input-sm" id="cantidad" />
						<form:errors path="cantidad" class="text-danger" />
						<div id="alertaCantidad" class="text-danger"></div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-lg-3 control-label" for="idProveedor">Proveedor:</label>
					<div class="col-lg-6">
						<form:select path="proveedor.idProveedor" id="idProveedor" class="form-control">
							<form:options items="${listaProveedores}" itemLabel="nombreProveedor" itemValue="idProveedor" />
						</form:select>
					</div>
					<div class="col-lg-3">
						<button type="button" class="btn btn-info">Ver</button>
					</div>
				</div>
				
				
			</div>
		
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-lg-6 control-label" for="idTipoMateriaPrima">Tipo Materia P.:</label>
					<div class="col-lg-6">
						<form:select path="tipoMateriaPrima.idTipoMateriaPrima" id="idTipoMateriaPrima" class="form-control">
							<form:options items="${listaTipoMateriaPrimas}" itemLabel="nombreTipoMateriaPrima" itemValue="idTipoMateriaPrima" />
						</form:select>
					</div>
				</div>			
				<div class="form-group">
					<label class="col-lg-6 control-label" for="idTipoCompra">Tipo de Compra:</label>
					<div class="col-lg-6">
						<form:select path="tipoCompra.idTipoCompra" id="idTipoCompra" class="form-control">
							<form:options items="${listaTipoCompras}" itemLabel="nombreTipoCompra" itemValue="idTipoCompra" />
						</form:select>
					</div>
				</div>	
				<div class="form-group">
					<label class="col-lg-6 control-label" for="idUnidadMedida">Unidad:</label>
					<div class="col-lg-6">
						<form:select path="unidadMedida.idUnidadMedida" id="idUnidadMedida" class="form-control">
							<form:options items="${listaUnidadMedidas}" itemLabel="nombreUnidadMedida" itemValue="idUnidadMedida" />
						</form:select>
					</div>
				</div>
				<div id="divCosto" class="form-group <c:out value='${errorClass03}' />">
					<label class="col-lg-6 control-label" for="costo">Costo:</label>
					<div class="col-lg-6">
						<form:input path="costo" maxlength="50" class="form-control input-sm" id="costo" />
						<form:errors path="costo" class="text-danger"/>
						<div id="alertaCosto" class="text-danger"></div>
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-lg-1 control-label" for="detalle">Detalle:</label>
				</div>	
				
				<div class="form-group">
					<div class="col-lg-12">
						<form:textarea path="detalle" class="form-control input-sm" id="detalle" rows="7"/>
						<form:errors path="detalle" />
					</div>
				</div>					
				
				<br/>
				<div class="form-group">
					<div class="col-lg-3"></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info" onclick="Cancelar()">Cancelar</button></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info" onclick="Enviar();">Guardar</button></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info">Ver Historial</button></div>
				</div>
					
			</div>							
	</div>
	</form:form>
	
	<script type="text/javascript">
		$(document).ready(function() {
			if($("#resultadoGrabar").val()=="OK"){
				alert("Los datos se guardaron exitosamente");
				location.href='/siraywasi/materiaprima/listado';
			}
		});	
	
		function Enviar(){
			var errores = 0;
			
			//Validar el nombre
			if ($('#nombreMateriaPrima').val().trim()=="")
			{
				$('#divNombreMateriaPrima').attr("class", "form-group has-error");
				$('#alertaNombreMateriaPrima').text("Debe ingresar un nombre");
				errores++;
			}else{
				$('#divNombreMateriaPrima').attr("class", "form-group");
				$('#alertaNombreMateriaPrima').text("");				
			}
			
			//Validar la cantidad
			if ($('#cantidad').val().trim() =="" || isNaN($('#cantidad').val().trim()) || $('#cantidad').val() <= 0)
			{
				$('#divCantidad').attr("class", "form-group has-error");
				$('#alertaCantidad').text('Debe Ingresar un cantidad valida');
				errores++;
			}else{
				$('#divCantidad').attr("class", "form-group");
				$('#alertaCantidad').text('');
			}

			//Validar el costo
			if ($('#costo').val().trim() =="" || isNaN($('#costo').val().trim()) || $('#costo').val() <= 0)
			{
				$('#divCosto').attr("class", "form-group has-error");
				$('#alertaCosto').text('Debe Ingresar un costo valido');
				errores++;
			}else{
				$('#divCosto').attr("class", "form-group");
				$('#alertaCosto').text('');
			}
			
			if (errores > 0) 
			{
				return;
			}
			
			$("#materiaPrimaForm").submit();
		}
		
		function Cancelar(){
			location.href='/siraywasi/materiaprima/listado';
		}
	</script> 	
</body>
</html>