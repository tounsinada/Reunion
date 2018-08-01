
package com.GestReunion.model;
import java.sql.Time;
import java.util.Collection;
import java.util.Date;

/**
 * @author LENOVO
 *
 */
public class Entretien {

	private int idEtretien;
	private int idSalle;
	private String nomCandidat;
	private String prenomCandidat;
	private String post;
	private Date dateE;
	private Time heureDeb;
	private Time heureFin;
	private Collection<ParticipationEntretien> ListeParticipEntretien;
	private Collection<PJ> ListePJE;

	


	public Entretien() {
	}

	public Entretien(int idEtretien, int idSalle, String nomCandidat, String prenomCandidat, String post, Date dateE,
			Time heureDeb, Time heureFin) {
		this.idEtretien = idEtretien;
		this.idSalle = idSalle;
		this.nomCandidat = nomCandidat;
		this.prenomCandidat = prenomCandidat;
		this.post = post;
		this.dateE = dateE;
		this.heureDeb = heureDeb;
		this.heureFin = heureFin;
	}

	public int getIdEtretien() {
		return idEtretien;
	}

	public void setIdEtretien(int idEtretien) {
		this.idEtretien = idEtretien;
	}

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public String getNomCandidat() {
		return nomCandidat;
	}

	public void setNomCandidat(String nomCandidat) {
		this.nomCandidat = nomCandidat;
	}

	public String getPrenomCandidat() {
		return prenomCandidat;
	}

	public void setPrenomCandidat(String prenomCandidat) {
		this.prenomCandidat = prenomCandidat;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Date getDateE() {
		return dateE;
	}

	public void setDateE(Date dateE) {
		this.dateE = dateE;
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

	public Collection<ParticipationEntretien> getListeParticipEntretien() {
		return ListeParticipEntretien;
	}

	public void setListeParticipEntretien(Collection<ParticipationEntretien> listeParticipEntretien) {
		ListeParticipEntretien = listeParticipEntretien;
	}

	public Collection<PJ> getListePJE() {
		return ListePJE;
	}

	public void setListePJE(Collection<PJ> listePJE) {
		ListePJE = listePJE;
	}

	@Override
	public String toString() {
		return "Entretien [idEtretien=" + idEtretien + ", idSalle=" + idSalle + ", nomCandidat=" + nomCandidat
				+ ", prenomCandidat=" + prenomCandidat + ", post=" + post + ", dateE=" + dateE + ", heureDeb="
				+ heureDeb + ", heureFin=" + heureFin + ", ListeParticipEntretien=" + ListeParticipEntretien
				+ ", ListePJE=" + ListePJE + "]";
	}

	

}
