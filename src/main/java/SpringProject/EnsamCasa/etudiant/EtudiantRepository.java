package SpringProject.EnsamCasa.etudiant;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	
	Optional<Etudiant> findEtudiantByEmail(String email);
}
