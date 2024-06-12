package projet.modele;

import java.util.*;

//Classe Artiste
public class Artiste {
	 private String nom;
	 
	 private ArrayList<Spectacle> spectacles;
	 
	 public Artiste(String nom, ArrayList<Spectacle> spectacles) {
		 this.nom = nom;
		 this.spectacles = spectacles;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Spectacle> getSpectacles() {
		return spectacles;
	}

	public void setSpectacles(ArrayList<Spectacle> spectacles) {
		this.spectacles = spectacles;
	}
}