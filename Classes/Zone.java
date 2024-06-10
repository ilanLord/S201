package Classes;

import java.util.ArrayList;

public class Zone {
    private String nom;
    
    private ArrayList<Fauteuil> fauteuils;
    
    public Zone(String nom, ArrayList<Fauteuil> fauteuils) {
    	this.nom = nom;
    	this.fauteuils = fauteuils;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Fauteuil> getFauteuils() {
		return fauteuils;
	}

	public void setFauteuils(ArrayList<Fauteuil> fauteuils) {
		this.fauteuils = fauteuils;
	}
}
