package com.GestReunion.model;

public class Salle {

	private int idSalle;
	private String nomSalle;
	private String type;
	private String description ;
	private int capacite;
	private String  etat;
	
	public Salle() {}
	
	public Salle(int idSalle, String nomSalle, String type, String description, int capacite, String etat) {
		super();
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
		this.type = type;
		this.description = description;
		this.capacite = capacite;
		this.etat = etat;
	}

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", type=" + type + ", description="
				+ description + ", capacite=" + capacite + ", etat=" + etat + "]";
	}
	
	
	
}
