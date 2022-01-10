package SpringProject.EnsamCasa.emploi;

import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import SpringProject.EnsamCasa.matiere.Matiere;
import SpringProject.EnsamCasa.classe.Classe;
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

    @ManyToOne
    @JoinColumn(name = "idClasse")
	private Classe classe;
    
	
	public Emploi(int semester,Classe classe) {
		this.setSemester(semester);
		this.setClasse(classe);
	}
	
	
	
	public int getSemester() {
		return semester;
	}
	
	
	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	@SuppressWarnings("unchecked")
	public HashMap<Matiere, Creneau> genererEmploi(ArrayList<Matiere> courses,ArrayList<Creneau> creneaux) {
		HashMap<Matiere, Creneau> schedule = new HashMap<Matiere, Creneau>();
		ArrayList<Creneau> shallowCreneau = new ArrayList<Creneau>();
		shallowCreneau = (ArrayList<Creneau>) creneaux.clone();
		//Iterator iterCourses = courses.iterator();
		//Iterator iterCreneaux = creneaux.iterator();
		int counterr=0;
		for(Matiere cours: courses) {
			//pick only courses in the required filiere 
			
			if(classe.getFiliere() == cours.getClasse().getFiliere() && classe.getNiveau() == cours.getClasse().getNiveau()) {
				schedule.put(cours, shallowCreneau.get(counterr));	
				shallowCreneau.remove(counterr); 

				
			}
			
			
		}
		return schedule;
		
	}


}

