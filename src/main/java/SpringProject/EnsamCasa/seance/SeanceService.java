package SpringProject.EnsamCasa.seance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeanceService {
	private final SeanceRepository seanceRepository;
	
	@Autowired
	public SeanceService(SeanceRepository seanceRepository) {
		super();
		this.seanceRepository = seanceRepository;
	}

	public List<Seance> getSeances() {
		return seanceRepository.findAll();	
	}
	
	public void addNewSeance(Seance seance) {
		seanceRepository.save(seance);
	}
	
	public List<Seance> getSeancesDay(String day, String filiere, Integer niveau){
		return seanceRepository.findSeanceByDay(day, filiere, niveau);
	}
	
	public List<Seance> getSeancesDayProf(String day, String cin){
		return seanceRepository.findSeanceByDayProf(day, cin);
	}
	
}
