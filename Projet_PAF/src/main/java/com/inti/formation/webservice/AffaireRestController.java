package com.inti.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.IMetier.IAffaireMetier;
import com.inti.formation.IMetier.IDocumentMetier;
import com.inti.formation.Model.Affaire;
import com.inti.formation.Model.Document;

@RestController
@CrossOrigin("*")
@RequestMapping("/apiAffaire")
public class AffaireRestController {

	@Autowired
	private IAffaireMetier metier;

	public IAffaireMetier getMetier() {
		return metier;
	}

	public void setMetier(IAffaireMetier metier) {
		this.metier = metier;
	}
	


	@RequestMapping(value = "/ajouterAffaire", method=RequestMethod.POST)
	public Affaire ajouter(@RequestBody Affaire a) {
		return metier.ajouter(a);
	}
	
	@RequestMapping(value="/updateAffaire", method=RequestMethod.PUT)
	public Affaire update(@RequestBody Affaire a) {
		return metier.update(a);
	}
	
	@RequestMapping(value="/deleteAffaire/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) {
		metier.delete(id);
	}
	
	@RequestMapping(value="/affaire/{id}", method=RequestMethod.GET)
	public Affaire findOne(@PathVariable("id") long id) {
		return metier.findOne(id);
	}
	
	@RequestMapping(value="/affaires", method=RequestMethod.GET)
	public List<Affaire> findAll(){
		return metier.findAll();
	}
	
	
	
}
