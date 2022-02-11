package SpringProject.EnsamCasa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringProject.EnsamCasa.appuser.AppUser;
import SpringProject.EnsamCasa.appuser.AppUserRepository;
import SpringProject.EnsamCasa.appuser.AppUserRole;
import SpringProject.EnsamCasa.classe.Classe;
import SpringProject.EnsamCasa.classe.ClasseRepository;
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
    @Autowired ClasseRepository ob7;
    @Autowired AppUserRepository ob8;




	public static void main(String[] args) {
		SpringApplication.run(EnsamCasaApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception
    {
		Etudiant student = new Etudiant("1562032", "2eme annee", "stuNom", "stuPrenom", "651261879", "g@r.com", LocalDate.of(2005, Month.AUGUST, 25));
        ob.save(student);
        Salle s = new Salle("Salle 1",30,1);
        Salle s2 = new Salle("Salle 2",30,1);
        Salle s3 = new Salle("Salle 3",30,1);
        Salle s4 = new Salle("Salle 4",30,1);
        Salle s5 = new Salle("Salle 5",30,1);
        ob3.save(s);
        ob3.save(s2);
        ob3.save(s3);
        ob3.save(s4);
        ob3.save(s5);
        Classe iagi1 = new Classe(3,"1ere annee IAGI","IAGI");
        ob7.save(iagi1);
        Classe iagi2 = new Classe(4,"2eme annee IAGI","IAGI");
        ob7.save(iagi2);

        Classe api1 = new Classe(1,"1ere annee cycle preparatoire","API1");
        ob7.save(api1);

        //ajout des utilisateurs
        AppUser pElfaquih = new AppUser("Loubna","Elfaquih","$2a$10$SsIq9yfsy9P7MXW71Z/7Tuq4.VfQbfscPVURXVd5/IBbu1VkOKzyW","Elfaquih@ensam-casa.ma",AppUserRole.PROFESSOR,false,true,"H223153");
        AppUser pZekrani = new AppUser("Abdelali","Zekrani","$2a$10$SsIq9yfsy9P7MXW71Z/7Tuq4.VfQbfscPVURXVd5/IBbu1VkOKzyW","Zekrani@ensam-casa.ma",AppUserRole.PROFESSOR,false,true,"HE489751");
        AppUser eYahya = new AppUser("Aloui","Yahya","$2a$10$SsIq9yfsy9P7MXW71Z/7Tuq4.VfQbfscPVURXVd5/IBbu1VkOKzyW","Aloui@ensam-casa.ma",AppUserRole.STUDENT,false,true,"H1");
        AppUser eAli = new AppUser("Makouar","Ali","$2a$10$SsIq9yfsy9P7MXW71Z/7Tuq4.VfQbfscPVURXVd5/IBbu1VkOKzyW","Makouar@ensam-casa.ma",AppUserRole.STUDENT,false,true,"H2");
        AppUser eSoufiane = new AppUser("Khallouk","Soufiane","$2a$10$SsIq9yfsy9P7MXW71Z/7Tuq4.VfQbfscPVURXVd5/IBbu1VkOKzyW","Khallouk@ensam-casa.ma",AppUserRole.STUDENT,false,true,"H3");
        AppUser aBessas = new AppUser("Bessas","Bouchra","$2a$10$SsIq9yfsy9P7MXW71Z/7Tuq4.VfQbfscPVURXVd5/IBbu1VkOKzyW","Bessas@ensam-casa.ma",AppUserRole.ADMIN,false,true,"H4");
        ob8.save(pElfaquih);
        ob8.save(pZekrani);
        ob8.save(eYahya);
        ob8.save(eAli);
        ob8.save(eSoufiane);
        ob8.save(aBessas);
        
        
        
		ArrayList<Matiere> cours = new ArrayList<Matiere>();
		ArrayList<Creneau> creneau = new ArrayList<Creneau>();
		Emploi emp1 = new Emploi(1,iagi1);
		Emploi emp2 = new Emploi(1,iagi2);
		
		Professeur prof=new Professeur("HE489751", "zakrani", "abdali", "zakrani@email.com", "1234567890");
		Professeur prof2= new Professeur("H223153","Elfaquih","Loubna","Elfaquih@email.com","061231231");
		Professeur prof3= new Professeur("FR874521","Chergui","Adil","Chergui@email.com","134568754");
		Professeur prof4= new Professeur("VB125487","Hain","Mustapha","Hain@email.com","061231231");
		ob2.save(prof);
		ob2.save(prof2);
		ob2.save(prof3);
		ob2.save(prof4);
		Matiere c1 = new Matiere("php",prof3,iagi1);
		Matiere c2 = new Matiere("html",prof,iagi1);
		Matiere c3 = new Matiere("mongodb",prof,iagi2);
		Matiere c4 = new Matiere("merise",prof2,iagi1);
		Matiere c5 = new Matiere("Linux",prof,iagi1);
		Matiere c6 = new Matiere("java",prof4,iagi1);
		Matiere c7 = new Matiere("oracle",prof3,iagi2);
		Matiere c8 = new Matiere("Machine Learning",prof,iagi2);
		Matiere c9 = new Matiere("Analyse data",prof2,iagi2);
		Matiere c10 = new Matiere("sport",prof2,iagi1);
		Matiere c11 = new Matiere("securite",prof3,iagi2);
		Matiere c12 = new Matiere("python",prof2,iagi1);
		Matiere c14 = new Matiere("Analyse 1",prof,api1);
		Matiere c13 = new Matiere("Algebre 2",prof,api1);
		Matiere c15 = new Matiere("Algebre 1",prof,api1);
		Matiere c16 = new Matiere("Design pattern",prof4,iagi2);
		Matiere c17= new Matiere("Anglais",prof4,iagi2);
		Matiere c18 = new Matiere("espagnol",prof4,iagi2);
		Matiere c19 = new Matiere("Administration Reseau",prof3,iagi2);
		Matiere c20 = new Matiere("jee",prof2,iagi2);
		Matiere c21 = new Matiere("Structures des donnees",prof4,iagi1);
		Matiere c22 = new Matiere("Language C",prof,iagi1);
		Matiere c23= new Matiere("francais",prof3,iagi2);
		Matiere c24 = new Matiere("espagnol",prof2,iagi2);
		Matiere c25 = new Matiere("Administration",prof3,iagi1);
		Matiere c26 = new Matiere("UML",prof,iagi1);
		Matiere c27 = new Matiere("SQL",prof,iagi1);
		
		System.out.println("teeeest="+c5.getProfesseur().getCIN());
		
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
		cours.add(c21);
		cours.add(c22);
		cours.add(c23);
		cours.add(c24);
		cours.add(c25);
		cours.add(c26);
		cours.add(c27);
		
		ob5.saveAll(cours);
		Creneau cr1 = new Creneau(800,1000,"Lundi","Lundi à 8h");
		Creneau cr2 = new Creneau(1015,1215,"Lundi","Lundi à 10h15");
		
		Creneau cr4 = new Creneau(1400,1600,"Lundi","Lundi à 14h");
		Creneau cr5 = new Creneau(1615,1815,"Lundi","Lundi à 16h15");
		Creneau cr6 = new Creneau(800,1000,"Mardi","Mardi à 8h");
		Creneau cr7 = new Creneau(1015,1215,"Mardi","Mardi à 10h15");
	
		Creneau cr9 = new Creneau(1400,1600,"Mardi","Mardi à 14h");
		Creneau cr10 = new Creneau(1615,1815,"Mardi","Mardi à 16h15");
		Creneau cr11 = new Creneau(800,1000,"Mercredi","Mercredi à 8h");
		Creneau cr12 = new Creneau(1015,1215,"Mercredi","Mercredi à 10h15");
		
		Creneau cr14 = new Creneau(1400,1600,"Mercredi","Mercredi à 14h");
		Creneau cr15 = new Creneau(1615,1815,"Mercredi","Mercredi à 16h15");
		Creneau cr16 = new Creneau(800,1000,"Jeudi","Jeudi à 8h");
		Creneau cr17 = new Creneau(1015,1215,"Jeudi","Jeudi à 10h15");
	
		Creneau cr19 = new Creneau(1400,1600,"Jeudi","Jeudi à 14h");
		Creneau cr20 = new Creneau(1615,1815,"Jeudi","Jeudi à 16h15");
		Creneau cr21 = new Creneau(800,1000,"Vendredi","Vendredi à 8h");
		Creneau cr22 = new Creneau(1015,1215,"Vendredi","Vendredi à 10h15");
		
		Creneau cr24 = new Creneau(1400,1600,"Vendredi","Vendredi à 14h");
		Creneau cr25 = new Creneau(1615,1815,"Vendredi","Vendredi à 16h15");
		
		
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
		
		HashMap<Matiere, Creneau> schedule = new HashMap<Matiere, Creneau>();
		schedule = emp1.genererEmploi(cours, creneau);
		HashMap<Matiere, Creneau> schedule2 = new HashMap<Matiere, Creneau>();
		schedule2 = emp2.genererEmploi(cours, creneau);
		ob6.save(emp1);
		ob6.save(emp2);
		
		genererSeance(schedule, emp1, cours, creneau);
		genererSeance(schedule2, emp2, cours, creneau);
		
		
//        Professeur y = new Professeur("WA515421", "prnom", "prprenom", "email@f.com", "6542132");
//        ob2.save(y);
//        Seance address = new Seance(8, 10, "Mardi", student, s, y);
//        ob1.save(address);
    }
	
	public void genererSeance(HashMap<Matiere, Creneau> schedule, Emploi emp1, ArrayList<Matiere> cours, ArrayList<Creneau> creneau) {
		int counterr=0;
		for(Matiere cours1: cours) {
			
			if(cours1.getClasse().getLibelle() == emp1.getClasse().getLibelle()) {
			Professeur profC = cours1.getProfesseur();

			Seance s1=new Seance(schedule.get(cours1),cours1,profC,emp1);
		
			schedule.put(cours1, creneau.get(counterr));
			
			counterr++;
		
			ob1.save(s1);
			System.out.println("saved");
			}
		}
	}
}
