package com.inti.formation.Model;

import java.io.Serializable;

public class Phase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long idPhase;
	private String nom;
	private String dateDebut;
	private String dateFin;
	
	//cosntructeurs
	public Phase() {
		super();
	}
	public Phase(long idPhase, String nom, String dateDebut, String dateFin) {
		super();
		this.idPhase = idPhase;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	//Getters and Setters
	public long getIdPhase() {
		return idPhase;
	}
	public void setIdPhase(long idPhase) {
		this.idPhase = idPhase;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//toString
	@Override
	public String toString() {
		return "Phase [idPhase=" + idPhase + ", nom=" + nom + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + "]";
	}
	
	

}
