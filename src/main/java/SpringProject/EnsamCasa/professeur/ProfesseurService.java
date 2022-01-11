package SpringProject.EnsamCasa.professeur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesseurService {
	private final ProfesseurRepository professeurRepository;
	
	@Autowired
	public ProfesseurService(ProfesseurRepository professeurRepository) {
		super();
		this.professeurRepository = professeurRepository;
	}

	public List<Professeur> getProfs() {
		return professeurRepository.findAll();	
	}
	
	public void addNewProf(Professeur professeur) {
		professeurRepository.save(professeur);
	}
	
	public void deleteProfesseur(Long id) {
		professeurRepository.deleteById(id);
	}
}
