package gmewApp.dao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Alumno.
 */
@Entity
@Table(name = "dlk_ggm_alumnos", schema = "sc_dlk_gestion_material_escolar")
public class Alumno {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_sequence")
	@SequenceGenerator(name = "alumno_sequence", sequenceName = "alumno_seq", allocationSize = 1)
	private Long id;

	/** The md date. */
	@Column(name = "md_date")
	private Calendar mdDate;

	/** The md uuid. */
	@Column(name = "md_uuid")
	private String mdUuid;

	/** The nombre completo. */
	@Column(name = "nombre_completo")
	private String nombreCompleto;

	/** The numero telefono. */
	@Column(name = "numero_telefono")
	private String numeroTelefono;

	/** The portatil. */
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "portatil_id")
	private Portatil portatil;

	/** The cod alumno. */
	@Column(name = "codigo_alumno")
	private String codAlumno;

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
	 * Gets the portatil.
	 *
	 * @return the portatil
	 */
	public Portatil getPortatil() {
		return portatil;
	}

	/**
	 * Sets the portatil.
	 *
	 * @param portatil the new portatil
	 */
	public void setPortatil(Portatil portatil) {
		this.portatil = portatil;
	}

}
