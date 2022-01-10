package SpringProject.EnsamCasa.matiere;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/matiere")
public class MatiereController {
private final MatiereService matiereService;
	
	public MatiereController(MatiereService matiereService) {
		this.matiereService = matiereService;
	}

	@GetMapping
	public List<Matiere> getMatieres() {
		return matiereService.getMatieres();
	}
	
	@PostMapping
	public void registerNewMatiere(@RequestBody Matiere matiere) {
		matiereService.addNewMatiere(matiere);
	}
}
