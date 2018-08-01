package com.GestReunion.model;

public class ParticipationReunion {
	private int idParticipationR;
	private int idReunion;
	private int idEmploye;
	private boolean adminR;
	private boolean supprimerParticipantR;
	private boolean ajouterParticipantR;
	private boolean modifierParticipantR;

	public ParticipationReunion(int idParticipationR, int idReunion, int idEmploye, boolean adminR,
			boolean supprimerParticipantR, boolean ajouterParticipantR, boolean modifierParticipantR) {
		super();
		this.idParticipationR = idParticipationR;
		this.idReunion = idReunion;
		this.idEmploye = idEmploye;
		this.adminR = adminR;
		this.supprimerParticipantR = supprimerParticipantR;
		this.ajouterParticipantR = ajouterParticipantR;
		this.modifierParticipantR = modifierParticipantR;
	}

	public int getIdEmploye() {
		return idEmploye;
	}

	public int getIdParticipationR() {
		return idParticipationR;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public boolean isAdminR() {
		return adminR;
	}

	public boolean isAjouterParticipantR() {
		return ajouterParticipantR;
	}

	public boolean isModifierParticipantR() {
		return modifierParticipantR;
	}

	public boolean isSupprimerParticipantR() {
		return supprimerParticipantR;
	}

	public void setAdminR(boolean adminR) {
		this.adminR = adminR;
	}

	public void setAjouterParticipantR(boolean ajouterParticipantR) {
		this.ajouterParticipantR = ajouterParticipantR;
	}

	public void setIdEmploye(int idEmploye) {
		this.idEmploye = idEmploye;
	}

	public void setIdParticipationR(int idParticipationR) {
		this.idParticipationR = idParticipationR;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public void setModifierParticipantR(boolean modifierParticipantR) {
		this.modifierParticipantR = modifierParticipantR;
	}

	public void setSupprimerParticipantR(boolean supprimerParticipantR) {
		this.supprimerParticipantR = supprimerParticipantR;
	}

}
