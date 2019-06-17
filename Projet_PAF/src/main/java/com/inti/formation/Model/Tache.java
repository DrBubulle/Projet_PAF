package com.inti.formation.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tache implements Serializable {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTache;
	
	private String dateCreation;
	private String titre;
	private String description;
	private boolean statutAudience;
	
	@ManyToMany (mappedBy="taches")
	private List <Utilisateur> utilisateurs;
	
	@ManyToOne
	@JoinColumn(name="idAffaire")
	private Affaire affaire;
	
	@ManyToOne
	@JoinColumn(name="idTribunal")
	private Tribunal tribunal;
	
	@OneToMany(mappedBy="tache")
	private List<Phase> phases;
	
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
	
	
	
	public Tache(String dateCreation, String titre, String description, boolean statutAudience, Affaire affaire,
			Tribunal tribunal) {
		super();
		this.dateCreation = dateCreation;
		this.titre = titre;
		this.description = description;
		this.statutAudience = statutAudience;
		this.affaire = affaire;
		this.tribunal = tribunal;
	}
	public List<Phase> getPhases() {
		return phases;
	}
	public void setPhases(List<Phase> phases) {
		this.phases = phases;
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
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
		return "Tache [dateCreation=" + dateCreation + ", titre=" + titre + ", description=" + description
				+ ", statutAudience=" + statutAudience + "]";
	}
	
	
	
	

}
