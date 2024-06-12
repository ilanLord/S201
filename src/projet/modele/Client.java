package projet.modele;

import java.util.ArrayList;

//Classe Client
public class Client {
	 private String nom;
	 private String prenom;
	 private String adresse;
	 private String tel;
	 private String mail;
	 private String numero;
	 
	 private ArrayList<Facture> factures;
	 private ArrayList<Annulation> annulations;
	 
	 public Client(String nom, String prenom, String adresse, String tel, String mail, String numero, ArrayList<Facture> factures, ArrayList<Annulation> annulations) {
		 this.nom = nom;
		 this.prenom = prenom;
		 this.adresse = adresse;
		 this.tel = tel;
		 this.mail = mail;
		 this.numero = numero;
		 
		 this.factures = factures;
		 this.annulations = annulations;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<Facture> getFactures() {
		return factures;
	}

	public void setFactures(ArrayList<Facture> factures) {
		this.factures = factures;
	}

	public ArrayList<Annulation> getAnnulations() {
		return annulations;
	}

	public void setAnnulations(ArrayList<Annulation> annulations) {
		this.annulations = annulations;
	}
}