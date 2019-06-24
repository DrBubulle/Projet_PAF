package com.inti.formation.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Utilisateur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
//	@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private long idUtilisateur;
	
	private String email;
	private String nom;
	private String prenom;
	

	@ManyToMany (cascade = CascadeType.PERSIST)
	@JoinTable(name="TacheUtil", joinColumns=@JoinColumn(name="idTache"),
	inverseJoinColumns=@JoinColumn(name="idUtilisateur"))
	private List<Tache> taches;
	
	public Utilisateur() {
		super(); 
	}

	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}


	public Utilisateur(long idUtilisateur, String email, String nom, String prenom) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}


	public Utilisateur(String email, String nom, String prenom) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur(String email, String nom, String prenom, List<Tache> taches) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.taches = taches;
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
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", email=" + email + ", nom=" + nom + ", prenom="
				+ prenom + "," + taches + ", mdpUtilisateur=" + mdpUtilisateur + "]";
	}
	
///////////////Ajout attribue mot de passe
	

	private String mdpUtilisateur;

	public String getMdpUtilisateur() {
		return mdpUtilisateur;
	}

	public void setMdpUtilisateur(String mdpUtilisateur) {
		this.mdpUtilisateur = mdpUtilisateur;
	}

	public Utilisateur(long idUtilisateur, String email, String nom, String prenom, List<Tache> taches,
			String mdpUtilisateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.taches = taches;
		this.mdpUtilisateur = mdpUtilisateur;
	}

	public Utilisateur(String email, String nom, String prenom, List<Tache> taches, String mdpUtilisateur) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.taches = taches;
		this.mdpUtilisateur = mdpUtilisateur;
	}

	public Utilisateur(String email, String nom, String prenom, String mdpUtilisateur) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.mdpUtilisateur = mdpUtilisateur;
	}


	
	

	
	
}
