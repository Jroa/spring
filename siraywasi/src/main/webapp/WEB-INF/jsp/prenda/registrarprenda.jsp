<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Catalogo de Prenda</title>
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

	<form:form commandName="prendaForm"
		class="form-horizontal">
		<legend>Catalogo de Prenda</legend>

		<div class="col-md-8">
			<div class="col-md-8">
				<div class="form-group">
					<label class="col-lg-3 control-label" for="nombrePrenda">Nombre Prenda:</label>
					<div class="col-lg-9">
						<form:input path="nombrePrenda" maxlength="50"
							class="form-control input-sm" id="nombrePrenda" />
						<form:errors path="nombrePrenda" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-lg-3 control-label" for="idTipoPrenda">Tipo Prenda:</label>
					<div class="col-lg-7">
						<form:select path="tipoPrenda.idTipoPrenda" id="idTipoPrenda" class="form-control">
							<form:options items="${listaTipoPrendas}" itemLabel="nombreTipoPrenda" itemValue="idTipoPrenda" />
						</form:select>
					</div>
					<div class="col-lg-2"><button type="button" class="btn btn-info">Ver</button></div>
				</div>
				
				<div class="form-group">
					<label class="col-lg-3 control-label" for="idTipoTela">Tipo Tela:</label>
					<div class="col-lg-7">
						<form:select path="tipoTela.idTipoTela" id="idTipoTela" class="form-control">
							<form:options items="${listaTipoTelas}" itemLabel="nombreTipoTela" itemValue="idTipoTela" />
						</form:select>
					</div>
					<div class="col-lg-2"><button type="button" class="btn btn-info">Ver</button></div>
				</div>
				
				<div class="form-group">
					<label class="col-lg-3 control-label" for="idTipoTela">Tipo Tejido:</label>
					<div class="col-lg-7">
						<form:select path="tipoTejido.idTipoTejido" id="idTipoTejido" class="form-control">
							<form:options items="${listaTipoTejidos}" itemLabel="nombreTipoTejido" itemValue="idTipoTejido" />
						</form:select>
					</div>
					<div class="col-lg-2"><button type="button" class="btn btn-info">Ver</button></div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="form-group">
					<div class="col-lg-10">
						<button type="button" class="btn btn-info">Agregar Imagen</button>
						<img src="<c:url value="/resources/images/blanco.png" />" 	alt="..." class="img-thumbnail">
					</div>
				</div>
			</div>
			<div class="col-md-12">
				<div class="form-group">
					<label class="col-lg-1 control-label" for="detalle">Detalle:</label>
				</div>	
				
				<div class="form-group">
					<div class="col-lg-10">
						<form:textarea path="detalle" class="form-control input-sm" id="detalle" rows="7"/>
						<form:errors path="detalle" />
					</div>
				</div>					
				
				<br/>
				<div class="form-group">
					<div class="col-lg-3"></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info">Cancelar</button></div>
					<div class="col-lg-3"><button type="button" class="btn btn-info">Guardar</button></div>
				</div>			
		</div>
	</div>

	</form:form>
</body>
</html>