package projet.modele;

import java.util.ArrayList;

//Classe Groupe
public class Senior extends TarifCoop {
	
	private double reductionStatic;

	public Senior(double pleinTarif, ArrayList<TarifCoop> tarifs, double reductionStatic) {
		super(pleinTarif, tarifs);
		this.reductionStatic = reductionStatic;
	}
	
	public double getReductionStatic() {
		return reductionStatic;
	}

	public void setReductionStatic(double reductionStatic) {
		this.reductionStatic = reductionStatic;
	}
}