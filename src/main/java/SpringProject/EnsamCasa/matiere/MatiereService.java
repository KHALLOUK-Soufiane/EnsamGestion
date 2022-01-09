package SpringProject.EnsamCasa.matiere;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiereService {
	private final MatiereRepository matiereRepository;
		
		@Autowired
		public MatiereService(MatiereRepository matiereRepository) {
			super();
			this.matiereRepository = matiereRepository;
		}
	
		public List<Matiere> getMatieres() {
			return matiereRepository.findAll();	
		}
		
		public void addNewMatiere(Matiere matiere) {
			matiereRepository.save(matiere);
		}
}
