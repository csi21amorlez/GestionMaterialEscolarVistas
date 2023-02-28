package gmewApp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.repositories.PortatilRepository;

public class PortatilImpl implements PortatilService{
	
	@Autowired
	PortatilRepository portatilRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;

	@Override
	public ArrayList<PortatilDTO> buscarTodos() {
		try {
			return toDto.ListPortatilToDto((ArrayList<Portatil>) portatilRepo.findAll());
			
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public void insertarPortatil(Portatil portatil) {
		try {
			portatilRepo.save(portatil);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void deletePortatil(Portatil portatil) {
		// TODO Auto-generated method stub
		try {
			portatilRepo.delete(portatil);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public PortatilDTO findPortatilByAlumno(String codAlumno) {
		try {
			return toDto.PortatilToDto(portatilRepo.findPortatilByCodigoAlumno(codAlumno));
		}catch (Exception e) {
			return null;
		}
	}

}
