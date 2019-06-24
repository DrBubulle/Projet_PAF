package com.inti.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.IMetier.IUtilisateurMetier;
import com.inti.formation.Model.Utilisateur;


@RestController
@CrossOrigin("*")
@RequestMapping("/apiUtilisateur")
public class UtilisateurRestController {

	@Autowired
	private IUtilisateurMetier metier;

	public IUtilisateurMetier getMetier() {
		return metier;
	}

	public void setMetier(IUtilisateurMetier metier) {
		this.metier = metier;
	}
	
	@RequestMapping(value="/ajouterUt", method=RequestMethod.POST)
	public Utilisateur ajouter (@RequestBody Utilisateur u) {
		return metier.ajouter(u);
	}
	
	@RequestMapping(value="/updateUt", method=RequestMethod.PUT)
	public Utilisateur update (@RequestBody Utilisateur u) {
		return metier.update(u);
	}
	
	@RequestMapping(value="deleteUt/{idUtilisateur}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("idUtilisateur")long idUtilisateur) {
		metier.delete(idUtilisateur);
	}
	
	@RequestMapping(value="/utilisateur/{idUtilisateur}",method=RequestMethod.GET)
	public Utilisateur findOne (@PathVariable("idUtilisateur")long idUtilisateur) {
		return metier.findOne(idUtilisateur);
	}
	
	@RequestMapping(value="/utilisateurs", method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return metier.findAll();
	}
	
	@RequestMapping(value="/Eutilisateur/{Email}", method=RequestMethod.GET)
	public List<Utilisateur> getByEmail(@PathVariable("Email") String email){
		return metier.findByEmail(email);
	}
}
