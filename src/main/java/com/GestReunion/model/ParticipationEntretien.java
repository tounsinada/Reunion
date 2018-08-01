package com.GestReunion.model;

public class ParticipationEntretien {
	private int idParticipationE;
	private int idEntretien;
	private int idEmploye;
	private boolean adminE;
	private boolean supprimerParticipantE;
	private boolean ajouterParticipantE;
	private boolean modifierParticipantE;

	public ParticipationEntretien(int idParticipationE, int idEntretien, int idEmploye, boolean adminE,
			boolean supprimerParticipantE, boolean ajouterParticipantE, boolean modifierParticipantE) {
		super();
		this.idParticipationE = idParticipationE;
		this.idEntretien = idEntretien;
		this.idEmploye = idEmploye;
		this.adminE = adminE;
		this.supprimerParticipantE = supprimerParticipantE;
		this.ajouterParticipantE = ajouterParticipantE;
		this.modifierParticipantE = modifierParticipantE;
	}

	public int getIdEmploye() {
		return idEmploye;
	}

	public int getIdEntretien() {
		return idEntretien;
	}

	public int getIdParticipationE() {
		return idParticipationE;
	}

	public boolean isAdminE() {
		return adminE;
	}

	public boolean isAjouterParticipantE() {
		return ajouterParticipantE;
	}

	public boolean isModifierParticipantE() {
		return modifierParticipantE;
	}

	public boolean isSupprimerParticipantE() {
		return supprimerParticipantE;
	}

	public void setAdminE(boolean adminE) {
		this.adminE = adminE;
	}

	public void setAjouterParticipantE(boolean ajouterParticipantE) {
		this.ajouterParticipantE = ajouterParticipantE;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	public void setIdEntretien(int idEntretien) {
		this.idEntretien = idEntretien;
	}

	public void setIdParticipationE(int idParticipationE) {
		this.idParticipationE = idParticipationE;
	}

	public void setModifierParticipantE(boolean modifierParticipantE) {
		this.modifierParticipantE = modifierParticipantE;
	}

	public void setSupprimerParticipantE(boolean supprimerParticipantE) {
		this.supprimerParticipantE = supprimerParticipantE;
	}

}
