package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.inti.formation.IMetier.IPhaseMetier;
import com.inti.formation.Model.Phase;

public class PhaseMetier implements IPhaseMetier {

	@Autowired
	@Qualifier("phrepo")
	private IPhaseMetier phrepo;
	
	@Override
	public Phase ajouter(Phase a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phase update(Phase a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Phase findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Phase> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
