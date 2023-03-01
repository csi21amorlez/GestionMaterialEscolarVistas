<%@ include file="../config/header.jsp" %>
<%@ include file="../config/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insertar Portátil</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container my-4">
		<h1>Insertar Portátil</h1>
		<hr>

		<form action="guardarPortatil" method="post">

			<div class="form-group">
				<label for="marca">Marca:</label>
				<input type="text" name="marca" id="marca" class="form-control" required>
			</div>

			<div class="form-group">
				<label for="modelo">Modelo:</label>
				<input type="text" name="modelo" id="modelo" class="form-control" required>
			</div>

			<div class="form-group">
				<label for="codigo">Código:</label>
				<input type="text" name="codigo" id="codigo" class="form-control" required>
			</div>

			<button type="submit" class="btn btn-primary">Guardar</button>

		</form>

	</div>

</body>
</html>
