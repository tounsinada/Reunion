package com.GestReunion.model;

public class ParticipantExterne {
	private int idParticipantExterne;
	private int idReunion;
	private String entreprise;
	private String nom;
	private String prenom;

	public ParticipantExterne(int idParticipantExterne, int idReunion, String entreprise, String nom, String prenom) {
		super();
		this.idParticipantExterne = idParticipantExterne;
		this.idReunion = idReunion;
		this.entreprise = entreprise;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public int getIdParticipantExterne() {
		return idParticipantExterne;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public void setIdParticipantExterne(int idParticipantExterne) {
		this.idParticipantExterne = idParticipantExterne;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
