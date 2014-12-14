<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
										<td><!--  <button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button>--></td>
										<td><button type="button" class="btn btn-default btn-xs" onclick="eliminarMedida(${item.idMoldeMedidaTalla})"> &nbsp; Eliminar &nbsp; </button></td>
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
										<td><!-- <button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button> --></td>
										<td><button type="button" class="btn btn-default btn-xs" onclick="eliminarMedida(${item.idMoldeMedidaTalla})"> &nbsp; Eliminar &nbsp; </button></td>
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
										<td><!--  <button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button>--></td>
										<td><button type="button" class="btn btn-default btn-xs" onclick="eliminarMedida(${item.idMoldeMedidaTalla})"> &nbsp; Eliminar &nbsp; </button></td>
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
										<td><!--  <button type="button" class="btn btn-default btn-xs" data-toggle="modal" data-target="#modalMedida"> &nbsp; Modificar &nbsp; </button> --></td>
										<td><button type="button" class="btn btn-default btn-xs" onclick="eliminarMedida(${item.idMoldeMedidaTalla})"> &nbsp; Eliminar &nbsp; </button></td>
									</tr>								
								</c:forEach>
							</tbody>
						</table> 
			        </div>
			    </div>
			</div>