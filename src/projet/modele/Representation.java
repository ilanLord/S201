package projet.modele;

import java.util.ArrayList;

//Classe Representation
public class Representation {
	 private String jour;
	 private String heure;
	 private boolean annulee;
	 
	 private ArrayList<Fauteuil> fauteuils;
	 private ArrayList<Reservation> reservations;
	 private ArrayList<Annulation> annulations;
	 
	 public Representation(String jour, String heure, boolean annulee, ArrayList<Fauteuil> fauteuils, ArrayList<Reservation> reservations, ArrayList<Annulation> annulations) {
		 this.jour = jour;
		 this.heure = heure;
		 this.annulee = annulee;
		 
		 this.fauteuils = fauteuils;
		 this.reservations = reservations;
		 this.annulations = annulations;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public boolean isAnnulee() {
		return annulee;
	}

	public void setAnnulee(boolean annulee) {
		this.annulee = annulee;
	}

	public ArrayList<Fauteuil> getFauteuils() {
		return fauteuils;
	}

	public void setFauteuils(ArrayList<Fauteuil> fauteuils) {
		this.fauteuils = fauteuils;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	public ArrayList<Annulation> getAnnulations() {
		return annulations;
	}

	public void setAnnulations(ArrayList<Annulation> annulations) {
		this.annulations = annulations;
	}
}