package SpringProject.EnsamCasa.professeur;

import java.util.Set;

import javax.persistence.*;

import SpringProject.EnsamCasa.seance.Seance;

@Entity
@Table
public class Professeur {
	@Id
	@SequenceGenerator(
			name = "professeur_sequence",
			sequenceName = "professeur_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "professeur_sequence"
			)
	private Long id;
	private String CIN;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Seance> seances;
	
	public Professeur() {
		super();
	}
	
	public Professeur(String cIN, String nom, String prenom, String email, String tel) {
		super();
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}
	
	public Professeur(String nom) {
		super();
		this.nom = nom;
	}

	public Professeur(Long id, String cIN, String nom, String prenom, String email, String tel) {
		super();
		this.id = id;
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public Set<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}
	
}
