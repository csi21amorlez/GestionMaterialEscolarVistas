package gmewApp.dto.converters;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

public interface ToDtoService {
	
public AlumnoDTO AlumnoToDto(Alumno alumno); 
	
	public ArrayList<AlumnoDTO> ListAlumnoToDto(ArrayList<Alumno> listAlumno);
	
	public PortatilDTO PortatilToDto(Portatil portatil);
	
	public ArrayList<PortatilDTO> ListPortatilToDto(ArrayList<Portatil> listPortatil);

}
