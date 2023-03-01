package gmewApp.dto;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class PortatilDTO.
 */
@Component
public class PortatilDTO {

	/** The id. */
	private Long id;

	/** The marca. */
	private String marca;

	/** The codigo. */
	private String codigo;

	/** The modelo. */
	private String modelo;

	/** The alumno id. */
	private Long alumnoId;

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
	 * Gets the marca.
	 *
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Sets the marca.
	 *
	 * @param marca the new marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the new codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Gets the modelo.
	 *
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Sets the modelo.
	 *
	 * @param modelo the new modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Gets the alumno id.
	 *
	 * @return the alumno id
	 */
	public Long getAlumnoId() {
		return alumnoId;
	}

	/**
	 * Sets the alumno id.
	 *
	 * @param alumnoId the new alumno id
	 */
	public void setAlumnoId(Long alumnoId) {
		this.alumnoId = alumnoId;
	}

}
