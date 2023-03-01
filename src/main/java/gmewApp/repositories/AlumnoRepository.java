package gmewApp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import gmewApp.dao.Alumno;

// TODO: Auto-generated Javadoc
/**
 * The Interface AlumnoRepository.
 */
@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	/**
	 * Find alumno by codigo portatil.
	 *
	 * @param codigo the codigo
	 * @return the alumno
	 */
	@Query("SELECT p.alumno FROM Portatil p WHERE p.codigo = :codigo")
	Alumno findAlumnoByCodigoPortatil(@Param("codigo") String codigo);
}
