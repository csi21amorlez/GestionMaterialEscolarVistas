package gmewApp.services;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gmewApp.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.repositories.PortatilRepository;

@Component
public class PortatilImpl implements PortatilService{
	
	Log logs = LogFactory.getLog(getClass());
	
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

	@Override
	public PortatilDTO findById(Long id) {
		try {
			return toDto.PortatilToDto(portatilRepo.findById(id).orElse(null));
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

}
