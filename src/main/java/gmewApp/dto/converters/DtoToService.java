package gmewApp.dto.converters;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

public interface DtoToService {

	public Alumno AlumnoDtoToDao(AlumnoDTO dto);

	public ArrayList<Alumno> ListAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto);

	public Portatil PortatilDtoToDao(PortatilDTO dto);

	public ArrayList<Portatil> ListPortatilDtoToDao(ArrayList<PortatilDTO> listDto);
}
