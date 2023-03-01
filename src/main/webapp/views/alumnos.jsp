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
		<c:forEach items="${listAlumno}" var="a">
			<c:out value="${a.nombreCompleto}" />
			<c:out value="${a.codigoAlumno}" />
			<c:out value="${a.numeroTelefono}" />
			<c:if test="${a.portatil != null}">
                            ${a.portatil.marca} ${a.portatil.modelo} (${a.portatil.codigo})
                        </c:if>
			<form method="post" action="eliminarAlumno">
				<input type="hidden" name="id" value="${a}" />
				<button type="submit">Eliminar</button>
			</form>

		</c:forEach>
	</div>

</body>
</html>