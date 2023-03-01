<%@ include file="../config/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<c:url value="findAlumnoByPortatil"/>">Navegar a buscar
		alumno por portatil</a>

	<div class="container shadow">
		<table>
			<tr>
				<th>Nombre completo</th>
				<th>Código de alumno</th>
				<th>Número de teléfono</th>
				<th>Portátil asignado</th>
				<th>Acciones</th>
			</tr>
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
							<button type="submit">Eliminar</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>