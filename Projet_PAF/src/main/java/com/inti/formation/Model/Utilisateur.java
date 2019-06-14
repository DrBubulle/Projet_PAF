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
	private long IdUtilisateur;
	private String email;
	private String nom;
	private String prenom;
	
	public Utilisateur() {
		super(); 
	}

	public Utilisateur(long idUtilisateur, String email, String nom, String prenom) {
		super();
		IdUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}

	public long getIdUtilisateur() {
		return IdUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		IdUtilisateur = idUtilisateur;
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
		return "Utilisateur [IdUtilisateur=" + IdUtilisateur + ", email=" + email + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}
	
	

	
	
}
