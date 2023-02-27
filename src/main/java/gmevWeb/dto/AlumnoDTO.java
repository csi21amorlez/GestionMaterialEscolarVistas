package gmevWeb.dto;

import org.springframework.stereotype.Component;

@Component
public class AlumnoDTO {

	private Long id;
	private String codigoAlumno;
	private String nombreCompleto;
	private String numeroTelefono;
	private Long portatilId;
	private String codAlumno;
	
	

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(String codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Long getPortatilId() {
		return portatilId;
	}

	public void setPortatilId(Long portatilId) {
		this.portatilId = portatilId;
	}

}
