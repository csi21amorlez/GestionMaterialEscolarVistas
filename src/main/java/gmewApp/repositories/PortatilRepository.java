package gmewApp.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gmewApp.dao.Alumno;
import gmewApp.dao.Portatil;

@Repository
public interface PortatilRepository extends CrudRepository<Portatil, Long> {

	@Query("SELECT p.alumno FROM Portatil p WHERE p.codigo = :codigo")
	Alumno findAlumnoByCodigo(@Param("codigo") String codigo);

}
