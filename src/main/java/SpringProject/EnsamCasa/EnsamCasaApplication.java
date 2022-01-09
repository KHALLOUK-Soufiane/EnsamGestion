package SpringProject.EnsamCasa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringProject.EnsamCasa.creneau.Creneau;
import SpringProject.EnsamCasa.creneau.CreneauRepository;
import SpringProject.EnsamCasa.emploi.Emploi;
import SpringProject.EnsamCasa.emploi.EmploiRepository;
import SpringProject.EnsamCasa.etudiant.Etudiant;
import SpringProject.EnsamCasa.etudiant.EtudiantRepository;
import SpringProject.EnsamCasa.matiere.Matiere;
import SpringProject.EnsamCasa.matiere.MatiereRepository;
import SpringProject.EnsamCasa.professeur.Professeur;
import SpringProject.EnsamCasa.professeur.ProfesseurRepository;
import SpringProject.EnsamCasa.salle.Salle;
import SpringProject.EnsamCasa.salle.SalleRepository;
import SpringProject.EnsamCasa.seance.Seance;
import SpringProject.EnsamCasa.seance.SeanceRepository;


@SpringBootApplication
public class EnsamCasaApplication implements CommandLineRunner{
	
	@Autowired SeanceRepository ob1;
    @Autowired EtudiantRepository ob;
    @Autowired ProfesseurRepository ob2;
    @Autowired SalleRepository ob3;
    @Autowired CreneauRepository ob4;
    @Autowired MatiereRepository ob5;
    @Autowired EmploiRepository ob6;



	public static void main(String[] args) {
		SpringApplication.run(EnsamCasaApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception
    {
		Etudiant student = new Etudiant("1562032", "2eme annee", "stuNom", "stuPrenom", "651261879", "g@r.com", LocalDate.of(2005, Month.AUGUST, 25));
        ob.save(student);
        Salle s = new Salle("adskfjaldssalle",30,1);
        ob3.save(s);
        
		ArrayList<Matiere> cours = new ArrayList<Matiere>();
		ArrayList<Creneau> creneau = new ArrayList<Creneau>();
		Emploi emp1 = new Emploi(1,"IAGI");
		
		Matiere c1 = new Matiere("php","zakrani");
		Matiere c2 = new Matiere("html","moutachaouik");
		Matiere c3 = new Matiere("mongodb","chergui");
		Matiere c4 = new Matiere("merise","elfaquih");
		Matiere c5 = new Matiere("Linux","chergui");
		Matiere c6 = new Matiere("java","zakrani");
		Matiere c7 = new Matiere("oracle","Hain");
		Matiere c8 = new Matiere("Machine Learning","elfaquih");
		Matiere c9 = new Matiere("Analyse data","Azmi");
		Matiere c10 = new Matiere("sport","soussi");
		Matiere c11 = new Matiere("securite","bahnass");
		Matiere c12 = new Matiere("python","Hain");
		Matiere c14 = new Matiere("Analyse 1","Laaraj");
		Matiere c13 = new Matiere("Algebre 2","Tsouli");
		Matiere c15 = new Matiere("Algebre 1","Tsouli");
		Matiere c16 = new Matiere("Design pattern","zakrani");
		Matiere c17= new Matiere("Anglais","khayma");
		Matiere c18 = new Matiere("espagnol","haddioui");
		Matiere c19 = new Matiere("Administration","bahnass");
		Matiere c20 = new Matiere("jee","Elfaquih");
		Matiere c21 = new Matiere("Algebre 1","Tsouli");
		Matiere c22 = new Matiere("Design pattern","zakrani");
		Matiere c23= new Matiere("Anglais","khayma");
		Matiere c24 = new Matiere("espagnol","haddioui");
		Matiere c25 = new Matiere("Administration","bahnass");
	
		
		cours.add(c1);
		cours.add(c2);
		cours.add(c3);
		cours.add(c4);
		cours.add(c5);
		cours.add(c6);
		cours.add(c7);
		cours.add(c8);
		cours.add(c9);
		cours.add(c10);
		cours.add(c11);
		cours.add(c12);
		cours.add(c13);
		cours.add(c14);
		cours.add(c15);
		cours.add(c16);
		cours.add(c17);
		cours.add(c18);
		cours.add(c19);
		cours.add(c20);
		
	
		


		
		ob5.saveAll(cours);
		Creneau cr1 = new Creneau(800,1000,"Lundi");
		Creneau cr2 = new Creneau(1015,1215,"Lundi");
		
		Creneau cr4 = new Creneau(1400,1600,"Lundi");
		Creneau cr5 = new Creneau(1615,1815,"Lundi");
		Creneau cr6 = new Creneau(800,1000,"Mardi");
		Creneau cr7 = new Creneau(1015,1215,"Mardi");
	
		Creneau cr9 = new Creneau(1400,1600,"Mardi");
		Creneau cr10 = new Creneau(1615,1815,"Mardi");
		Creneau cr11 = new Creneau(800,1000,"Mercredi");
		Creneau cr12 = new Creneau(1015,1215,"Mercredi");
		
		Creneau cr14 = new Creneau(1400,1600,"Mercredi");
		Creneau cr15 = new Creneau(1615,1815,"Mercredi");
		Creneau cr16 = new Creneau(800,1000,"Jeudi");
		Creneau cr17 = new Creneau(1015,1215,"Jeudi");
	
		Creneau cr19 = new Creneau(1400,1600,"Jeudi");
		Creneau cr20 = new Creneau(1615,1815,"Jeudi");
		Creneau cr21 = new Creneau(800,1000,"Vendredi");
		Creneau cr22 = new Creneau(1015,1215,"Vendredi");
		
		Creneau cr24 = new Creneau(1400,1600,"Vendredi");
		Creneau cr25 = new Creneau(1615,1815,"Vendredi");
		
		
		creneau.add(cr1);
		creneau.add(cr2);
		creneau.add(cr4);
		creneau.add(cr5);
		creneau.add(cr6);
		creneau.add(cr7);	
		creneau.add(cr9);
		creneau.add(cr10);
		System.out.println("first one "+creneau.size());
		creneau.add(cr11);
		creneau.add(cr12);
		creneau.add(cr14);
		creneau.add(cr15);
		creneau.add(cr16);
		creneau.add(cr17);
		System.out.println("second one "+creneau.size());
		creneau.add(cr19);
		creneau.add(cr20);
		creneau.add(cr21);
		creneau.add(cr22);
		creneau.add(cr24);
		creneau.add(cr25);
		System.out.println("third one "+creneau.size());
		ob4.saveAll(creneau);
		
		emp1.genererEmploi(cours, creneau);
		HashMap<Matiere, Creneau> schedule = new HashMap<Matiere, Creneau>();
		
		schedule=emp1.getSchedule();
		int counterr=0;
		for(Matiere cours1: cours) {
			
			int sTime=schedule.get(cours1).getStartTime();
			int eTime=schedule.get(cours1).getEndTime();
			String day=schedule.get(cours1).getDay();
			
			String namC = cours1.getName();
			String profC = cours1.getProf();
			
			Professeur p1= new Professeur(profC);
			
			ob2.save(p1);
			Seance s1=new Seance(sTime,eTime,day,cours1,p1);
			
			
			schedule.put(cours1, creneau.get(counterr));
			counterr++;
			System.out.println(counterr);
			System.out.println(creneau.size());
			ob1.save(s1);
		}
		
		
	//        Professeur y = new Professeur("WA515421", "prnom", "prprenom", "email@f.com", "6542132");
//        ob2.save(y);
//        Seance address = new Seance(8, 10, "Mardi", student, s, y);
//        ob1.save(address);
    }
}
