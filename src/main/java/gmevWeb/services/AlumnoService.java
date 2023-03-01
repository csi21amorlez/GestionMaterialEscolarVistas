package gmevWeb.services;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmewApp.dao.Alumno;



// TODO: Auto-generated Javadoc
/**
 * The Interface AlumnoService.
 */
public interface AlumnoService {
	
	/**
	 * Find all.
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
	 * Find alumno by portatil.
	 *
	 * @param codPortatil the cod portatil
	 * @return the alumno DTO
	 */
	public AlumnoDTO findAlumnoByPortatil(String codPortatil);

}
