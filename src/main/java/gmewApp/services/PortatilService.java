package gmewApp.services;

import java.util.ArrayList;

import gmewApp.dao.Portatil;

public interface PortatilService {

	public ArrayList<Portatil> buscarTodos();

	public void insertarPortatil(Portatil portatil);

	public void deletePortatil(Portatil portatil);

	public Portatil findPortatilByAlumno(String codAlumno);

}
