package SpringProject.EnsamCasa.salle;

import java.util.Set;

import javax.persistence.*;

import SpringProject.EnsamCasa.seance.Seance;

@Entity
@Table
public class Salle {
	@Id
	@SequenceGenerator(
			name = "salle_sequence",
			sequenceName = "salle_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "salle_sequence"
			)
	private Long id;
	private String libelle;
	private Integer capacite;
	private Integer etage;
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Seance> seances;
	
	public Set<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	public Salle() {
		super();
	}
	
	public Salle(Long id, String libelle, Integer capacite, Integer etage) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.capacite = capacite;
		this.etage = etage;
	}
	
	public Salle(String libelle, Integer capacite, Integer etage) {
		super();
		this.libelle = libelle;
		this.capacite = capacite;
		this.etage = etage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public Integer getEtage() {
		return etage;
	}

	public void setEtage(Integer etage) {
		this.etage = etage;
	}
}
