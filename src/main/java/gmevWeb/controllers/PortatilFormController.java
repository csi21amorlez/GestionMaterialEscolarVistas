package gmevWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gmevWeb.dto.PortatilDTO;
import gmevWeb.dto.converters.DtoToImpl;
import gmevWeb.services.PortatilImpl;

@Controller
public class PortatilFormController {

	@Autowired
	DtoToImpl dtoTo;
	@Autowired
	PortatilImpl portatilRepo;

	@RequestMapping(value = "/guardarPortatil", method = RequestMethod.POST)
	public String guardarPortatil(PortatilDTO portatil) {

		try {

			portatilRepo.insertarPortatil(dtoTo.PortatilDtoToDao(portatil));
			return "redirect:portatiles";
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

}
