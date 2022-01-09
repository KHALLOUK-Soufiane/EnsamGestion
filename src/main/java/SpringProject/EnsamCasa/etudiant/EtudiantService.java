package SpringProject.EnsamCasa.etudiant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {
	
	private final EtudiantRepository etudiantRepository;
	
	@Autowired
	public EtudiantService(EtudiantRepository etudiantRepository) {
		super();
		this.etudiantRepository = etudiantRepository;
	}

	public List<Etudiant> getEtudiants() {
		return etudiantRepository.findAll();	
	}
	
	public void addNewEtudiant(Etudiant etudiant) {
		Optional<Etudiant> etuByEmail = etudiantRepository.findEtudiantByEmail(etudiant.getEmail());
		if (etuByEmail.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		etudiantRepository.save(etudiant);
	}
	
	public void deleteEtudiant(Long id) {
		etudiantRepository.deleteById(id);
	}
}
