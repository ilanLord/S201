package Classes;

//Classe Billet
public class Billet {
	 private String numero;
	 
	 private Reservation reservation;
	 
	 public Billet(String numero, Reservation reservation) {
		 this.numero = numero;
		 this.reservation = reservation;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
}