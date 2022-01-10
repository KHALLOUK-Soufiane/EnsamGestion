package SpringProject.EnsamCasa.professeur;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/professeur")
public class ProfesseurController {
	
	private final ProfesseurService professeurService;
		
	public ProfesseurController(ProfesseurService professeurService) {
		this.professeurService = professeurService;
	}

	@GetMapping
	public List<Professeur> getProfs() {
		return professeurService.getProfs();
	}
	
	@PostMapping
	public void registerNewProf(@RequestBody Professeur professeur) {
		professeurService.addNewProf(professeur);
	}
}
