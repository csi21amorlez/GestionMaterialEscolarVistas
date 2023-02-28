package gmewApp.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.repositories.PortatilRepository;

public class PortatilImpl implements PortatilService{
	
	@Autowired
	PortatilRepository portatilRepo;

	@Override
	public ArrayList<Portatil> buscarTodos() {
		try {
			return (ArrayList<Portatil>) portatilRepo.findAll();
			
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
	public Portatil findPortatilByAlumno(String codAlumno) {
		try {
			return (Portatil) portatilRepo.findPortatilByCodigoAlumno(codAlumno);
		}catch (Exception e) {
			return null;
		}
	}

}
