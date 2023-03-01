package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.services.AlumnoImpl;

@Controller
public class AlumnoFormController {

	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	AlumnoImpl alumnoRepo;

	/**
	 * Se encarga de guardar el alumno en base de datos.
	 *
	 * @param alumno alumno
	 * @return redirección a la vista alumnos
	 */
	@RequestMapping(value = "/guardarAlumno", method = RequestMethod.POST)
	public String guardarAlumno(@ModelAttribute("alumno") AlumnoDTO alumno) {

		try {
			System.out.println("Test= " + alumno.getCodigoAlumno());
			alumnoRepo.insertarAlumno(dtoTo.AlumnoDtoToDao(alumno));
			return "redirect:listAlumnos";
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

}
