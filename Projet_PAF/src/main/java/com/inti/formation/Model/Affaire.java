package com.inti.formation.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAffaire;
	
	private String reference;
	private String titre;
	private String description;
	private String status;
	
	@OneToMany(mappedBy="affaire")
	private List<Tache> taches;
	
	@OneToMany(mappedBy="affaire")
	private List<Document> documents;
	
	//Constructeurs
	public Affaire() {
		super();
	}
	

	public List<Document> getDocuments() {
		return documents;
	}


	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}


	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
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
