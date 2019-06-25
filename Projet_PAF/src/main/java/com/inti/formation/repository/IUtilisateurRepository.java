package com.inti.formation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.formation.Model.Utilisateur;

@Repository("utilisateurRepo")
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	@Query(value="select id_utilisateur from utilisateur where email=:x", nativeQuery=true)
	public List<Long> getByEmail (@Param("x") String Email);
	
	@Query(value="select mdp_utilisateur  from utilisateur where email=:x", nativeQuery=true)
	public List<String> getMdpByEmail (@Param("x") String mdp);
	
///////////////////////////////////Taches////////////////////////////
	
	@Query(value="select id_tache  from tache_util where id_utilisateur=:x", nativeQuery=true)
	public ArrayList<Long> getIdTachesByIdUtilisateur (@Param("x") long id);
	
///////////////////////////////////Phase////////////////////////////
	
	@Query(value="select id_phase from phase where id_tache=:x", nativeQuery=true)
	public ArrayList<Long> getIdPhasesByIdTache (@Param("x") String id_tache);
	
	@Query(value="select date_debut from phase where id_tache=:x", nativeQuery=true)
	public List<String> getDebutByIdTache (@Param("x") String req);
	
	@Query(value="select date_fin from phase where id_tache=:x", nativeQuery=true)
	public List<String> getFinByIdTache (@Param("x") String req);
	
	@Query(value="select nom from phase where id_tache=:x", nativeQuery=true)
	public List<String> getNomByIdTache (@Param("x") String req);
	
	///////////////////////////////////affaire////////////////////////////
	
//	@Query(value="select id_phase from phase where id_tache=:x", nativeQuery=true)
//	public ArrayList<Long> getIdaffairesByIdTache (@Param("x") String id_tache);
//	
//	@Query(value="select date_debut from phase where id_tache=:x", nativeQuery=true)
//	public List<String> getDebutByIdTache (@Param("x") String req);
//	
//	@Query(value="select date_fin from phase where id_tache=:x", nativeQuery=true)
//	public List<String> getFinByIdTache (@Param("x") String req);
//	
//	@Query(value="select nom from phase where id_tache=:x", nativeQuery=true)
//	public List<String> getNomByIdTache (@Param("x") String req);
	
}
