package SpringProject.EnsamCasa.emploi;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import SpringProject.EnsamCasa.matiere.Matiere;
import SpringProject.EnsamCasa.creneau.Creneau;



@Entity
@Table
public class Emploi {
	@Id
	@SequenceGenerator(
			name = "emploi_sequence",
			sequenceName = "emploi_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "emploi_sequence"
			)
	private Long id;
	private int semester;
	private String filiere;
	private HashMap<Matiere, Creneau> schedule = new HashMap<Matiere, Creneau>();
	
	public Emploi(int semester,String filiere) {
		this.setSemester(semester);
		this.setFiliere(filiere);
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	
	public void genererEmploi(ArrayList<Matiere> courses,ArrayList<Creneau> creneaux) {
		HashMap<Matiere, Creneau> schedule = new HashMap<Matiere, Creneau>();
		ArrayList<Creneau> shallowCreneau = new ArrayList<Creneau>();
		shallowCreneau = (ArrayList<Creneau>) creneaux.clone();
		//Iterator iterCourses = courses.iterator();
		//Iterator iterCreneaux = creneaux.iterator();
		int counterr=0;
		for(Matiere cours: courses) {
			
			schedule.put(cours, shallowCreneau.get(counterr));		
			shallowCreneau.remove(counterr);
			
		}
		this.setSchedule(schedule);
		return;
		
	}

	public HashMap<Matiere, Creneau> getSchedule() {
		return schedule;
	}

	public void setSchedule(HashMap<Matiere, Creneau> schedule) {
		this.schedule = schedule;
	}
}

