package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.dto.converters.ToDtoImpl;
import gmewApp.repositories.PortatilRepository;

@RequestMapping("/portatiles")
public class PortatilController {
	
	@Autowired
	PortatilRepository portatilRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;
	
	@RequestMapping(value = "findPortatilByAlumno")
	public String findPortatilByAlumno(Model model, @RequestParam String codAlumno) {
		
		try {
			PortatilDTO portatil = toDto.PortatilToDto(portatilRepo.findPortatilByCodigoAlumno(codAlumno));
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
