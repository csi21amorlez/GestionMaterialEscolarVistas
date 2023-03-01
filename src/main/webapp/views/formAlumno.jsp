<%@ include file="../config/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>Formulario de Alumno</h1>
		<form method="post" action="guardarAlumno">

			<div class="form-group">
				<label for="nombreCompleto">Nombre Completo</label> <input
					type="text" class="form-control" id="nombreCompleto"
					path="nombreCompleto"
					name="nombreCompleto" placeholder="Nombre completo" required>
			</div>

			<div class="form-group">
				<label for="numeroTelefono">Número de teléfono</label> <input
					path="numeroTelefono" type="text" class="form-control"
					id="numeroTelefono" name="numeroTelefono"
					placeholder="Número de teléfono" required>
			</div>

			<div class="form-group">
				<label for="codigoAlumno">Código de Alumno</label> <input
				path="codAlumno"
					type="text" class="form-control" id="codigoAlumno"
					name="codigoAlumno" placeholder="Código Alumno" required>
			</div>

			<div class="form-group">
				<label for="portatilId">Portátil asignado</label> <select
					class="form-control" id="portatilId" name="alumno.portatilId" path="alumno.portatilId">
					<c:forEach items="${model.listPortatil}" var="portatil">
						<option value="${portatil.id}">${portatil.marca}
							${portatil.modelo} (${portatil.codigo})</option>
					</c:forEach>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Guardar</button>
		</form>
	</div>

</body>
</html>
