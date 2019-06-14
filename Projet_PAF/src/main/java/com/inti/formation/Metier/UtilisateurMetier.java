package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IUtilisateurMetier;
import com.inti.formation.Model.Utilisateur;
import com.inti.formation.repository.IUtilisateurRepository;

@Service
public class UtilisateurMetier implements IUtilisateurMetier{

	@Autowired
	@Qualifier("utRepo")
	private IUtilisateurRepository utRepo;

	

	public IUtilisateurRepository getUtRepo() {
		return utRepo;
	}

	public void setUtRepo(IUtilisateurRepository utRepo) {
		this.utRepo = utRepo;
	}

	@Override
	public Utilisateur ajouter(Utilisateur a) {
		
		return utRepo.save(a);
	}

	@Override
	public Utilisateur update(Utilisateur a) {
		
		return utRepo.save(a);
	}

		@Override
	public void delete(Long idUtilisateur) {
		utRepo.deleteById(idUtilisateur);;
		
	}

	@Override
	public Utilisateur findOne(Long idUtilisateur) {
		
		return utRepo.getOne(idUtilisateur);
	}
	
	@Override
	public List<Utilisateur> findAll() {
		
		return utRepo.findAll();
	}

		
}
