package gmevWeb.dto.converters;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import gmevWeb.dto.AlumnoDTO;
import gmevWeb.dto.PortatilDTO;
import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

@Component
public class DtoToImpl implements DtoToService {

	@Override
	public Alumno AlumnoDtoToDao(AlumnoDTO dto) {
		Alumno alumno = new Alumno();
		alumno.setId(dto.getId());
		alumno.setCodigoAlumno(dto.getCodigoAlumno());
		alumno.setNombreCompleto(dto.getNombreCompleto());
		alumno.setNumeroTelefono(dto.getNumeroTelefono());
		alumno.setCodAlumno(dto.getCodAlumno());
		return alumno;
	}

	@Override
	public ArrayList<Alumno> ListAlumnoDtoToDao(ArrayList<AlumnoDTO> listDto) {
		ArrayList<Alumno> listAlumno = new ArrayList<>();
		for (AlumnoDTO alumno : listDto) {
			listAlumno.add(AlumnoDtoToDao(alumno));
		}
		return listAlumno;
	}

	@Override
	public Portatil PortatilDtoToDao(PortatilDTO dto) {
		Portatil portatil = new Portatil();
		portatil.setId(dto.getId());
		portatil.setMarca(dto.getMarca());
		portatil.setCodigo(dto.getCodigo());
		portatil.setModelo(dto.getModelo());
		return portatil;
	}

	@Override
	public ArrayList<Portatil> ListPortatilDtoToDao(ArrayList<PortatilDTO> listDto) {
		ArrayList<Portatil> listPortatil = new ArrayList<>();
		for (PortatilDTO portatil : listDto) {
			listPortatil.add(PortatilDtoToDao(portatil));
		}
		return listPortatil;
	}

}
