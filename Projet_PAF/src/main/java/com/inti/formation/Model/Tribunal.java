package com.inti.formation.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tribunal implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTribunal;
	
	private String adresse;
	private double fax;
	private double tel;
	private String region;
	
	@OneToMany(mappedBy="tribunal")
	private List<Tache> taches;
	
	
	public Tribunal() {
		super();
	}

	public Tribunal(long idTribunal, String adresse, double fax, double tel, String region) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}

	
	public Tribunal(String adresse, double fax, double tel, String region, List<Tache> taches) {
		super();
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		this.taches = taches;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	public long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getFax() {
		return fax;
	}

	public void setFax(double fax) {
		this.fax = fax;
	}

	public double getTel() {
		return tel;
	}

	public void setTel(double tel) {
		this.tel = tel;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Tribunal [idTribunal=" + idTribunal + ", adresse=" + adresse + ", fax=" + fax + ", tel=" + tel
				+ ", region=" + region + "]";
	}

	
}
	