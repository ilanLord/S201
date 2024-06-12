package projet.modele;

public class Abonne extends Adulte {
	private double reductionStatic;
	
	public double getReductionStatic() {
		return reductionStatic;
	}

	public void setReductionStatic(double reductionStatic) {
		this.reductionStatic = reductionStatic;
	}

	public Abonne(double reductionStatic) {
		this.reductionStatic = reductionStatic;
	}
}
