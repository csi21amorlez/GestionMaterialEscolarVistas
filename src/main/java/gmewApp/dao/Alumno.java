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

@Entity
@Table(name = "dlk_ggm_alumnos", schema = "sc_dlk_gestion_material_escolar")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_sequence")
	@SequenceGenerator(name = "alumno_sequence", sequenceName = "alumno_seq", allocationSize = 1)
	private Long id;
	@Column(name = "md_date")
	private Calendar mdDate;

	@Column(name = "md_uuid")
	private String mdUuid;
	@Column(name = "codigo_alumno")
	private String codigoAlumno;

	@Column(name = "nombre_completo")
	private String nombreCompleto;

	@Column(name = "numero_telefono")
	private String numeroTelefono;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "portatil_id")
	private Portatil portatil;
	
	@Column(name = "codigo_alumno")
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

	public Calendar getMdDate() {
		return mdDate;
	}

	public void setMdDate(Calendar mdDate) {
		this.mdDate = mdDate;
	}

	public String getMdUuid() {
		return mdUuid;
	}

	public void setMdUuid(String mdUuid) {
		this.mdUuid = mdUuid;
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

	public Portatil getPortatil() {
		return portatil;
	}

	public void setPortatil(Portatil portatil) {
		this.portatil = portatil;
	}

}
