package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/portatiles")
public class PortatilController {
	
	@Autowired
	public String findPortatilByAlumno(Model model, @RequestParam String nombreCompleto) {
		
		
		
		return "alumnoPor";
		
	}
	

}
