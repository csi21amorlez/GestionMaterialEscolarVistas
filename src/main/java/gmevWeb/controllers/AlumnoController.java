package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
	
	
	public ModelAndView navFormAlumno() {
		try {
			AlumnoDTO alumno = new AlumnoDTO();
			return new ModelAndView("formAlumno", "alumno", alumno);
		} catch (Exception e) {
			return new ModelAndView("formAlumno", "alumno", "Error creando el alumno");

		}
	}

	public String findPortatilByAlumno(Model model, @RequestParam String codPortatil) {

		try {
			AlumnoDTO alumno = toDto.AlumnoToDto(alumnoRepo.findAlumnoByPortatil(codPortatil));
			model.addAttribute("modelAlumno", alumno);
		} catch (Exception e) {
			// TODO: handle exception

		}

		return "portatilByAlumno";

	}
	

}
