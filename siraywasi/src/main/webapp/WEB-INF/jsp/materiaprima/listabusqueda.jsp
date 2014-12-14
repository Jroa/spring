<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<table class="table table-hover">
	<thead>
		<tr>
			<th>Id</th>
			<th>Nombre</th>													
			<th>Cantidad</th>
			<th>Unidad</th>
			<th>Ult Costo</th>
			<th>Proveedor</th>
			<th>Eliminar</th>
		</tr>								
	</thead>
	<tbody>
		<c:forEach var="item" items="${listadoMateriaPrima}">
			<tr>
				<td>${item.idMateriaPrima}</td>
				<td>${item.nombreMateriaPrima}</td>
				<td>${item.cantidad}</td>
				<td>${item.nombreUnidadMedida}</td>
				<td>${item.ultimoCosto}</td>
				<td>${item.nombreProveedor}</td>
				<td><button type="button" class="btn btn-default btn-xs" onclick="eliminarMateriaPrima('${item.idMateriaPrima}')"> &nbsp; Eliminar &nbsp; </button></td>
			</tr>								
		</c:forEach>
	</tbody>
</table>	