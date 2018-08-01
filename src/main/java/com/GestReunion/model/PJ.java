package com.GestReunion.model;

public class PJ {

	private int idPJ;
	private int idReunion;
	private int idEntretien;
	private int idEmplye;
	private String nomPJ;
	private String chemin;
	
	public PJ() {}

	public PJ(int idPJ, int idReunion, int idEntretien, int idEmplye, String nomPJ, String chemin) {
		super();
		this.idPJ = idPJ;
		this.idReunion = idReunion;
		this.idEntretien = idEntretien;
		this.idEmplye = idEmplye;
		this.nomPJ = nomPJ;
		this.chemin = chemin;
	}

	public int getIdPJ() {
		return idPJ;
	}

	public void setIdPJ(int idPJ) {
		this.idPJ = idPJ;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public int getIdEntretien() {
		return idEntretien;
	}

	public void setIdEntretien(int idEntretien) {
		this.idEntretien = idEntretien;
	}

	public int getIdEmplye() {
		return idEmplye;
	}

	public void setIdEmplye(int idEmplye) {
		this.idEmplye = idEmplye;
	}

	public String getNomPJ() {
		return nomPJ;
	}

	public void setNomPJ(String nomPJ) {
		this.nomPJ = nomPJ;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	@Override
	public String toString() {
		return "PJ [idPJ=" + idPJ + ", idReunion=" + idReunion + ", idEntretien=" + idEntretien + ", idEmplye="
				+ idEmplye + ", nomPJ=" + nomPJ + ", chemin=" + chemin + "]";
	}
	
}
