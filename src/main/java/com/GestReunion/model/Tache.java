package com.GestReunion.model;
public class Tache {
	private int idTache;
	private int idReunion;
	private int idPRealisateur;
	private int idPAffecteur;
	private String nomTache;
	private String etat;
	
	public Tache() {}

	public Tache(int idTache, int idPRealisateur, int idPAffecteur, String nomTache, String etat) {
		super();
		this.idTache = idTache;
		this.idPRealisateur = idPRealisateur;
		this.idPAffecteur = idPAffecteur;
		this.nomTache = nomTache;
		this.etat = etat;
	}

	public int getIdTache() {
		return idTache;
	}

	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}

	public int getIdPRealisateur() {
		return idPRealisateur;
	}

	public void setIdPRealisateur(int idPRealisateur) {
		this.idPRealisateur = idPRealisateur;
	}

	public int getIdPAffecteur() {
		return idPAffecteur;
	}

	public void setIdPAffecteur(int idPAffecteur) {
		this.idPAffecteur = idPAffecteur;
	}

	public String getNomTache() {
		return nomTache;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", idReunion=" + idReunion + ", idPRealisateur=" + idPRealisateur
				+ ", idPAffecteur=" + idPAffecteur + ", nomTache=" + nomTache + ", etat=" + etat + "]";
	}

	
}
