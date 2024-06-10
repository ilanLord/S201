package Classes;

import java.util.Date;

//Classe Annulation
public class Annulation {
	 private Date date;
	 private boolean remboursementEffectue;
	 
	 private AnnulationArtiste annulationArtiste;
	 private AnnulationClient annulationClient;
	 
	 public Annulation(Date date, boolean remboursementEffectue, AnnulationArtiste annulationArtiste, AnnulationClient annulationClient) {
		 this.date = date;
		 this.remboursementEffectue = remboursementEffectue;
		 
		 this.annulationArtiste = annulationArtiste;
		 this.annulationClient = annulationClient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isRemboursementEffectue() {
		return remboursementEffectue;
	}

	public void setRemboursementEffectue(boolean remboursementEffectue) {
		this.remboursementEffectue = remboursementEffectue;
	}

	public AnnulationArtiste getAnnulationArtiste() {
		return annulationArtiste;
	}

	public void setAnnulationArtiste(AnnulationArtiste annulationArtiste) {
		this.annulationArtiste = annulationArtiste;
	}

	public AnnulationClient getAnnulationClient() {
		return annulationClient;
	}

	public void setAnnulationClient(AnnulationClient annulationClient) {
		this.annulationClient = annulationClient;
	}
}
