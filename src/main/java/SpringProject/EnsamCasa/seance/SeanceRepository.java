package SpringProject.EnsamCasa.seance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeanceRepository extends JpaRepository<Seance, Long>{
	
	@Query(value="SELECT * From Seance s "
			+ "JOIN Creneau c ON s.id_creneau=c.id "
			+ "JOIN Emploi e ON e.id=s.id_emploi "
			+ "JOIN Classe cl ON cl.id=e.id_classe "
			+ "WHERE day=?1 AND cl.filiere=?2 AND cl.niveau=?3",nativeQuery=true)
	List<Seance> findSeanceByDay(String Day, String Filiere, Integer Niveau);
	
	@Query(value="SELECT * From Seance s "
			+ "JOIN Creneau c ON s.id_creneau=c.id "
			+ "JOIN Professeur p ON s.id_prof=p.id "
			+ "WHERE c.day=?1 AND p.CIN=?2",nativeQuery=true)
	List<Seance> findSeanceByDayProf(String Day, String Cin);

}
