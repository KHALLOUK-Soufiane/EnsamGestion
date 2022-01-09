package SpringProject.EnsamCasa.classe;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import SpringProject.EnsamCasa.etudiant.Etudiant;
@Entity
@Table
public class Classe {
	@Id
	@SequenceGenerator(
			name = "classe_sequence",
			sequenceName = "classe_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "classe_sequence"
			)
	private Long id;
	private int niveau;
	private String libelle;
	private String filiere;
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
	
	public Classe() {
		super();
	}
	
	public Classe(int niveau, String libelle, String filiere) {
		super();
		this.niveau = niveau;
		this.libelle = libelle;
		this.filiere = filiere;
	}
	
	public Classe(Long id, int niveau, String libelle, String filiere) {
		super();
		this.id = id;
		this.niveau = niveau;
		this.libelle = libelle;
		this.filiere = filiere;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getFiliere() {
		return this.filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
}
