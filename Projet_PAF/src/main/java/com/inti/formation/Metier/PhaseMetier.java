package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IPhaseMetier;
import com.inti.formation.Model.Phase;
import com.inti.formation.repository.IPhaseRepository;

@Service
public class PhaseMetier implements IPhaseMetier {

	@Autowired
	@Qualifier("phaseRepo")
	private IPhaseRepository phrepo;
	
	
	public IPhaseRepository getPhrepo() {
		return phrepo;
	}

	public void setPhrepo(IPhaseRepository phrepo) {
		this.phrepo = phrepo;
	}

	@Override
	public Phase ajouter(Phase a) {
		return phrepo.save(a);
	}

	@Override
	public Phase update(Phase a) {
		return phrepo.save(a);
	}

	@Override
	public void delete(Long id) {
		phrepo.deleteById(id);
		
	}

	@Override
	public Phase findOne(Long id) {
		return phrepo.getOne(id);
	}

	@Override
	public List<Phase> findAll() {
		return phrepo.findAll();
	}

	
}
