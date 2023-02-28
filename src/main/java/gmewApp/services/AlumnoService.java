package gmewApp.services;

import java.util.ArrayList;

import gmewApp.dao.Alumno;

public interface AlumnoService {
	
	public ArrayList<Alumno> findAll();
	
	public void insertarAlumno(Alumno alumno);
	
	public void deleteAlumno(Alumno alumno);
	
	public Alumno findAlumnoByPortatil(String codPortatil);

}
