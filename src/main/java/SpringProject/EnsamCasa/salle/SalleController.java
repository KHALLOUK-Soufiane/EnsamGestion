package SpringProject.EnsamCasa.salle;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/salle")
public class SalleController {
	
	private final SalleService salleService;
		
	public SalleController(SalleService salleService) {
		this.salleService = salleService;
	}

	@GetMapping
	public List<Salle> getSalles() {
		return salleService.getSalles();
	}
	
	@PostMapping
	public void registerNewSalle(@RequestBody Salle salle) {
		salleService.addNewSalle(salle);
	}
	
	@DeleteMapping(path = "{salleId}")
	public void deleteSalle(@PathVariable("salleId") Long id) {
		salleService.deleteSalle(id);
	}
}
