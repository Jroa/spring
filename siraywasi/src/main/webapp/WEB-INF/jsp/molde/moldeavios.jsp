<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

			<div class="form-group">
				<div class="col-md-3">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Avio Disponible</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${listaAvioDisponible}">
								<tr>
									<td>${item.nombreAvio}</td>
									<td><button type="button" class="btn btn-info btn-xs" onclick="agregarAvio(${item.idAvio})">Asignar</button></td>
								</tr>							
							</c:forEach>
						</tbody>
					</table>
				</div>
				
				<div class="col-md-1">
					<!-- 
					<br/>
					<button type="button" class="btn btn-info">Asignar</button><br/><br/>
					<button type="button" class="btn btn-info">Desasignar</button>
					 -->
				</div>
				
				<div class="col-md-3">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Avio Asignado</th>
								<th></th>
							</tr>								
						</thead>
						<tbody>
							<c:forEach var="item" items="${listaAvioAsignado}">
								<tr>
									<td>${item.nombreAvio}</td>
									<td><button type="button" class="btn btn-info btn-xs" onclick="eliminarAvio(${item.idAvio})">Desasignar</button></td>
								</tr>								
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>