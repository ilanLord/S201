package Classes;

//Classe Payment
public class Paiement {
	 private boolean realise;
	 
	 private CB cb;
	 private Liquide liquide;
	 private Cheque cheque;
	 private ChequeVacance chequeVacance;
	 
	 public Paiement(boolean realise, CB cb, Liquide liquide, Cheque cheque, ChequeVacance chequeVacance) {
		 this.realise = realise;
		 this.cb = cb;
		 this.liquide = liquide;
		 this.cheque = cheque;
		 this.chequeVacance = chequeVacance;
	}

	public boolean isRealise() {
		return realise;
	}

	public void setRealise(boolean realise) {
		this.realise = realise;
	}

	public CB getCb() {
		return cb;
	}

	public void setCb(CB cb) {
		this.cb = cb;
	}

	public Liquide getLiquide() {
		return liquide;
	}

	public void setLiquide(Liquide liquide) {
		this.liquide = liquide;
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}

	public ChequeVacance getChequeVacance() {
		return chequeVacance;
	}

	public void setChequeVacance(ChequeVacance chequeVacance) {
		this.chequeVacance = chequeVacance;
	}
}
