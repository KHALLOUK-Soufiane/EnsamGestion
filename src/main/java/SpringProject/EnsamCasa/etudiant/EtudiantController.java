package SpringProject.EnsamCasa.etudiant;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/student")
public class EtudiantController {
	
	private final EtudiantService etudiantService;
	
	public EtudiantController(EtudiantService etudiantService) {
		this.etudiantService = etudiantService;
	}

	@GetMapping
	public List<Etudiant> getEtudiants() {
		return etudiantService.getEtudiants();
	}
	
	@PostMapping
	public void registerNewEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.addNewEtudiant(etudiant);
	}
	
	@DeleteMapping(path = "{etuId}")
	public void deleteEtudiant(@PathVariable("etuId") Long id) {
		etudiantService.deleteEtudiant(id);
	}
}
