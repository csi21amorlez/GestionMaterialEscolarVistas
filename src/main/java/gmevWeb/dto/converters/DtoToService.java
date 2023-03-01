package gmevWeb.dto.converters;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

// TODO: Auto-generated Javadoc
/**
 * The Interface DtoToService.
 */
public interface DtoToService {

	/**
	 * Alumno dto to dao.
	 *
	 * @param dto the dto
	 * @return the alumno
	 */
	public Alumno AlumnoDtoToDao(AlumnoDTO dto);

	/**
	 * List alumno dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Alumno> ListAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto);

	/**
	 * Portatil dto to dao.
	 *
	 * @param dto the dto
	 * @return the portatil
	 */
	public Portatil PortatilDtoToDao(PortatilDTO dto);

	/**
	 * List portatil dto to dao.
	 *
	 * @param listDto the list dto
	 * @return the array list
	 */
	public ArrayList<Portatil> ListPortatilDtoToDao(ArrayList<PortatilDTO> listDto);
}
