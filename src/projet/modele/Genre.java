package projet.modele;

import java.util.ArrayList;

//Classe Genre
public class Genre {
	 private String libelle;
	 
	 private ArrayList<Spectacle> spectacles;
	 
	 public Genre(String libelle, ArrayList<Spectacle> spectacles) {
		 this.libelle = libelle;
		 this.spectacles = spectacles; 
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public ArrayList<Spectacle> getSpectacles() {
		return spectacles;
	}

	public void setSpectacles(ArrayList<Spectacle> spectacles) {
		this.spectacles = spectacles;
	}
}