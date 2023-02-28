package gmevWeb.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;

import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.repositories.AlumnoRepository;
import gmewApp.repositories.PortatilRepository;
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

	@RequestMapping(value = "alumnos")
	public ModelAndView navAlumnos() {

		try {
			ArrayList<AlumnoDTO> listAlumnos = toDto.ListAlumnoToDto((ArrayList<Alumno>) alumnoRepo.findAll());
			return new ModelAndView("alumnos", "listAlumnos", listAlumnos);
		} catch (Exception e) {
			return new ModelAndView("alumnos", "listAlumnos", "Error cargando la lista de alumnos");
		}
	}

	@RequestMapping(value = "portatiles")
	public ModelAndView navPortatiles() {

		try {
			ArrayList<PortatilDTO> listPortatiles = toDto
					.ListPortatilToDto((ArrayList<Portatil>) portatilRepo.buscarTodos());
			return new ModelAndView("portatiles", "listPortatiles", listPortatiles);

		} catch (Exception e) {
			return new ModelAndView("portatiles", "listPortatiles", "Error cargando la lista de portatiles");
		}

	}
}
