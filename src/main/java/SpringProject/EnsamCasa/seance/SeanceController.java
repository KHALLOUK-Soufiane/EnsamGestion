package SpringProject.EnsamCasa.seance;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/seance")
public class SeanceController {
	
	private final SeanceService seanceService;
		
	public SeanceController(SeanceService seanceService) {
		this.seanceService = seanceService;
	}

	@GetMapping
	public List<Seance> getSeances() {
		return seanceService.getSeances();
	}
	
	@PostMapping
	public void registerNewSeance(@RequestBody Seance seance) {
		seanceService.addNewSeance(seance);
	}
	
	public List<Seance> getSeancesByDay(String day){
		return seanceService.getSeancesDay(day);
	}
}
