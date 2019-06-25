package com.inti.formation.IMetier;

import java.util.ArrayList;
import java.util.List;


import com.inti.formation.Model.Utilisateur;

public interface IUtilisateurMetier extends  IGenericMetier<Utilisateur, Long> {

	List<Long> findByEmail(String email);
	public ArrayList<Long> getIdTachesByIdUtilisateur( long id);
//	public ArrayList<Long> getIdPhasesByIdUtilisateur( long id);
	public String getPhasesByIdUtilisateur( long id);
	public List<String> getMdpByEmail (String Email)
;}

