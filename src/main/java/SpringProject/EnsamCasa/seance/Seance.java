package SpringProject.EnsamCasa.seance;

import javax.persistence.*;

import SpringProject.EnsamCasa.creneau.Creneau;
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
	@ManyToOne
	@JoinColumn(name = "idCreneau")
	private Creneau creneau;
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

	public Seance(Creneau creneau, Salle salle, Matiere matiere, Professeur professeur) {
		super();
		this.creneau = creneau;
		this.salle = salle;
		this.matiere = matiere;
		this.professeur = professeur;
	}
	
	public Seance(Creneau creneau, Matiere matiere, Professeur professeur, Emploi emploi) {
		super();
		this.emploi=emploi;
		this.creneau = creneau;
		this.matiere = matiere;
		this.professeur = professeur;
	}

	public Seance(Long id, Creneau creneau, Salle salle, Matiere matiere,
			Professeur professeur) {
		super();
		this.id = id;
		this.creneau = creneau;
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

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
	
	
}
