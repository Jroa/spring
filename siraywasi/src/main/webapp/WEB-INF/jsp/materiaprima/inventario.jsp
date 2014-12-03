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

		<div class="col-md-6">
			<div class="col-md-6">
				<div class="form-group">
					<label class="col-lg-3 control-label" for="nombreMateriaPrima">Nombre:</label>
					<div class="col-lg-9">
						<form:input path="nombreMateriaPrima" maxlength="50"
							class="form-control input-sm" id="nombreMateriaPrima" />
						<form:errors path="nombreMateriaPrima" />
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
				
				<div class="form-group">
					<label class="col-lg-3 control-label" for="cantidad">Cantidad:</label>
					<div class="col-lg-9">
						<form:input path="cantidad" maxlength="50" class="form-control input-sm" id="cantidad" />
						<form:errors path="cantidad" />
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
				<div class="form-group">
					<label class="col-lg-6 control-label" for="costo">Costo:</label>
					<div class="col-lg-6">
						<form:input path="costo" maxlength="50" class="form-control input-sm" id="costo" />
						<form:errors path="costo" />
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
					<div class="col-lg-3"><button type="button" class="btn btn-info">Cancelar</button></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info" onclick="Enviar();">Guardar</button></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info">Ver Historial</button></div>
				</div>
					
			</div>							
	</div>
	</form:form>
	
	<script type="text/javascript">
		function Enviar(){
			$("#materiaPrimaForm").submit();
		}
	</script> 	
</body>
</html>