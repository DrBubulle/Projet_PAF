package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IAffaireMetier;
import com.inti.formation.Model.Affaire;

@Service
public class AffaireMetier implements IAffaireMetier {
	
	@Autowired
	@Qualifier("afrepo")
	private IAffaireMetier afrepo;
	
	public IAffaireMetier getAfrepo() {
		return afrepo;
	}

	public void setAfrepo(IAffaireMetier afrepo) {
		this.afrepo = afrepo;
	}

	@Override
	public Affaire ajouter(Affaire a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Affaire update(Affaire a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Affaire findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Affaire> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
