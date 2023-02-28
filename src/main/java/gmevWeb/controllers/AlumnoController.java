package gmevWeb.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gmevWeb.dto.PortatilDTO;

@RequestMapping(value = "Alumnos")
public class AlumnoController {

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
			AlumnoDTO alumno = toDto.alumnoToDto(alumnoRepo.findAlumnoByCodPortatil(codPortatil));
			model.addAttribute("modelAlumno", alumno);
		} catch (Exception e) {
			// TODO: handle exception

		}

		return "portatilByAlumno";

	}

}
