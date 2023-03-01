package gmevWeb.services;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmewApp.dao.Alumno;



// TODO: Auto-generated Javadoc
/**
 * Interfaz que define que funcionalidad dispondra la entidad Alumno.
 */
public interface AlumnoService {
	
	/**
	 * Buscar todos los alumnos.
	 *
	 * @return the array list
	 */
	public ArrayList<AlumnoDTO> findAll();
	
	/**
	 * Insertar alumno.
	 *
	 * @param alumno the alumno
	 */
	public void insertarAlumno(Alumno alumno);
	
	/**
	 * Delete alumno.
	 *
	 * @param alumno the alumno
	 */
	public void deleteAlumno(Alumno alumno);
	
	/**
	 * Buscar alumno por el codigo del poratil que tiene asignado.
	 *
	 * @param codPortatil the cod portatil
	 * @return the alumno DTO
	 */
	public AlumnoDTO findAlumnoByPortatil(String codPortatil);

}
