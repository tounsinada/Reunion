package com.GestReunion.model;

import java.util.Date;

public class PV {
	private int idPV;
	private int idReunion;
	private int version;
	private String titre;
	private String client;
	private Date date;
	private String objetRevision;
	private String responsableRedaction;
	private String responsableValidation;
	private String responsableApprobation;
	
	public PV() {}

	public PV(int idPV, int idReunion, int version, String titre, String client, Date date, String objetRevision,
			String responsableRedaction, String responsableValidation, String responsableApprobation) {
		super();
		this.idPV = idPV;
		this.idReunion = idReunion;
		this.version = version;
		this.titre = titre;
		this.client = client;
		this.date = date;
		this.objetRevision = objetRevision;
		this.responsableRedaction = responsableRedaction;
		this.responsableValidation = responsableValidation;
		this.responsableApprobation = responsableApprobation;
	}

	public int getIdPV() {
		return idPV;
	}

	public void setIdPV(int idPV) {
		this.idPV = idPV;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getObjetRevision() {
		return objetRevision;
	}

	public void setObjetRevision(String objetRevision) {
		this.objetRevision = objetRevision;
	}

	public String getResponsableRedaction() {
		return responsableRedaction;
	}

	public void setResponsableRedaction(String responsableRedaction) {
		this.responsableRedaction = responsableRedaction;
	}

	public String getResponsableValidation() {
		return responsableValidation;
	}

	public void setResponsableValidation(String responsableValidation) {
		this.responsableValidation = responsableValidation;
	}

	public String getResponsableApprobation() {
		return responsableApprobation;
	}

	public void setResponsableApprobation(String responsableApprobation) {
		this.responsableApprobation = responsableApprobation;
	}

	@Override
	public String toString() {
		return "PV [idPV=" + idPV + ", idReunion=" + idReunion + ", version=" + version + ", titre=" + titre
				+ ", client=" + client + ", date=" + date + ", objetRevision=" + objetRevision
				+ ", responsableRedaction=" + responsableRedaction + ", responsableValidation=" + responsableValidation
				+ ", responsableApprobation=" + responsableApprobation + "]";
	}
	

}
