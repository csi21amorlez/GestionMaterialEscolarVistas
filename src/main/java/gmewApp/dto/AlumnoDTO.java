package gmewApp.dto;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class AlumnoDTO.
 */
@Component
public class AlumnoDTO {

	/** The id. */
	private Long id;

	/** The codigo alumno. */
	private String codigoAlumno;

	/** The nombre completo. */
	private String nombreCompleto;

	/** The numero telefono. */
	private String numeroTelefono;

	/** The portatil id. */
	private Long portatilId;

	/** The portatil. */
	private PortatilDTO portatil;

	/** The cod alumno. */
	private String codAlumno;

	/**
	 * Gets the portatil.
	 *
	 * @return the portatil
	 */
	public PortatilDTO getPortatil() {
		return portatil;
	}

	/**
	 * Sets the portatil.
	 *
	 * @param portatil the new portatil
	 */
	public void setPortatil(PortatilDTO portatil) {
		this.portatil = portatil;
	}

	/**
	 * Gets the cod alumno.
	 *
	 * @return the cod alumno
	 */
	public String getCodAlumno() {
		return codAlumno;
	}

	/**
	 * Sets the cod alumno.
	 *
	 * @param codAlumno the new cod alumno
	 */
	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the codigo alumno.
	 *
	 * @return the codigo alumno
	 */
	public String getCodigoAlumno() {
		return codigoAlumno;
	}

	/**
	 * Sets the codigo alumno.
	 *
	 * @param codigoAlumno the new codigo alumno
	 */
	public void setCodigoAlumno(String codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	/**
	 * Gets the nombre completo.
	 *
	 * @return the nombre completo
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * Sets the nombre completo.
	 *
	 * @param nombreCompleto the new nombre completo
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * Gets the numero telefono.
	 *
	 * @return the numero telefono
	 */
	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	/**
	 * Sets the numero telefono.
	 *
	 * @param numeroTelefono the new numero telefono
	 */
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	/**
	 * Gets the portatil id.
	 *
	 * @return the portatil id
	 */
	public Long getPortatilId() {
		return portatilId;
	}

	/**
	 * Sets the portatil id.
	 *
	 * @param portatilId the new portatil id
	 */
	public void setPortatilId(Long portatilId) {
		this.portatilId = portatilId;
	}

}
