package com.inti.formation.Metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IUtilisateurMetier;
import com.inti.formation.Model.Utilisateur;
import com.inti.formation.repository.ITacheRepository;
import com.inti.formation.repository.IUtilisateurRepository;

@Service
public class UtilisateurMetier implements IUtilisateurMetier{

	@Autowired
	@Qualifier("utilisateurRepo")
	private IUtilisateurRepository utRepo;

	

	public IUtilisateurRepository getUtRepo() {
		return utRepo;
	}

	public void setUtRepo(IUtilisateurRepository utRepo) {
		this.utRepo = utRepo;
	}
	
//	private ITacheRepository trepo;
//	
//
//	public ITacheRepository getTrepo() {
//		return trepo;
//	}
//
//	public void setTrepo(ITacheRepository trepo) {
//		this.trepo = trepo;
//	}

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

	public List<Utilisateur> findByEmail(String email) {
		return utRepo.getByEmail(email);
	}
		
}
