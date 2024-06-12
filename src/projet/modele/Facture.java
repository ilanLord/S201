package projet.modele;

//Classe Facture
public class Facture {
	 private String numero;
	 private double montantHT;
	 private double staticTauxTVA;
	 
	 private Paiement paiement;
	 
	 public Facture(String numero, double montantHT, double staticTauxTVA, Paiement paiement) {
		 this.numero = numero;
		 this.montantHT = montantHT;
		 this.staticTauxTVA = staticTauxTVA;
		 
		 this.paiement = paiement; 
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getMontantHT() {
		return montantHT;
	}

	public void setMontantHT(double montantHT) {
		this.montantHT = montantHT;
	}

	public double getStaticTauxTVA() {
		return staticTauxTVA;
	}

	public void setStaticTauxTVA(double staticTauxTVA) {
		this.staticTauxTVA = staticTauxTVA;
	}

	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}
}