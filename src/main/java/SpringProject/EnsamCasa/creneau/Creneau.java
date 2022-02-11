package SpringProject.EnsamCasa.creneau;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Creneau {
	@Id
	@SequenceGenerator(
			name = "creneau_sequence",
			sequenceName = "creneau_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "creneau_sequence"
			)
		private Long id;
		private int startTime;
		private int endTime;
		private String day;
		private String daytime;
		
		public Creneau() {
			
		}
		
		public Creneau(int startTime,int endTime,String day,String daytime) {
			this.setStartTime(startTime);
			this.setEndTime(endTime);
			this.setDay(day);
			this.setDaytime(daytime);
		}

		public int getStartTime() {
			return startTime;
		}

		public void setStartTime(int startTime) {
			this.startTime = startTime;
		}

		public int getEndTime() {
			return endTime;
		}

		public void setEndTime(int endTime) {
			this.endTime = endTime;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDaytime() {
			return daytime;
		}

		public void setDaytime(String daytime) {
			this.daytime = daytime;
		}
		
	}


