package SpringProject.EnsamCasa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import SpringProject.EnsamCasa.appuser.AppUser;
import SpringProject.EnsamCasa.creneau.Creneau;
import SpringProject.EnsamCasa.creneau.CreneauRepository;
import SpringProject.EnsamCasa.demandeEmp.DemandeEmp;
import SpringProject.EnsamCasa.demandeEmp.DemandeEmpRepository;
import SpringProject.EnsamCasa.etudiant.Etudiant;
import SpringProject.EnsamCasa.etudiant.EtudiantController;
import SpringProject.EnsamCasa.etudiant.EtudiantRepository;
import SpringProject.EnsamCasa.etudiant.EtudiantService;
import SpringProject.EnsamCasa.professeur.Professeur;
import SpringProject.EnsamCasa.professeur.ProfesseurController;
import SpringProject.EnsamCasa.professeur.ProfesseurRepository;
import SpringProject.EnsamCasa.professeur.ProfesseurService;
import SpringProject.EnsamCasa.reservation.Reservation;
import SpringProject.EnsamCasa.reservation.ReservationRepository;
import SpringProject.EnsamCasa.salle.Salle;
import SpringProject.EnsamCasa.salle.SalleController;
import SpringProject.EnsamCasa.salle.SalleRepository;
import SpringProject.EnsamCasa.salle.SalleService;
import SpringProject.EnsamCasa.seance.Seance;
import SpringProject.EnsamCasa.seance.SeanceController;
import SpringProject.EnsamCasa.seance.SeanceRepository;
import SpringProject.EnsamCasa.seance.SeanceService;

@Controller
public class WebController {
	
	@Autowired EtudiantController etudiantController;
	@Autowired SalleController salleController;
	@Autowired SeanceController seanceController;
	@Autowired ProfesseurController professeurController;
	@Autowired EtudiantService etudiantService;
	@Autowired EtudiantRepository etudiantRepository;
	@Autowired ProfesseurRepository professeurRepository;
	@Autowired SalleRepository salleRepository;
	@Autowired CreneauRepository creneauRepository;
	@Autowired ReservationRepository reservationRepository;
	@Autowired SeanceRepository seanceRepository;
	@Autowired DemandeEmpRepository demandeEmpRepository;
	@Autowired SalleService salleService;
	@Autowired SeanceService seanceService;
	@Autowired ProfesseurService professeurService;

	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		model.addAttribute("user", user);
		Long nbEtudiant=etudiantRepository.count();
		model.addAttribute("nbEtudiant",nbEtudiant);
		Long nbProf=professeurRepository.count();
		model.addAttribute("nbProf",nbProf);
		Long nbSalle=salleRepository.count();
		model.addAttribute("nbSalle",nbSalle);
		
		List<Reservation> reservations =  reservationRepository.findAll();
		model.addAttribute("reservations", reservations);
		
		List<DemandeEmp> demandes =  demandeEmpRepository.findAll();
		model.addAttribute("demandes", demandes);
		
		return "index";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		return "redirect:home";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Long nbEtudiant=etudiantRepository.count();
		model.addAttribute("nbEtudiant",nbEtudiant);
		Long nbProf=professeurRepository.count();
		model.addAttribute("nbProf",nbProf);
		Long nbSalle=salleRepository.count();
		model.addAttribute("nbSalle",nbSalle);
		return "home";
	}
	
	@GetMapping("/etudiants")
	public String etudiants(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		List<Etudiant> etudiants = etudiantController.getEtudiants();
		model.addAttribute("etudiants", etudiants);
		return "etudiants";
	}
	
	@GetMapping("/professeurs")
	public String professeurs(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		List<Professeur> professeurs = professeurController.getProfs();
		model.addAttribute("profs", professeurs);
		return "professeurs";
	}
	
	@GetMapping("/emplois")
	public String emplois(Model model, @RequestParam(required=false,defaultValue="IAGI1") String filiere) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
	
		model.addAttribute("user", user);
		Integer niveau;
		if(filiere != null) {
			niveau = Integer.parseInt(filiere.substring(filiere.length()-1));
			filiere = filiere.substring(0, filiere.length()-1);
		}
		else {
			filiere = "";
			niveau = 0;
		}
		
		List<Seance> seancesL = seanceController.getSeancesByDay("Lundi", filiere, niveau+2);
		List<Seance> seancesM = seanceController.getSeancesByDay("Mardi", filiere, niveau+2);
		List<Seance> seancesMe = seanceController.getSeancesByDay("Mercredi", filiere, niveau+2);
		List<Seance> seancesJ = seanceController.getSeancesByDay("Jeudi", filiere, niveau+2);
		List<Seance> seancesV = seanceController.getSeancesByDay("Vendredi", filiere, niveau+2);
		
		
		//seances afin d'avoir l'emploi de chaque prof
		List<Seance> seancesLProf = seanceController.getSeancesByDayProf("Lundi", user.getCIN());
		List<Seance> seancesMProf = seanceController.getSeancesByDayProf("Mardi", user.getCIN());
		List<Seance> seancesMeProf = seanceController.getSeancesByDayProf("Mercredi", user.getCIN());
		List<Seance> seancesJProf = seanceController.getSeancesByDayProf("Jeudi", user.getCIN());
		List<Seance> seancesVProf = seanceController.getSeancesByDayProf("Vendredi", user.getCIN());
		model.addAttribute("seancesLProf", seancesLProf);
		model.addAttribute("seancesMProf", seancesMProf);
		model.addAttribute("seancesMeProf", seancesMeProf);
		model.addAttribute("seancesJProf", seancesJProf);
		model.addAttribute("seancesVProf", seancesVProf);
		
		//fin seance emploi prof
		model.addAttribute("filiere", filiere);
		if(filiere != null) {
			model.addAttribute("seancesL", seancesL);
			model.addAttribute("seancesM", seancesM);
			model.addAttribute("seancesMe", seancesMe);
			model.addAttribute("seancesJ", seancesJ);
			model.addAttribute("seancesV", seancesV);
		}
		
		return "emplois";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		return "login";
	}
	
	@GetMapping("/salles")
	public String salles(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		List<Salle> salles = salleController.getSalles();
		model.addAttribute("salles", salles);
		return "salles";
	}
	
	@GetMapping("/ajouterEtudiant")
	public String ajouterEtudiant(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Etudiant etu = new Etudiant();
		model.addAttribute("etudiant", etu);
		return "ajouterEtudiant";
	}
	
	@GetMapping("/ajouterProfesseur")
	public String ajouterProfesseur(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Professeur prof = new Professeur();
		model.addAttribute("professeur", prof);
		return "ajouterProfesseur";
	}

	@GetMapping("/ajouterSalle")
	public String ajouterSalle(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Salle salle = new Salle();
		model.addAttribute("salle", salle);
		return "ajouterSalle";
	}
	
	@PostMapping("/ajouterEtudiant")
	public String ajouterEtudiantPost(@ModelAttribute("etudiant") Etudiant etu) {
		etudiantController.registerNewEtudiant(etu);
		return "redirect:etudiants";
	}
	
	@PostMapping("/ajouterProfesseur")
	public String ajouterProfesseurPost(@ModelAttribute("professeur") Professeur prof) {
		professeurController.registerNewProf(prof);
		return "redirect:professeurs";
	}
	
	@PostMapping("/ajouterSalle")
	public String ajouterSallePost(@ModelAttribute("salle") Salle salle) {
		salleController.registerNewSalle(salle);
		return "redirect:salles";
	}
	
	@PostMapping("/deleteEtudiant")
	public String deleteEtudiant(@RequestParam Long id) {
		etudiantController.deleteEtudiant(id);
		return "redirect:etudiants";
	}
	
	@PostMapping("/deleteSalle")
	public String deleteSalle(@RequestParam Long id) {
		salleController.deleteSalle(id);
		return "redirect:salles";
	}

	@PostMapping("/deleteProfesseur")
	public String deleteProfesseur(@RequestParam Long id) {
		professeurController.deleteProfesseur(id);
		return "redirect:professeurs";
	}
	
	@GetMapping("/modifierEtudiant")
	public String modifierEtudiant(Model model, @RequestParam Long id) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Etudiant etu = new Etudiant();
		model.addAttribute("etudiant", etu);
		model.addAttribute("etudiantExistant", etudiantRepository.findById(id).get());
		model.addAttribute("filiere", etudiantRepository.findById(id).get().getNiveau());
		return "modifierEtudiant";
	}
	
	@PostMapping("/modifierEtudiant")
	public String modifierEtudiantPost(@ModelAttribute("etudiant") Etudiant etu) {
		etudiantService.updateEtudiant(etu.getId(), etu);
		return "redirect:etudiants";
	}
	
	@GetMapping("/modifierProfesseur")
	public String modifierProfesseur(Model model, @RequestParam Long id) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Professeur prof = new Professeur();
		model.addAttribute("professeur", prof);
		model.addAttribute("professeurExistant", professeurRepository.findById(id).get());
		return "modifierProfesseur";
	}
	
	@PostMapping("/modifierProfesseur")
	public String modifierProfesseurPost(@ModelAttribute("professeur") Professeur prof) {
		professeurService.updateProfesseur(prof.getId(), prof);
		return "redirect:professeurs";
	}
	
	@GetMapping("/modifierSalle")
	public String modifierSalle(Model model, @RequestParam Long id) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		Salle salle = new Salle();
		model.addAttribute("salle", salle);
		model.addAttribute("salleExistante", salleRepository.findById(id).get());
		return "modifierSalle";
	}
	
	@PostMapping("/modifierSalle")
	public String modifierSallePost(@ModelAttribute("Salle") Salle salle) {
		salleService.updateSalle(salle.getId(), salle);
		return "redirect:salles";
	}
	
	@GetMapping("/reserverSalle")
	public String reserverSalle(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		
		Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		
		List<Salle> salles = salleRepository.findAll();
		List<Creneau> creneaux = creneauRepository.findAll();
		model.addAttribute("salles", salles);
		model.addAttribute("creneaux", creneaux);
		
		return "reserverSalle";
	}
	@GetMapping("/emploiProf")
	public String emploiProf(Model model,@RequestParam(required=false,defaultValue="H223153") String cin) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		
		
		
		List<Salle> salles = salleRepository.findAll();
		List<Creneau> creneaux = creneauRepository.findAll();
		model.addAttribute("salles", salles);
		model.addAttribute("creneaux", creneaux);
		
		return "emploiProf";
	}
	@PostMapping("/emploiProf")
	public String emploiProf(@ModelAttribute("reservation") Reservation reservation, Model model) {
		reservationRepository.save(reservation);
		return "redirect:/emploiProf";
	}
	@PostMapping("/reserverSalle")
	public String reserverSallePost(@ModelAttribute("reservation") Reservation reservation, Model model) {
		reservationRepository.save(reservation);
		return "redirect:/reserverSalle";
	}
	
	@GetMapping("/modifierEmploi")
	public String modifierEmploi(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
		}
		model.addAttribute("user", user);
		
		DemandeEmp demandeEmp = new DemandeEmp();
		model.addAttribute("demandeEmp", demandeEmp);
		
		List<Seance> seances = seanceRepository.findAll();
		model.addAttribute("sea", seances);
		
		return "modifierEmploi";
	}
	
	@PostMapping("/modifierEmploi")
	public String modifierEmploiPost(@ModelAttribute("demandeEmp") DemandeEmp demandeEmp) {
		demandeEmpRepository.save(demandeEmp);
		return "redirect:modifierEmploi";
	}
	


}
