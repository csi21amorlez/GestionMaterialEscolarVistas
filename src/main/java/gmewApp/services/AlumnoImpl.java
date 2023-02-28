package gmewApp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import gmewApp.dao.Alumno;
import gmewApp.repositories.AlumnoRepository;

public class AlumnoImpl implements AlumnoService {

	@Autowired
	AlumnoRepository alumnoRepo;

	@Override
	public ArrayList<Alumno> findAll() {
		try {
			return (ArrayList<Alumno>) alumnoRepo.findAll();
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public void insertarAlumno(Alumno alumno) {
		try {
			alumnoRepo.save(alumno);
		} catch (Exception e) {

		}
	}

	@Override
	public void deleteAlumno(Alumno alumno) {

		try {
			alumnoRepo.delete(alumno);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public Alumno findAlumnoByPortatil(String codPortatil) {
		try {
			return (Alumno) alumnoRepo.findAlumnoByCodigoPortatil(codPortatil);
		} catch (Exception e) {
			return null;
		}
	}

}
