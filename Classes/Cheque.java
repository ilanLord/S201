package Classes;

public class Cheque extends Paiement {

	public Cheque(boolean realise, CB cb, Liquide liquide, Cheque cheque, ChequeVacance chequeVacance) {
		super(realise, cb, liquide, cheque, chequeVacance);
	}
}
