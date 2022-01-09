package SpringProject.EnsamCasa.etudiant;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.*;

import SpringProject.EnsamCasa.classe.Classe;
@Entity
@Table
public class Etudiant {
	
	@Id
	@SequenceGenerator(
			name = "etudiant_sequence",
			sequenceName = "etudiant_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "etudiant_sequence"
			)
	private Long id;
	private String code_apogee;
	private String niveau;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private LocalDate dateNaiss;
	@Transient
	private Integer age;
	@ManyToOne
    @JoinColumn(name = "idClasse")
    private Classe classe;
	
	public Etudiant() {
		super();
	}

	public Etudiant(String code_apogee, String niveau, String nom, String prenom, String tel, String email,
			LocalDate dateNaiss) {
		super();
		this.code_apogee = code_apogee;
		this.niveau = niveau;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.dateNaiss = dateNaiss;
	}

	public Etudiant(String code_apogee, String niveau, String nom, String prenom, String tel, String email,
			LocalDate dateNaiss, Integer age, Classe classe) {
		super();
		this.code_apogee = code_apogee;
		this.niveau = niveau;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.dateNaiss = dateNaiss;
		this.age = age;
		this.classe = classe;
	}

	public Etudiant(Long id, String code_apogee, String niveau, String nom, String prenom, String tel, String email,
			LocalDate dateNaiss, Integer age, Classe classe) {
		super();
		this.id = id;
		this.code_apogee = code_apogee;
		this.niveau = niveau;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.dateNaiss = dateNaiss;
		this.age = age;
		this.classe = classe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode_apogee() {
		return code_apogee;
	}

	public void setCode_apogee(String code_apogee) {
		this.code_apogee = code_apogee;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public Integer getAge() {
		return Period.between(this.dateNaiss, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
}
