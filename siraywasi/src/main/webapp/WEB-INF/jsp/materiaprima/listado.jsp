<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
	<title>Lista de Materia Prima</title>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet"/>
	<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet" />	
	
	<script src="<c:url value="/resources/js/jquery-1.11.1.js" />"></script>
	<script src="<c:url value="/resources/js/ui/1.11.2/jquery-ui.js" />"></script>
	<link rel="stylesheet" href="<c:url value="/resources/js/ui/1.11.2/jquery-ui.css" />" />
	<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>
	
</head>
<body>
			<div class="col-lg-12">

				<h3>Lista de Materia Prima</h3>
				<br />

				<button type="button" class="btn btn-info" onclick="location.href='/siraywasi/materiaprima/inventario'">Agregar</button>
				
			</div>
			<div id="DivListadoBusqueda">
		
			</div>

			<script type="text/javascript">
				$(document).ready(function() {
			        $.ajax({
			            url: '/siraywasi/materiaprima/listabusqueda',
			            type: "POST",
			            //data: { idMateriaPrima: pIdMateriaPrima },
			            success: function (data) {
			                $("#DivListadoBusqueda").html(data);
			            }
			        });
				});			
			
			
				function eliminarMateriaPrima(pIdMateriaPrima){
	
			        $.ajax({
			            url: '/siraywasi/materiaprima/eliminar',
			            type: "POST",
			            data: { idMateriaPrima: pIdMateriaPrima },
			            success: function (data) {
			                $("#DivListadoBusqueda").html(data);
			            }
			        });
				}
			</script>			
</body>
</html>