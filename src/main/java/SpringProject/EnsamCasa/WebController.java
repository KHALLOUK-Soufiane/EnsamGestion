package SpringProject.EnsamCasa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import SpringProject.EnsamCasa.etudiant.Etudiant;
import SpringProject.EnsamCasa.etudiant.EtudiantController;
import SpringProject.EnsamCasa.salle.Salle;
import SpringProject.EnsamCasa.salle.SalleController;
import SpringProject.EnsamCasa.seance.Seance;
import SpringProject.EnsamCasa.seance.SeanceController;

@Controller
public class WebController {
	
	@Autowired EtudiantController etudiantController;
	@Autowired SalleController salleController;
	@Autowired SeanceController seanceController;

	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/etudiants")
	public String etudiants(Model model) {
		List<Etudiant> etudiants = etudiantController.getEtudiants();
		model.addAttribute("etudiants", etudiants);
		return "etudiants";
	}
	
	@GetMapping("/emplois")
	public String emplois(Model model) {
		List<Seance> seancesL = seanceController.getSeancesByDay("Lundi");
		List<Seance> seancesM = seanceController.getSeancesByDay("Mardi");
		List<Seance> seancesMe = seanceController.getSeancesByDay("Mercredi");
		List<Seance> seancesJ = seanceController.getSeancesByDay("Jeudi");
		List<Seance> seancesV = seanceController.getSeancesByDay("Vendredi");


		model.addAttribute("seancesL", seancesL);
		model.addAttribute("seancesM", seancesM);
		model.addAttribute("seancesMe", seancesMe);
		model.addAttribute("seancesJ", seancesJ);
		model.addAttribute("seancesV", seancesV);
		
		return "emplois";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/salles")
	public String salles(Model model) {
		List<Salle> salles = salleController.getSalles();
		model.addAttribute("salles", salles);
		return "salles";
	}
	
	@GetMapping("/ajouterEtudiant")
	public String ajouterEtudiant(Model model) {
		Etudiant etu = new Etudiant();
		model.addAttribute("etudiant", etu);
		return "ajouterEtudiant";
	}

	@GetMapping("/ajouterSalle")
	public String ajouterSalle(Model model) {
		Salle salle = new Salle();
		model.addAttribute("salle", salle);
		return "ajouterSalle";
	}
	
	@PostMapping("/ajouterEtudiant")
	public String ajouterEtudiantPost(@ModelAttribute("etudiant") Etudiant etu) {
		etudiantController.registerNewEtudiant(etu);
		return "redirect:etudiants";
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
}
