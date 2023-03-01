<%@ include file="../config/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buscar portátil por código de alumno</title>

</head>
<body>

	<div class="container">
		<h1>Buscar portátil por código de alumno</h1>

		<form method="GET" action="findPortatilByAlumno">
			<div class="form-group">
				<label for="codAlumno">Código de alumno:</label> <input type="text"
					class="form-control" name="codAlumno" id="codAlumno" />
			</div>
			<button type="submit" class="btn btn-primary">Buscar</button>
		</form>

		<hr />

		<c:if test="${not empty portatil}">
			<div class="alert alert-success">				
				<ul>
					<li><strong>Código:</strong> ${portatil.codigo}</li>
					<li><strong>Marca:</strong> ${portatil.marca}</li>
					<li><strong>Modelo:</strong> ${portatil.modelo}</li>					
				</ul>
			</div>
		</c:if>

		<c:if test="${not empty mensaje}">
			<div class="alert alert-danger">
				<p>${mensaje}</p>
			</div>
		</c:if>
	</div>

</body>
</html>
