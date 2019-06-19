package com.inti.formation.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
	private int status;
	
	@OneToMany(mappedBy="affaire", cascade = CascadeType.REMOVE)
	private List<Tache> taches;
	
	@OneToMany(mappedBy="affaire", cascade = CascadeType.REMOVE)
	private List<Document> documents;
	
	//Constructeurs
	public Affaire() {
		super();
	}
	
	

	public List<Document> getDocuments() {
		return documents;
	}


	public Affaire(String reference, String titre, String description, int status, List<Tache> taches,
			List<Document> documents) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status = status;
		this.taches = taches;
		this.documents = documents;
	}



	public Affaire(String reference, String titre, String description, int status) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.status = status;
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


	public Affaire(long idAffaire, String reference, String titre, String description, int status) {
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


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	//toString
	@Override
	public String toString() {
		return "Affaire [idAffaire=" + idAffaire + ", reference=" + reference + ", titre=" + titre + ", description="
				+ description + ", status=" + status + "]";
	}
	
	
	
	
	

}
