package projet.modele;

import java.util.ArrayList;
import java.util.Date;

//Classe Reservation
public class Reservation {
	 private String numero;
	 private Date date;
	 private Date dateEnvoiConf;
	 
	 private ArrayList<Billet> billets;
	 private Client client;
	 
	 public Reservation(String numero, Date date, Date dateEnvoiConf, ArrayList<Billet> billets, Client client) {
		 this.numero = numero;
		 this.date = date;
		 this.dateEnvoiConf = dateEnvoiConf;
		 
		 this.billets = billets;
		 this.client = client;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDateEnvoiConf() {
		return dateEnvoiConf;
	}

	public void setDateEnvoiConf(Date dateEnvoiConf) {
		this.dateEnvoiConf = dateEnvoiConf;
	}

	public ArrayList<Billet> getBillets() {
		return billets;
	}

	public void setBillets(ArrayList<Billet> billets) {
		this.billets = billets;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}