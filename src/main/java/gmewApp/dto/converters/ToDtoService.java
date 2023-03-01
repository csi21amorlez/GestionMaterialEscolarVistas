package gmewApp.dto.converters;

import java.util.ArrayList;


import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dto.AlumnoDTO;
import gmewApp.dto.PortatilDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface ToDtoService.
 */
public interface ToDtoService {
	
/**
 * Alumno to dto.
 *
 * @param alumno the alumno
 * @return the alumno DTO
 */
public AlumnoDTO AlumnoToDto(Alumno alumno); 
	
	/**
	 * List alumno to dto.
	 *
	 * @param listAlumno the list alumno
	 * @return the array list
	 */
	public ArrayList<AlumnoDTO> ListAlumnoToDto(ArrayList<Alumno> listAlumno);
	
	/**
	 * Portatil to dto.
	 *
	 * @param portatil the portatil
	 * @return the portatil DTO
	 */
	public PortatilDTO PortatilToDto(Portatil portatil);
	
	/**
	 * List portatil to dto.
	 *
	 * @param listPortatil the list portatil
	 * @return the array list
	 */
	public ArrayList<PortatilDTO> ListPortatilToDto(ArrayList<Portatil> listPortatil);

}
