package SpringProject.EnsamCasa.seance;

import javax.persistence.*;

import SpringProject.EnsamCasa.emploi.Emploi;
import SpringProject.EnsamCasa.matiere.Matiere;
import SpringProject.EnsamCasa.professeur.Professeur;
import SpringProject.EnsamCasa.salle.Salle;

@Entity
@Table
public class Seance {
	@Id
	@SequenceGenerator(
			name = "seance_sequence",
			sequenceName = "seance_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seance_sequence"
			)
	private Long id;
	private Integer heurDeb;
	private Integer heurFin;
	private String jour;
    @ManyToOne
    @JoinColumn(name = "idSalle")
    private Salle salle;
    @ManyToOne
    @JoinColumn(name = "idMatiere")
    private Matiere matiere;
    @ManyToOne
    @JoinColumn(name = "idProf")
    private Professeur professeur;
    
    @ManyToOne
    @JoinColumn(name = "idEmploi")
    private Emploi emploi;
    
	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Seance() {
		super();
	}

	public Emploi getEmploi() {
		return emploi;
	}

	public void setEmploi(Emploi emploi) {
		this.emploi = emploi;
	}

	public Seance(Integer heurDeb, Integer heurFin, String jour, Salle salle, Matiere matiere, Professeur professeur) {
		super();
		this.heurDeb = heurDeb;
		this.heurFin = heurFin;
		this.jour = jour;
		this.salle = salle;
		this.matiere = matiere;
		this.professeur = professeur;
	}
	
	public Seance(Integer heurDeb, Integer heurFin, String jour, Matiere matiere, Professeur professeur, Emploi emploi) {
		super();
		this.emploi=emploi;
		this.heurDeb = heurDeb;
		this.heurFin = heurFin;
		this.jour = jour;
		this.matiere = matiere;
		this.professeur = professeur;
	}

	public Seance(Long id, Integer heurDeb, Integer heurFin, String jour, Salle salle, Matiere matiere,
			Professeur professeur) {
		super();
		this.id = id;
		this.heurDeb = heurDeb;
		this.heurFin = heurFin;
		this.jour = jour;
		this.salle = salle;
		this.matiere = matiere;
		this.professeur = professeur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getHeurDeb() {
		return heurDeb;
	}

	public void setHeurDeb(Integer heurDeb) {
		this.heurDeb = heurDeb;
	}

	public Integer getHeurFin() {
		return heurFin;
	}

	public void setHeurFin(Integer heurFin) {
		this.heurFin = heurFin;
	}

	public String getJour() {
		return this.jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}
	
	
}
