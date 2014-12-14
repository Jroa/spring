<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
						<td><button type="button" class="btn btn-default btn-xs" onclick="eliminarConfeccion(${item.idMoldeConfeccion})"> &nbsp; Eliminar &nbsp; </button></td>
					</tr>								
				</c:forEach>
			</tbody>
			</table>