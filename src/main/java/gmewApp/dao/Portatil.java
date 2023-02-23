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

@Entity
@Table(name = "dlk_gme_portatiles", schema = "sc_dlk_gestion_material_escolar")
public class Portatil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "portatil_sequence")
	@SequenceGenerator(name = "portatil_sequence", sequenceName = "portatil_sequence", allocationSize = 1)
	private Long id;

	@Column(name = "md_date")
	private Calendar mdDate;

	@Column(name = "md_uuid")
	private String mdUuid;

	@Column(name = "marca_portatil")
	private String marca;

	@Column(name = "codigo_portatil")
	private String codigo;

	@Column(name = "modelo_portatil")
	private String modelo;

	@OneToOne(mappedBy = "portatil")
	private Alumno alumno;

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
