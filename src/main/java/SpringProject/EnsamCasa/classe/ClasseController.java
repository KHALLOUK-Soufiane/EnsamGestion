package SpringProject.EnsamCasa.classe;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/classe")
public class ClasseController {
	
	private final ClasseService classeService;
	
	public ClasseController(ClasseService classeService) {
		this.classeService = classeService;
	}

	@GetMapping
	public List<Classe> getClasses() {
		return classeService.getClasses();
	}
	
	@PostMapping
	public void registerNewClasse(@RequestBody Classe classe) {
		classeService.addNewClasse(classe);
	}
}
