package SpringProject.EnsamCasa.matiere;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



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
		private String prof;
		
		public Matiere() {
			super();
		}
		
		public Matiere(String name,String prof) {
			this.name=name;
			this.prof=prof;
			}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getProf() {
			return prof;
		}

		public void setProf(String prof) {
			this.prof = prof;
		}
		

	}


