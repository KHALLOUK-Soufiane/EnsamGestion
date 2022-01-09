package SpringProject.EnsamCasa.emploi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/emploi")
public class EmploiController {
	private final EmploiService emploiService;
	
	public EmploiController(EmploiService emploiService) {
		this.emploiService = emploiService;
	}

	@GetMapping
	public List<Emploi> getEmplois() {
		return emploiService.getEmplois();
	}
	
	@PostMapping
	public void registerNewEmploi(@RequestBody Emploi emploi) {
		emploiService.addNewEmploi(emploi);
	}
}
