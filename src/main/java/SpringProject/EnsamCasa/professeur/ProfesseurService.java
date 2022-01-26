package SpringProject.EnsamCasa.professeur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.EnsamCasa.etudiant.Etudiant;

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

	public void updateProfesseur(Long id, Professeur prof) {
		if (professeurRepository.findById(id).isPresent()){
			Professeur existingProfesseur = professeurRepository.findById(id).get();

			existingProfesseur.setCIN(prof.getCIN());
			existingProfesseur.setNom(prof.getNom());
			existingProfesseur.setPrenom(prof.getPrenom());
			existingProfesseur.setTel(prof.getTel());
			existingProfesseur.setEmail(prof.getEmail());

			professeurRepository.save(existingProfesseur);
        }
	}
}
