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
	@Autowired SalleService salleService;
	@Autowired SeanceService seanceService;
	@Autowired ProfesseurService professeurService;

	
	@GetMapping("/")
	public String index(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
		return "index";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		AppUser user = null;
		if (principal instanceof AppUser) {
			user = (AppUser)principal;
			}
		model.addAttribute("user", user);
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
	public String emplois(Model model, @RequestParam(required=false) String filiere) {
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
	
	@PostMapping("/reserverSalle")
	public String reserverSallePost(@ModelAttribute("reservation") Reservation reservation, Model model) {
		reservationRepository.save(reservation);
		return "redirect:/";
	}
	

}
