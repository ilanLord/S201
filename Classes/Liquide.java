package Classes;

public class Liquide extends Paiement {

	public Liquide(boolean realise, CB cb, Liquide liquide, Cheque cheque, ChequeVacance chequeVacance) {
		super(realise, cb, liquide, cheque, chequeVacance);
	}
}
