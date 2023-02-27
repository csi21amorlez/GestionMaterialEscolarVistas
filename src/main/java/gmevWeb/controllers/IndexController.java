package gmevWeb.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.dto.converters.ToDtoImpl;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;
import gmewApp.repositories.AlumnoRepository;
import gmewApp.repositories.PortatilRepository;

@Controller
public class IndexController {

	@Autowired
	AlumnoRepository alumnoRepo;
	@Autowired
	PortatilRepository portatilRepo;
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
					.ListPortatilToDto((ArrayList<Portatil>) portatilRepo.findAll());
			return new ModelAndView("portatiles", "listPortatiles", listPortatiles);

		} catch (Exception e) {
			return new ModelAndView("portatiles", "listPortatiles", "Error cargando la lista de portatiles");
		}

	}
}
