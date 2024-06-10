package Classes;

import java.util.ArrayList;

//Classe Fauteuil
public class Fauteuil {
	 private String rangee;
	 private String numero;
	 
	 private ArrayList<Billet> billets;
	 
	 public Fauteuil(String rangee, String numero, ArrayList<Billet> billets) {
		 this.rangee = rangee;
		 this.numero = numero;
		 
		 this.billets = billets;
	}

	public String getRangee() {
		return rangee;
	}

	public void setRangee(String rangee) {
		this.rangee = rangee;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<Billet> getBillets() {
		return billets;
	}

	public void setBillets(ArrayList<Billet> billets) {
		this.billets = billets;
	}
}