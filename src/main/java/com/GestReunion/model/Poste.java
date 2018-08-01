package com.GestReunion.model;

public class Poste {
	private int idPoste;
	private String nom;

	public Poste(int idPoste, String nom) {
		super();
		this.idPoste = idPoste;
		this.nom = nom;
	}

	public int getIdPoste() {
		return idPoste;
	}

	public String getNom() {
		return nom;
	}

	public void setIdPoste(int idPoste) {
		this.idPoste = idPoste;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
