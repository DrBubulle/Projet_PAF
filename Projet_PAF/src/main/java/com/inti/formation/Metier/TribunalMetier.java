package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.ITribunalMetier;
import com.inti.formation.Model.Tribunal;
import com.inti.formation.repository.ITribunalRepository;

@Service
public class TribunalMetier implements ITribunalMetier {

	@Autowired
	private ITribunalRepository tribrepo;



	public ITribunalRepository getTribrepo() {
		return tribrepo;
	}

	public void setTribrepo(ITribunalRepository tribrepo) {
		this.tribrepo = tribrepo;
	}


	public Tribunal ajouter(Tribunal a) {

		return tribrepo.save(a);
	}

	
	public Tribunal update(Tribunal a) {

		return tribrepo.save(a);
	}

	
	public void delete(Long id) {

		tribrepo.deleteById(id);

	}

	
	public Tribunal findOne(Long id) {
		
		return tribrepo.getOne(id);
	}

	
	public List<Tribunal> findAll() {
		
		return tribrepo.findAll();
	}



}
