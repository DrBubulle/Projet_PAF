package com.inti.formation.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.IMetier.ITribunalMetier;
import com.inti.formation.Model.Tribunal;

@RestController
@CrossOrigin("*")
@RequestMapping("/apiTribunal")
public class TribunalRestController {

	private ITribunalMetier tribunalmetier;

	
	public ITribunalMetier getTribunalmetier() {
		return tribunalmetier;
	}
	public void setTribunalmetier(ITribunalMetier tribunalmetier) {
		this.tribunalmetier = tribunalmetier;
	}
	
	@RequestMapping(value="/ajouterTribunal", method=RequestMethod.POST)
	public Tribunal ajouter(@RequestBody Tribunal t) {
		return tribunalmetier.ajouter(t);
	}
	
	@RequestMapping(value="/updateTribunal", method=RequestMethod.PUT)
	public Tribunal update(@RequestBody Tribunal t) {
		return tribunalmetier.update(t);
	}
	
	@RequestMapping(value="/deleteTribunal/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) {
		tribunalmetier.delete(id);
	}
	
	@RequestMapping(value="/tribunal/{id}", method=RequestMethod.GET)
	public Tribunal findOne(@PathVariable("id") long id) {
		return tribunalmetier.findOne(id);
	}
	
	@RequestMapping(value="/tribunaux", method=RequestMethod.GET)
	public List<Tribunal> findAll(){
		return tribunalmetier.findAll();
	}
	
}
