package com.inti.formation.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Affaire implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private String status;
	
	//Constructeurs
	public Affaire() {
		super();
	}


	public Affaire(long idAffaire, String reference, String titre, String description, String status) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status = status;
	}

	//Getters and Setters
	public long getIdAffaire() {
		return idAffaire;
	}


	public void setIdAffaire(long idAffaire) {
		this.idAffaire = idAffaire;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	//toString
	@Override
	public String toString() {
		return "Affaire [idAffaire=" + idAffaire + ", reference=" + reference + ", titre=" + titre + ", description="
				+ description + ", status=" + status + "]";
	}
	
	
	
	
	

}
