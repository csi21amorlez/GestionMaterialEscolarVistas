package gmevWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;

@Controller
public class IndexController {

	@RequestMapping("navFormAlumno")
	public String navFormularioAlumno(Model model) {

		model.addAttribute(new AlumnoDTO());
		return "formAlumno";
	}

	@RequestMapping("navFormPortatil")
	public String navFormularioPortatil(Model model) {

		model.addAttribute(new PortatilDTO());
		return "formPortatil";
	}

	@RequestMapping("portatilAsginado")
	public String portatilAsigAlumno() {
		return "portatilAsigAlumno";
	}
	@RequestMapping("alumnoAsignado")
	public String alumnoAsigPortatil() {
		return "alumnoAsigPortatil";
	}

}
