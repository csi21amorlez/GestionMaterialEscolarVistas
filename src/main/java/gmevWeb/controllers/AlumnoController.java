package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gmevWeb.dto.AlumnoDTO;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.repositories.AlumnoRepository;
import gmewApp.services.AlumnoImpl;

@RequestMapping(value = "Alumnos")
public class AlumnoController {

	@Autowired
	AlumnoImpl alumnoRepo;
	@Autowired
	ToDtoImpl toDto;

	@RequestMapping(value = "navFormAlumno")
	public ModelAndView navFormAlumno() {
		try {
			AlumnoDTO alumno = new AlumnoDTO();
			return new ModelAndView("formAlumno", "alumno", alumno);
		} catch (Exception e) {
			return new ModelAndView("formAlumno", "alumno", "Error creando el alumno");

		}
	}
	@GetMapping(value = "/")
	public String findPortatilByAlumno(Model model, @RequestParam String codPortatil) {

		AlumnoDTO alumno = alumnoRepo.findAlumnoByPortatil(codPortatil);

		if (alumno != null) {
			model.addAttribute("alumno", alumno);
		} else {
			model.addAttribute("mensaje",
					"No se encontró ningún alumno asignado al portátil con código " + codPortatil);
		}

		return "vista-buscar-alumno-por-portatil";
	}

}
