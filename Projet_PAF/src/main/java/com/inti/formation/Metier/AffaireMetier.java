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
	@Qualifier("afRepo")
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
	public void delete(Long idAffaire) {
		afrepo.deleteById(idAffaire);
		
	}

	@Override
	public Affaire findOne(Long idAffaire) {
		
		return afrepo.getOne(idAffaire);
	}

	@Override
	public List<Affaire> findAll() {
		return afrepo.findAll();
	}

	

}
