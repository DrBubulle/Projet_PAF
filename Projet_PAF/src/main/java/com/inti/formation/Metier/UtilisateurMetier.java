package com.inti.formation.Metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.inti.formation.IMetier.IUtilisateurMetier;
import com.inti.formation.Model.Utilisateur;
import com.inti.formation.repository.IUtilisateurRepository;

@Service
public class UtilisateurMetier implements IUtilisateurMetier {

	@Autowired
	@Qualifier("utilisateurRepo")
	private IUtilisateurRepository utRepo;

	public IUtilisateurRepository getUtRepo() {
		return utRepo;
	}

	public void setUtRepo(IUtilisateurRepository utRepo) {
		this.utRepo = utRepo;
	}

	public PhaseMetier phaseMetier;

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
		utRepo.deleteById(idUtilisateur);
		;

	}

	@Override
	public Utilisateur findOne(Long idUtilisateur) {

		return utRepo.getOne(idUtilisateur);
	}

	@Override
	public List<Utilisateur> findAll() {

		return utRepo.findAll();
	}

	public List<Long> findByEmail(String email) {
		return utRepo.getByEmail(email);
	}

	@Override
	public ArrayList<Long> getIdTachesByIdUtilisateur(long id) {
		return utRepo.getIdTachesByIdUtilisateur(id);
	}

	@Override
	public List<String> getMdpByEmail(String email) {
		return utRepo.getMdpByEmail(email);
	}

	@Override
	public String getPhasesByIdUtilisateur(long id) {
		ArrayList<Long> idTaches = this.getIdTachesByIdUtilisateur(id);
		int max = idTaches.size();
		String calendarEvent = "[";
		System.out.println(idTaches);
		String req = "";
		for (int i = 1 ; i< max;i++) {
			req = req + i;
			System.out.println(req);
//			List<Long> ids = utRepo.getIdPhasesByIdTache(req);
			List<String> noms = utRepo.getNomByIdTache(req);
			List<String> debuts = utRepo.getDebutByIdTache(req);
//			List<String> fins = utRepo.getFinByIdTache(req);

//			System.out.println(ids);
//			System.out.println(noms);
//			System.out.println(debuts);
//			System.out.println(fins);

			int index = noms.size();
			System.out.println(index);

			for (int j = 0; j < index; j++) {
				String nom = noms.get(j);
				String dateDebut = debuts.get(j);
//				String dateFin = fins.get(j);

				calendarEvent = calendarEvent + "{\"start\": \"" + (String) dateDebut + "\"" + "\n, \"title\": \"" + nom + "\"\n}";
				if (i < (max - 1) || j<(index - 1) ) {
					calendarEvent = calendarEvent + ",\n";
				}
//				JSONObject jsonObject = new JSONObject(calendarEvent);
//				JSONlist.add(jsonObject);
			}
			req = "";
		}
		calendarEvent = calendarEvent + "]";
//		System.out.println(calendarEvent);
		System.out.println(calendarEvent);
		return calendarEvent;
	}

}