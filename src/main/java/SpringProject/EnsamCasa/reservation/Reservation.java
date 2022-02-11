package SpringProject.EnsamCasa.reservation;

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
import SpringProject.EnsamCasa.salle.Salle;


@Entity
@Table
public class Reservation {
	
	@Id
	@SequenceGenerator(
			name = "reservation_sequence",
			sequenceName = "reservation_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "reservation_sequence"
			)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "idSalle")
	private Salle salle;
	@ManyToOne
	@JoinColumn(name = "idUser")
	private AppUser appuser;
	@ManyToOne
	@JoinColumn(name = "idCreaneau")
	private Creneau creneau;
	
	public Reservation() {
		super();
	}
	
	public Reservation(Long id, Salle salle, AppUser appUser, Creneau creneau) {
		super();
		this.id = id;
		this.salle = salle;
		this.appuser = appUser;
		this.creneau = creneau;
	}
	
	public Reservation(Salle salle, AppUser appUser, Creneau creneau) {
		super();
		this.salle = salle;
		this.appuser = appUser;
		this.creneau = creneau;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public AppUser getAppuser() {
		return appuser;
	}

	public void setAppuser(AppUser appUser) {
		this.appuser = appUser;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}
	
	
}
