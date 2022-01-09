package SpringProject.EnsamCasa.seance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SeanceRepository extends JpaRepository<Seance, Long>{
	
	@Query(value="SELECT * From Seance WHERE jour=?1",nativeQuery=true)
	List<Seance> findSeanceByDay(String Day);

}
