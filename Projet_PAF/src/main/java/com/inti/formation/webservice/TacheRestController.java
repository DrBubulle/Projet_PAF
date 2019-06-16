package com.inti.formation.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.IMetier.ITacheMetier;
import com.inti.formation.Model.Tache;

@RestController
@CrossOrigin("*")
@RequestMapping("/apiTache")
public class TacheRestController {

	private ITacheMetier tachemetier;

	public ITacheMetier getTachemetier() {
		return tachemetier;
	}
	public void setTachemetier(ITacheMetier tachemetier) {
		this.tachemetier = tachemetier;
	}
	
	@RequestMapping(value="/ajouterTache", method=RequestMethod.POST)
	public Tache ajouter(@RequestBody Tache t) {
		return tachemetier.ajouter(t);
	}
	
	@RequestMapping(value="/updateTache", method=RequestMethod.PUT)
	public Tache update(@RequestBody Tache t) {
		return tachemetier.update(t);
	}
	
	@RequestMapping(value="/deleteTache/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) {
		tachemetier.delete(id);
	}
	
	@RequestMapping(value="/tache/{id}", method=RequestMethod.GET)
	public Tache findOne(@PathVariable("id") long id) {
		return tachemetier.findOne(id);
	}
	
	@RequestMapping(value="/taches", method=RequestMethod.GET)
	public List<Tache> findAll(){
		return tachemetier.findAll();
	}
	
	
	
	
	
	
	
}
