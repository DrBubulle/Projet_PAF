package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.Model.Utilisateur;

@Repository("utilisateurRepo")
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
