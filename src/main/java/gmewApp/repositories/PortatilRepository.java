package gmewApp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

// TODO: Auto-generated Javadoc
/**
 * The Interface PortatilRepository.
 */
@Repository
public interface PortatilRepository extends CrudRepository<Portatil, Long> {

	/**
	 * Find portatil by codigo alumno.
	 *
	 * @param codAlumno the cod alumno
	 * @return the portatil
	 */
	@Query("SELECT a.portatil FROM Alumno a WHERE a.codAlumno = :codAlumno")
	Portatil findPortatilByCodigoAlumno(@Param("codAlumno") String codAlumno);

}
