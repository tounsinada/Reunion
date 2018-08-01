package com.GestReunion.model;
import java.sql.Time;
import java.util.Collection;
import java.util.Date;

public class Reunion {

	
	private int idReunion;
	private int idSalle;
	private String president;
	private String sujet;
	private String post;
	private Date dateR;
	private Time heureDeb;
	private Time heureFin;
	private Collection<ParticipantExterne> ListeParticipExterne;
	private Collection<ParticipationReunion> ListeParticipReunion;
	private Collection<PJ> ListePJR;
	private Collection<PV> ListePV;



	public Reunion() {}

		
	public Reunion(int idSalle, String president, String sujet, String post, Date dateR, Time heureDeb,
			Time heureFin) {
		super();
		this.idSalle = idSalle;
		this.president = president;
		this.sujet = sujet;
		this.post = post;
		this.dateR = dateR;
		this.heureDeb = heureDeb;
		this.heureFin = heureFin;
	}



	public int getIdReunion() {
		return idReunion;
	}
	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Date getDateR() {
		return dateR;
	}
	public void setDateR(Date dateR) {
		this.dateR = dateR;
	}
	public Time getHeureDeb() {
		return heureDeb;
	}
	public void setHeureDeb(Time heureDeb) {
		this.heureDeb = heureDeb;
	}
	public Time getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Time heureFin) {
		this.heureFin = heureFin;
	}
	
	
	public Collection<ParticipantExterne> getListeParticipExterne() {
		return ListeParticipExterne;
	}


	public void setListeParticipExterne(Collection<ParticipantExterne> listeParticipExterne) {
		ListeParticipExterne = listeParticipExterne;
	}


	public Collection<ParticipationReunion> getListeParticipReunion() {
		return ListeParticipReunion;
	}


	public void setListeParticipReunion(Collection<ParticipationReunion> listeParticipReunion) {
		ListeParticipReunion = listeParticipReunion;
	}


	public Collection<PJ> getListePJR() {
		return ListePJR;
	}


	public void setListePJR(Collection<PJ> listePJR) {
		ListePJR = listePJR;
	}


	public Collection<PV> getListePV() {
		return ListePV;
	}


	public void setListePV(Collection<PV> listePV) {
		ListePV = listePV;
	}


	@Override
	public String toString() {
		return "Reunion [idReunion=" + idReunion + ", idSalle=" + idSalle + ", president=" + president + ", sujet="
				+ sujet + ", post=" + post + ", dateR=" + dateR + ", heureDeb=" + heureDeb + ", heureFin=" + heureFin
				+ ", ListeParticipExterne=" + ListeParticipExterne + ", ListeParticipReunion=" + ListeParticipReunion
				+ ", ListePJR=" + ListePJR + ", ListePV=" + ListePV + "]";
	}


	

	
	
	
	
}
