/**
 * 
 */
 function confirmarEliminacion() {
  if (confirm("¿Está seguro de que desea eliminar este registro?")) {
    document.getElementById("eliminarAlumno").submit();
  }
}