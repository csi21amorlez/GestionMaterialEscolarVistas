package gmewApp.dao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Portatil.
 */
@Entity
@Table(name = "dlk_gme_portatiles", schema = "sc_dlk_gestion_material_escolar")
public class Portatil {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "portatil_sequence")
	@SequenceGenerator(name = "portatil_sequence", sequenceName = "portatil_sequence", allocationSize = 1)
	private Long id;

	/** The md date. */
	@Column(name = "md_date")
	private Calendar mdDate;

	/** The md uuid. */
	@Column(name = "md_uuid")
	private String mdUuid;

	/** The marca. */
	@Column(name = "marca_portatil")
	private String marca;

	/** The codigo. */
	@Column(name = "codigo_portatil")
	private String codigo;

	/** The modelo. */
	@Column(name = "modelo_portatil")
	private String modelo;

	/** The alumno. */
	@OneToOne(mappedBy = "portatil")
	private Alumno alumno;

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
	 * Gets the md date.
	 *
	 * @return the md date
	 */
	public Calendar getMdDate() {
		return mdDate;
	}

	/**
	 * Sets the md date.
	 *
	 * @param mdDate the new md date
	 */
	public void setMdDate(Calendar mdDate) {
		this.mdDate = mdDate;
	}

	/**
	 * Gets the md uuid.
	 *
	 * @return the md uuid
	 */
	public String getMdUuid() {
		return mdUuid;
	}

	/**
	 * Sets the md uuid.
	 *
	 * @param mdUuid the new md uuid
	 */
	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
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
	 * Gets the alumno.
	 *
	 * @return the alumno
	 */
	public Alumno getAlumno() {
		return alumno;
	}

	/**
	 * Sets the alumno.
	 *
	 * @param alumno the new alumno
	 */
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
