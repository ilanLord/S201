package projet.controleur;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import projet.vue.*;

public class Main extends Application {
	static private FenPrincipale fPrincipale;
	static private FenBillet fBillet;
	static private FenRecherche fRecherche;
	static private FenReservation fReservation;
	private static final int LARGEUR_FENETRE = 550;
	private static final int HAUTEUR_FENETRE = 600;

	@Override
	public void start(Stage primaryStage) throws Exception {
		fPrincipale = new FenPrincipale();
		fPrincipale.setMinWidth(LARGEUR_FENETRE);
		fPrincipale.setMinHeight(HAUTEUR_FENETRE);
		fBillet = new FenBillet();
		fRecherche = new FenRecherche();
		fReservation = new FenReservation();
		fBillet.initModality(Modality.APPLICATION_MODAL);
		fRecherche.initModality(Modality.APPLICATION_MODAL);
		fPrincipale.show();
	}
	
	//////////////////////////////////////////////////////////
	// Gestion des fen�tres
	//////////////////////////////////////////////////////////
	
	static public void fermerAppli() {
		System.exit(0);
	}
	
	//////////////////////////////////////////////////////////
	// Mise � jour des donn�es
	//////////////////////////////////////////////////////////
	
	public static void rechercheParNumero(String numero) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void rechercheParClient(String text, String text2) {
		// TODO Auto-generated method stub
		
	}

	
//	static public void enregistrerNouvelEmploye(Employe e) {	
//		Donnees.ajouterEmploye(e);
//		fNouvel.close();
//	}
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}

	public static void fermerRecherche() {
		fRecherche.close();		
	}

	
	
}
