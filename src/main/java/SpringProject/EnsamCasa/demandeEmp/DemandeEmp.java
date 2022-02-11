package SpringProject.EnsamCasa.demandeEmp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import SpringProject.EnsamCasa.appuser.AppUser;
import SpringProject.EnsamCasa.creneau.Creneau;
import SpringProject.EnsamCasa.matiere.Matiere;
import SpringProject.EnsamCasa.salle.Salle;


@Entity
@Table
public class DemandeEmp {
	
	@Id
	@SequenceGenerator(
			name = "demande_sequence",
			sequenceName = "demande_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "demande_sequence"
			)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "idCreneau")
	private Creneau creneau;
	@ManyToOne
	@JoinColumn(name = "idMatiere")
	private Matiere matiere;
	
	public DemandeEmp() {
		super();
	}
	
	public DemandeEmp(Long id, Matiere matiere, Creneau creneau) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.creneau = creneau;
	}
	
	public DemandeEmp(Matiere matiere, Creneau creneau) {
		super();
		this.matiere = matiere;
		this.creneau = creneau;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	
}
