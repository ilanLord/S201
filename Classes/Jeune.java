package Classes;

import java.util.ArrayList;

//Classe Jeune
public class Jeune extends TarifCoop {
	private double reductionStatic;

	public Jeune(double pleinTarif, ArrayList<TarifCoop> tarifs, double reductionStatic) {
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