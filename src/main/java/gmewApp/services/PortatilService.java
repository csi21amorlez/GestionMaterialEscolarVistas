package gmewApp.services;

import java.util.ArrayList;

import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Portatil;

public interface PortatilService {

	public ArrayList<PortatilDTO> buscarTodos();

	public void insertarPortatil(Portatil portatil);

	public void deletePortatil(Portatil portatil);

	public PortatilDTO findPortatilByAlumno(String codAlumno);

}
