package com.inti.formation.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long idUtilisateur;
	private String email;
	private String nom;
	private String prenom;
	
	public Utilisateur() {
		super(); 
	}



	

	public Utilisateur(long idUtilisateur, String email, String nom, String prenom) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}





	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Utilisateur [IdUtilisateur=" + idUtilisateur + ", email=" + email + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}
	
	

	
	
}
