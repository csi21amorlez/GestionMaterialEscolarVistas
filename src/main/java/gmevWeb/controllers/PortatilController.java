package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gmewApp.dto.PortatilDTO;
import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.services.PortatilImpl;

@RequestMapping("/portatiles")
public class PortatilController {

	@Autowired
	PortatilImpl portatilRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;

	@RequestMapping(value = "findPortatilByAlumno")
	public String findPortatilByAlumno(Model model, @Param(value = "codAlumno") String codAlumno) {

		try {
			PortatilDTO portatil = portatilRepo.findPortatilByAlumno(codAlumno);
			model.addAttribute("modelPortatil", portatil);
		} catch (Exception e) {
			// TODO: handle exception

		}

		return "portatilByAlumno";

	}

	@RequestMapping(value = "navFormPortatil")
	public ModelAndView navFormPortatil() {
		try {
			PortatilDTO portatil = new PortatilDTO();
			return new ModelAndView("formPortatil", "portatil", portatil);
		} catch (Exception e) {
			// TODO: handle exception
			return new ModelAndView("formPortatil", "portatil", null);
		}
	}

}
