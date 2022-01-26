package SpringProject.EnsamCasa.salle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.EnsamCasa.etudiant.Etudiant;

@Service
public class SalleService {
	private final SalleRepository salleRepository;
	
	@Autowired
	public SalleService(SalleRepository salleRepository) {
		super();
		this.salleRepository = salleRepository;
	}

	public List<Salle> getSalles() {
		return salleRepository.findAll();	
	}
	
	public void addNewSalle(Salle salle) {
		salleRepository.save(salle);
	}
	
	public void deleteSalle(Long id) {
		salleRepository.deleteById(id);
	}

	public void updateSalle(Long id, Salle salle) {
		if (salleRepository.findById(id).isPresent()){
			Salle existingSalle = salleRepository.findById(id).get();

			existingSalle.setLibelle(salle.getLibelle());
			existingSalle.setCapacite(salle.getCapacite());
			existingSalle.setEtage(salle.getEtage());

			salleRepository.save(existingSalle);
        }
	}
}
