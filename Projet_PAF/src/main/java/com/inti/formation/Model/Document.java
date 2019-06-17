package com.inti.formation.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Document implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDocument;
	private String dateCreation;
	private String nom;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="idAffaire")
	private Affaire affaire;
	
	public Document() {
		super();
	}
	public Document(long idDocument, String dateCreation, String nom, String description) {
		super();
		this.idDocument = idDocument;
		this.dateCreation = dateCreation;
		this.nom = nom;
		this.description = description;
	}
	
	public long getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(long idDocument) {
		this.idDocument = idDocument;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Document [IdDocument=" + idDocument + ", dateCreation=" + dateCreation + ", nom=" + nom
				+ ", description=" + description + "]";
	}
	
	

}
