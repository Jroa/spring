<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<title>Registrar Especificacion</title>
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

<script>
	$(function() {
		$("#fechaProbable").datepicker({
			dateFormat : 'dd/mm/yy'
		});
	});
</script>
</head>
<body>

	<form:form commandName="especificacionPrendaForm"
		class="form-horizontal">
		<legend>REGISTRAR ESPECIFICACION PRENDA</legend>


		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">Prenda</div>
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
						<label class="col-lg-8 control-label" for="fechaProbable">Fecha
							Probable de Entrega:</label>
						<div class="col-lg-4">
							<form:input path="fechaProbable" maxlength="50"
								class="form-control input-sm" id="fechaProbable" />
							<form:errors path="fechaProbable" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-4 control-label" for="idTipoTela">Tipo	de Tela:</label> 
						<label class="col-lg-4 control-label" for="idPrenda">Prenda:</label> 
						<label class="col-lg-4 control-label" for="idTipoPrenda">Tipo Prenda:</label>
					</div>
					<div class="form-group">
						<div class="col-lg-4">
							<form:select path="tipoTela.idTipoTela" id="idTipoTela"
								class="form-control">
								<form:options items="${listaTipoTelas}" itemLabel="nombreTela"
									itemValue="idTipoTela" />
							</form:select>
						</div>
						<div class="col-lg-4">
							<form:select path="prenda.idPrenda" id="idPrenda"
								class="form-control">
								<form:options items="${listaPrendas}" itemLabel="nombrePrenda"
									itemValue="idPrenda" />
							</form:select>
						</div>
						<div class="col-lg-4">
							<form:select path="tipoPrenda.idTipoPrenda" id="idTipoPrenda"
								class="form-control">
								<form:options items="${listaTipoPrendas}"
									itemLabel="nombreTipoPrenda" itemValue="idTipoPrenda" />
							</form:select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-4">
							

							<div class="checkbox">
								<label> &nbsp;&nbsp;<form:checkbox
										path="indicadorEstampado" id="indicadorEstampado" />
									Estampado
								</label>
							</div>

							<div class="checkbox">
								<label> &nbsp;&nbsp;<form:checkbox
										path="indicadorBordado" id="indicadorBordado" /> Bordado
								</label>
							</div>
							<br />
							<br />
							<button type="button" class="btn btn-info">Agregar Imagen </button>
							<br /><br />
							<button type="button" class="btn btn-info">Guardar Imagen </button>
						</div>
						<div class="col-lg-8">
							<img src="<c:url value="/resources/images/blanco.png" />"
								alt="..." class="img-thumbnail">
							<button type="button" class="btn btn-info">Adjuntar
								Documento</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">Pedido</div>
				<div class="panel-body">
				
					<div class="form-group">
						<div class="col-lg-4">
							<label class="control-label" for="tipoTalla">Tallas:</label>	
						</div>
						<div class="col-lg-8">
							<div class="radio-inline">
							  <label>
							    <form:radiobutton path="tipoTalla" value="S" />Estandar
							  </label>
							</div>
							<div class="radio-inline">
							  <label>
							    <form:radiobutton path="tipoTalla" value="N" /> Niños
							  </label>
							</div>
						</div>
					</div>
					
					
					<div class="form-group">
						<div class="col-lg-4"></div>
						<div class="col-lg-8">
							<form:checkboxes items="${listaTallas}" path="tallas" />
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-lg-1"></div>
					<div class="col-lg-10">
						<div class="panel panel-info">
							<div class="panel-heading">Talla S</div>
							
							<div class="panel-body">
							</div>
						</div>
					</div>
					<div class="col-lg-1"></div>
				</div>


				<div class="form-group">
					<div class="col-lg-1"></div>
					<div class="col-lg-10">
						<div class="panel panel-info">
							<div class="panel-heading">Talla M</div>
							
							<div class="panel-body">
							</div>
						</div>
					</div>
					<div class="col-lg-1"></div>
				</div>
				
							
				<div class="form-group">
					<div class="col-lg-4"></div>
					<div class="col-lg-4">
						<button type="button" class="btn btn-info">Calcular Costo Aproximado </button>
					</div>
					<div class="col-lg-4"></div>
				</div>									
			</div>		
		</div>
		
		
		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">Resumen Pedido</div>
				<div class="panel-body">
				
				<h3>CASACA POLAR TS</h3>
			
				<div class="form-group">
					<div class="col-lg-8">
						<label> Fecha Probable de Entrega:	</label>
					</div>
					<div class="col-lg-4">
						<label> 15/10/2014 </label>
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-4">
						<label> Prenda:	</label>
					</div>
					<div class="col-lg-8">
						<label> Casaca / Polar / Cuello Alto </label>
					</div>
				</div>
			
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Talla</th>
						<th>Tipo</th>													
						<th>Color</th>
						<th>Cantidad</th>
					</tr>								
				</thead>
				<tbody>
					<c:forEach var="item" items="${resumen}">
						<tr>
							<td>${item.talla}</td>
							<td>${item.tipo}</td>
							<td>${item.color}</td>
							<td>${item.cantidad}</td>
						</tr>								
					</c:forEach>
				</tbody>
			</table>				


				<div class="form-group">
					<div class="col-lg-8">
						<label> Total de Prendas:	</label>
					</div>
					<div class="col-lg-4">
						<label> 2000 </label>
					</div>
				</div>


				<div class="form-group">
					<div class="col-lg-8">
						<label> Costo Aproximado:	</label>
					</div>
					<div class="col-lg-4">
						<label> S/. 6737.09 </label>
					</div>
				</div>
				
							<br />
					<div class="form-group">
						<div class="col-lg-4"></div>
						<div class="col-lg-4">
							<button type="button" class="btn btn-info">Solicitar Pedido </button>
						</div>
						<div class="col-lg-4"></div>
					</div>							
											
				
				</div>
			</div>			
		</div>

	</form:form>
</body>
</html>