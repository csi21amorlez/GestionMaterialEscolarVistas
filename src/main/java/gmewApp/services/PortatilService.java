package gmewApp.services;

import java.util.ArrayList;

import gmewApp.dto.PortatilDTO;
import gmewApp.dao.Portatil;

// TODO: Auto-generated Javadoc
/**
 * The Interface PortatilService.
 */
public interface PortatilService {

	/**
	 * Buscar todos.
	 *
	 * @return the array list
	 */
	public ArrayList<PortatilDTO> buscarTodos();

	/**
	 * Insertar portatil.
	 *
	 * @param portatil the portatil
	 */
	public void insertarPortatil(Portatil portatil);

	/**
	 * Delete portatil.
	 *
	 * @param portatil the portatil
	 */
	public void deletePortatil(Portatil portatil);

	/**
	 * Find portatil by alumno.
	 *
	 * @param codAlumno the cod alumno
	 * @return the portatil DTO
	 */
	public PortatilDTO findPortatilByAlumno(String codAlumno);
	
	public PortatilDTO findById(Long id);

}
