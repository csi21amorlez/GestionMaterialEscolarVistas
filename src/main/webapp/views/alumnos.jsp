<%@ include file="../config/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de alumnos</title>

</head>
<body>
	<div class="container shadow">
		<h1>Listado de alumnos</h1>
		<div class="my-3">
			<a href="<c:url value='findAlumnoByPortatil'/>"
				class="btn btn-primary mr-2">Buscar alumno por portátil</a> <a
				href="<c:url value='navFormAlumno'/>" class="btn btn-primary">Añadir
				nuevo alumno</a>
		</div>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Nombre completo</th>
					<th>Código de alumno</th>
					<th>Número de teléfono</th>
					<th>Portátil asignado</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listAlumno}" var="a">
					<tr>
						<td>${a.nombreCompleto}</td>
						<td>${a.codigoAlumno}</td>
						<td>${a.numeroTelefono}</td>
						<td><c:if test="${a.portatil != null}">
                                ${a.portatil.marca} ${a.portatil.modelo} (${a.portatil.codigo})
                            </c:if></td>
						<td>
							<form method="post" action="eliminarAlumno">
								<input type="hidden" name="id" value="${a.id}" />
								<button type="submit" class="btn btn-danger">Eliminar</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<