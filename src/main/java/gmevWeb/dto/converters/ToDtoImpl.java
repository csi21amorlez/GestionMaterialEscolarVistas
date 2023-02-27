package gmevWeb.dto.converters;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

@Component
public class ToDtoImpl implements ToDtoService {

	@Override
	public AlumnoDTO AlumnoToDto(Alumno alumno) {
		AlumnoDTO dto = new AlumnoDTO();
		dto.setId(alumno.getId());
		dto.setCodigoAlumno(alumno.getCodigoAlumno());
		dto.setNombreCompleto(alumno.getNombreCompleto());
		dto.setNumeroTelefono(alumno.getNumeroTelefono());
		dto.setCodAlumno(alumno.getCodAlumno());
		if (alumno.getPortatil() != null) {
			dto.setPortatilId(alumno.getPortatil().getId());
		}
		return dto;
	}

	@Override
	public ArrayList<AlumnoDTO> ListAlumnoToDto(ArrayList<Alumno> listAlumno) {
		ArrayList<AlumnoDTO> listDto = new ArrayList<>();
		for (Alumno alumno : listAlumno) {
			listDto.add(AlumnoToDto(alumno));
		}
		return listDto;
	}

	@Override
	public PortatilDTO PortatilToDto(Portatil portatil) {
		PortatilDTO dto = new PortatilDTO();
		dto.setId(portatil.getId());
		dto.setMarca(portatil.getMarca());
		dto.setCodigo(portatil.getCodigo());
		dto.setModelo(portatil.getModelo());
		if (portatil.getAlumno() != null) {
			dto.setAlumnoId(portatil.getAlumno().getId());
		}
		return dto;
	}

	@Override
	public ArrayList<PortatilDTO> ListPortatilToDto(ArrayList<Portatil> listPortatil) {
		ArrayList<PortatilDTO> listDto = new ArrayList<>();
		for (Portatil portatil : listPortatil) {
			listDto.add(PortatilToDto(portatil));
		}
		return listDto;
	}

}
