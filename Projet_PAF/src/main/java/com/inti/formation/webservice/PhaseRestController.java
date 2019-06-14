package com.inti.formation.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.IMetier.IPhaseMetier;
import com.inti.formation.Model.Phase;

@RestController
@CrossOrigin("*")
@RequestMapping("/apiPhase")
public class PhaseRestController {

	private IPhaseMetier metier;

	public IPhaseMetier getMetier() {
		return metier;
	}

	public void setMetier(IPhaseMetier metier) {
		this.metier = metier;
	}
	
	@RequestMapping(value = "/ajouterPhase", method=RequestMethod.POST)
	public Phase ajouter(@RequestBody Phase a) {
		return metier.ajouter(a);
	}
	
	@RequestMapping(value="/updatePhase", method=RequestMethod.PUT)
	public Phase update(@RequestBody Phase a) {
		return metier.update(a);
	}
	
	@RequestMapping(value="/deletePhase/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") long id) {
		metier.delete(id);
	}
	
	@RequestMapping(value="/phase/{id}", method=RequestMethod.GET)
	public Phase findOne(@PathVariable("id") long id) {
		return metier.findOne(id);
	}
	
	@RequestMapping(value="/phases", method=RequestMethod.GET)
	public List<Phase> findAll(){
		return metier.findAll();
	}
	
}
