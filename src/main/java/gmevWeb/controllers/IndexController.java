package gmevWeb.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gmewApp.dto.AlumnoDTO;
import gmewApp.dto.PortatilDTO;

import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.services.AlumnoImpl;
import gmewApp.services.PortatilImpl;

@Controller
public class IndexController {

	@Autowired
	AlumnoImpl alumnoRepo;
	@Autowired
	PortatilImpl portatilRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;

	@RequestMapping(value = "/alumnos")
	public ModelAndView navAlumnos() {

		try {
			ArrayList<AlumnoDTO> listAlumnos = alumnoRepo.findAll();
			return new ModelAndView("alumnos", "listAlumnos", listAlumnos);
		} catch (Exception e) {
			return new ModelAndView("alumnos", "listAlumnos", "Error cargando la lista de alumnos");
		}
	}

	@RequestMapping(value = "/portatiles")
	public ModelAndView navPortatiles() {

		try {
			ArrayList<PortatilDTO> listPortatiles = portatilRepo.buscarTodos();
			return new ModelAndView("portatiles", "listPortatiles", listPortatiles);

		} catch (Exception e) {
			return new ModelAndView("portatiles", "listPortatiles", "Error cargando la lista de portatiles");
		}

	}
}
