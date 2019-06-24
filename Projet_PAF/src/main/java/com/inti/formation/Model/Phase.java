package com.inti.formation.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Phase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPhase;
	
	private String nom;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//	@LastModifiedDate
	private Date dateDebut;
	private String dateFin;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="idTache")
	private Tache tache;
	
	//Constructeurs
	public Phase() {
		super();
	}
	public Phase(long idPhase, String nom, Date dateDebut, String dateFin) {
		super();
		this.idPhase = idPhase;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	
	
	public Phase(String nom, Date dateDebut, String dateFin) {
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Phase(String nom, Date dateDebut, String dateFin, Tache tache) {
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tache = tache;
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
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
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
//	public Tache getTache() {
//		return tache;
//	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	
	

}
