package gmewApp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gmewApp.dto.AlumnoDTO;
import gmewApp.dao.Alumno;
import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.repositories.AlumnoRepository;

@Component
public class AlumnoImpl implements AlumnoService {

	@Autowired
	AlumnoRepository alumnoRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTp;

	@Override
	public ArrayList<AlumnoDTO> findAll() {
		try {
			return toDto.ListAlumnoToDto((ArrayList<Alumno>) alumnoRepo.findAll());
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
	public AlumnoDTO findAlumnoByPortatil(String codPortatil) {
		try {
			return toDto.AlumnoToDto(alumnoRepo.findAlumnoByCodigoPortatil(codPortatil));
		} catch (Exception e) {
			return null;
		}
	}

}
