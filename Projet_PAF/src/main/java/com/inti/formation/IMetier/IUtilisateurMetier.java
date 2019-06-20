package com.inti.formation.IMetier;

import java.util.List;

import com.inti.formation.Model.Utilisateur;

public interface IUtilisateurMetier extends  IGenericMetier<Utilisateur, Long> {

	List<Utilisateur> findByEmail(String email);
}
