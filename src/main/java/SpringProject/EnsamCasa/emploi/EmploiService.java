package SpringProject.EnsamCasa.emploi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmploiService {
private final EmploiRepository emploiRepository;
	
	@Autowired
	public EmploiService(EmploiRepository emploiRepository) {
		super();
		this.emploiRepository = emploiRepository;
	}

	public List<Emploi> getEmplois() {
		return emploiRepository.findAll();	
	}
	
	public void addNewEmploi(Emploi emploi) {
		emploiRepository.save(emploi);
	}
}
