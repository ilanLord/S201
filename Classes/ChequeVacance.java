package Classes;

public class ChequeVacance extends Paiement {

	public ChequeVacance(boolean realise, CB cb, Liquide liquide, Cheque cheque, ChequeVacance chequeVacance) {
		super(realise, cb, liquide, cheque, chequeVacance);
	}
}
