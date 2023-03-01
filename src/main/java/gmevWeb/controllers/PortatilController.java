package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.dto.converters.ToDtoImpl;
import gmevWeb.services.PortatilImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class PortatilController.
 */
@Controller
public class PortatilController {

	
	@Autowired
	PortatilImpl portatilRepo;
	
	
	@Autowired
	ToDtoImpl toDto;
	
	
	@Autowired
	DtoToImpl dtoTo;

	/**
	 * Navegación a la vista findPortatilByAlumno.
	 *
	 * @param model model
	 * @param codAlumno codigo del alumno a buscar
	 * @return redireccion a la vista portatilByAlumno
	 */
	@RequestMapping(value = "/findPortatilByAlumno")
	public String findPortatilByAlumno(Model model, @Param(value = "codAlumno") String codAlumno) {

		PortatilDTO portatil = portatilRepo.findPortatilByAlumno(codAlumno);

		if (portatil != null) {
			model.addAttribute("portatil", portatil);
		} else {
			model.addAttribute("mensaje", "No se encontró ningún portatil asignado al alumno con código " + codAlumno);
		}

		return "redirect:portatilByAlumno";

	}

	/**
	 * Navegacion al formulario de alta de portatiles.
	 *
	 * @return ModelAndView(nombreVista, nombreModelo, objetoModelo)
	 */
	@RequestMapping(value = "/navFormPortatil")
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
