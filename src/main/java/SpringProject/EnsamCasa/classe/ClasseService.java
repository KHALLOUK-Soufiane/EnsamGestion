package SpringProject.EnsamCasa.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseService {
	
	private final ClasseRepository classeRepository;
	
	@Autowired
	public ClasseService(ClasseRepository classeRepository) {
		super();
		this.classeRepository = classeRepository;
	}

	public List<Classe> getClasses() {
		return classeRepository.findAll();	
	}
	
	public void addNewClasse(Classe classe) {
		classeRepository.save(classe);
	}
}
