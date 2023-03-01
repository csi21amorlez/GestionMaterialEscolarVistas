package gmevWeb.services;

import java.util.ArrayList;

import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Portatil;

// TODO: Auto-generated Javadoc
/**
 * Interfaz que define que funcionalidad tendra la entidad Portatil.
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
	 * Buscar portatil por el codigo del alumno al cual esta asignado.
	 *
	 * @param codAlumno the cod alumno
	 * @return the portatil DTO
	 */
	public PortatilDTO findPortatilByAlumno(String codAlumno);
	/**
	 * Buscar portatil por su id.
	 *
	 * @param long id
	 * @return the portatil DTO
	 */
	public PortatilDTO findById(Long id);

}
