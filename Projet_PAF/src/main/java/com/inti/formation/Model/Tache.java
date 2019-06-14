package com.inti.formation.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tache {
	
	@Id
	private int idTache;
	private String dateCreation;
	private String titre;
	private String description;
	private boolean statuAudience;
	
	public Tache() {
		super();
	}
	public Tache(int idTache, String dateCreation, String titre, String description, boolean statuAudience) {
		super();
		this.idTache = idTache;
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statuAudience = statuAudience;
	}
	public int getIdTache() {
		return idTache;
	}
	public void setIdTache(int idTache) {
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
	public boolean isStatuAudience() {
		return statuAudience;
	}
	public void setStatuAudience(boolean statuAudience) {
		this.statuAudience = statuAudience;
	}
	
	public String toString() {
		return "Tache [idTache=" + idTache + ", dateCreation=" + dateCreation + ", titre=" + titre + ", description="
				+ description + ", statuAudience=" + statuAudience + "]";
	}
	
	

}
