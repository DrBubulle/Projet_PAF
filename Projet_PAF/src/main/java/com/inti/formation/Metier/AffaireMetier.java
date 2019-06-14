package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IAffaireMetier;
import com.inti.formation.Model.Affaire;
import com.inti.formation.repository.IAffaireRepository;

@Service
public class AffaireMetier implements IAffaireMetier {
	
	@Autowired
	@Qualifier("afrepo")
	private IAffaireRepository afrepo;

	public IAffaireRepository getAfrepo() {
		return afrepo;
	}

	public void setAfrepo(IAffaireRepository afrepo) {
		this.afrepo = afrepo;
	}

	@Override
	public Affaire ajouter(Affaire a) {
		
		return afrepo.save(a);
	}

	@Override
	public Affaire update(Affaire a) {
		
		return afrepo.save(a);
	}

	@Override
	public void delete(Long id) {
		afrepo.deleteById(id);
		
	}

	@Override
	public Affaire findOne(Long id) {
		
		return afrepo.getOne(id);
	}

	@Override
	public List<Affaire> findAll() {
		return afrepo.findAll();
	}

	

}
