package projet.modele;

import java.util.ArrayList;

//Classe TarifCoop
public class TarifCoop {
	 private double pleinTarif;
	 
	 private ArrayList<TarifCoop> tarifs;
	 
	 public TarifCoop(double pleinTarif, ArrayList<TarifCoop> tarifs) {
		 this.pleinTarif = pleinTarif;
		 this.tarifs = tarifs;
	}

	public double getPleinTarif() {
		return pleinTarif;
	}

	public void setPleinTarif(double pleinTarif) {
		this.pleinTarif = pleinTarif;
	}

	public ArrayList<TarifCoop> getTarifs() {
		return tarifs;
	}

	public void setTarifs(ArrayList<TarifCoop> tarifs) {
		this.tarifs = tarifs;
	}
}