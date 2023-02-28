package gmewApp.services;

import java.util.ArrayList;

import gmevWeb.dto.AlumnoDTO;
import gmewApp.dao.Alumno;

public interface AlumnoService {
	
	public ArrayList<AlumnoDTO> findAll();
	
	public void insertarAlumno(Alumno alumno);
	
	public void deleteAlumno(Alumno alumno);
	
	public AlumnoDTO findAlumnoByPortatil(String codPortatil);

}
