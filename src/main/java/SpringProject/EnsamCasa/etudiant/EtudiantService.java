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
	
	public void updateEtudiant(Long id, Etudiant etu) {
		if (etudiantRepository.findById(id).isPresent()){
			Etudiant existingEtudiant = etudiantRepository.findById(id).get();

			existingEtudiant.setCode_apogee(etu.getCode_apogee());
			existingEtudiant.setNiveau(etu.getNiveau());
			existingEtudiant.setNom(etu.getNom());
			existingEtudiant.setPrenom(etu.getPrenom());
			existingEtudiant.setTel(etu.getTel());
			existingEtudiant.setEmail(etu.getEmail());
			existingEtudiant.setDateNaiss(etu.getDateNaiss());

            etudiantRepository.save(existingEtudiant);
        }
	}
}
