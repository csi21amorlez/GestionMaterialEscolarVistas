<%@ include file="../config/header.jsp" %>
<html>
<head>
    <title>Buscar alumno por portátil</title>
</head>
<body>
    <h1>Buscar alumno por portátil</h1>

    <form method="GET" action="findAlumnoByPortatil">
        <label>Código del portátil:</label>
        <input type="text" name="codPortatil" />
        <button type="submit">Buscar</button>
    </form>

    <hr />

    <c:if test="${not empty alumno}">
        <p>El alumno asignado al portátil es: ${alumno.nombreCompleto} (Código: ${alumno.codAlumno})</p>
    </c:if>

    <c:if test="${not empty mensaje}">
        <p>${mensaje}</p>
    </c:if>
</body>
</html>