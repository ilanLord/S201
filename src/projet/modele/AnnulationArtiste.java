package projet.modele;

import java.util.Date;

public class AnnulationArtiste extends Annulation {

	public AnnulationArtiste(Date date, boolean remboursementEffectue, AnnulationArtiste annulationArtiste, AnnulationClient annulationClient) {
		super(date, remboursementEffectue, annulationArtiste, annulationClient);
	}

}
