package Classes;

import java.util.Date;

public class AnnulationClient extends Annulation {

	public AnnulationClient(Date date, boolean remboursementEffectue, AnnulationArtiste annulationArtiste, AnnulationClient annulationClient) {
		super(date, remboursementEffectue, annulationArtiste, annulationClient);
	}

}
