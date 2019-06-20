package com.inti.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.formation.Model.Utilisateur;

@Repository("utilisateurRepo")
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	public List<Utilisateur> getByEmail (@Param("x") String Email);
}
