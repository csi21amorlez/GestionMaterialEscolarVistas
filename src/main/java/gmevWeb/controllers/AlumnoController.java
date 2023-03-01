package gmevWeb.controllers;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gmewApp.dto.AlumnoDTO;
import gmewApp.dto.PortatilDTO;
import gmewApp.dto.converters.DtoToImpl;
import gmewApp.dto.converters.ToDtoImpl;
import gmewApp.services.AlumnoImpl;
import gmewApp.services.PortatilImpl;

@Controller
public class AlumnoController {

	Log log = LogFactory.getLog(getClass());

	@Autowired
	AlumnoImpl alumnoRepo;
	@Autowired
	ToDtoImpl toDto;
	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	PortatilImpl portatilRepo;

	@RequestMapping(value = "/navFormAlumno")
	public ModelAndView navFormAlumno() {
		try {
			AlumnoDTO alumno = new AlumnoDTO();
			return new ModelAndView("formAlumno", "alumno", alumno);
		} catch (Exception e) {
			return new ModelAndView("formAlumno", "alumno", "Error creando el alumno");

		}
	}

	@RequestMapping(value = "/findAlumnoByPortatil")
	public String findAlumnoByPortatil(Model model, @Param(value = "codPortatil") String codPortatil) {

		AlumnoDTO alumno = alumnoRepo.findAlumnoByPortatil(codPortatil);

		if (alumno != null) {
			log.info(alumno.toString());
			model.addAttribute("alumno", alumno);
		} else {
			model.addAttribute("mensaje",
					"No se encontró ningún alumno asignado al portátil con código " + codPortatil);
		}

		return "alumnoByPortatil";
	}

	@RequestMapping(value = "/listAlumnos")
	public String index(Model model) {
		try {
			ArrayList<AlumnoDTO> listAlumno = alumnoRepo.findAll();

			for (AlumnoDTO alumnoDTO : listAlumno) {
				PortatilDTO portatil = portatilRepo.findById(alumnoDTO.getPortatilId());
				alumnoDTO.setPortatil(portatil);
			}

			model.addAttribute("listAlumno", listAlumno);
			return "alumnos";
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@RequestMapping(value = "/eliminarAlumno", method = RequestMethod.POST)
	public String eliminarAlumno(@Param(value = "alumno") AlumnoDTO a) {
		try {
			alumnoRepo.deleteAlumno(dtoTo.AlumnoDtoToDao(a));
			return "alumnos";
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
