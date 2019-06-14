package com.inti.formation.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tache implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long idTache;
	private String dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	
	public Tache() {
		super();
	}
	public Tache(long idTache, String dateCreation, String titre, String description, boolean statutAudience) {
		super();
		this.idTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statutAudience = statutAudience;
	}
	public long getIdTache() {
		return idTache;
	}
	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
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
	public boolean isStatutAudience() {
		return statutAudience;
	}
	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}
	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", dateCreation=" + dateCreation + ", titre=" + titre + ", description="
				+ description + ", statutAudience=" + statutAudience + "]";
	}
	

}
