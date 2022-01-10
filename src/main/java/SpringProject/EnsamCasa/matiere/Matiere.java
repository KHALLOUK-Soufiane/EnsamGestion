package SpringProject.EnsamCasa.matiere;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import SpringProject.EnsamCasa.classe.Classe;
import SpringProject.EnsamCasa.professeur.Professeur;



@Entity
@Table
public class Matiere {
	@Id
	@SequenceGenerator(
			name = "matiere_sequence",
			sequenceName = "matiere_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "matiere_sequence"
			)
		private Long id;
		private String name;
	    @ManyToOne
	    @JoinColumn(name = "idProf")
	    private Professeur professeur;
	    @ManyToOne
	    @JoinColumn(name = "idClasse")
	    private Classe classe;
		
		public Matiere() {
			super();
		}
		
		public Matiere(String name,Professeur prof,Classe classe) {
			this.name=name;
			this.professeur=prof;
			this.classe = classe;
			}

		public Classe getClasse() {
			return classe;
		}

		public void setClasse(Classe classe) {
			this.classe = classe;
		}

		public Professeur getProfesseur() {
			return professeur;
		}

		public void setProfesseur(Professeur professeur) {
			this.professeur = professeur;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		

	}


