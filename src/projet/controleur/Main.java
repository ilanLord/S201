package projet.controleur;


import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import projet.vue.*;

public class Main extends Application {
	static private FenListeReservation fListeReservation;
	static private FenPlan fPlan;
	static private FenBillet fBillet;
	static private FenRecherche fRecherche;
	static private FenReservation fReservation;
	private static final int LARGEUR_FENETRE = 550;
	private static final int HAUTEUR_FENETRE = 600;
	
	private static int ListeReservationPlan;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Main.setListeReservationPlan(1);
		fListeReservation = new FenListeReservation();
		fListeReservation.setMinWidth(LARGEUR_FENETRE);
		fListeReservation.setMinHeight(HAUTEUR_FENETRE);
		fBillet = new FenBillet();
		fRecherche = new FenRecherche();
//		fReservation = new FenReservation();
		fBillet.initModality(Modality.APPLICATION_MODAL);
		fRecherche.initModality(Modality.APPLICATION_MODAL);
		fListeReservation.show();
	}
	
	//////////////////////////////////////////////////////////
	// Gestion des fen�tres
	//////////////////////////////////////////////////////////
	
	static public void fermerAppli() {
		System.exit(0);
	}
	
	public static void fermerRecherche() {
		fRecherche.close();		
	}
	
	public static void afficherListeReservation() {
		Main.setListeReservationPlan(1);
		fPlan.close();
		fListeReservation.show();		
	}
	
	public static void afficherPlan() {
		Main.setListeReservationPlan(2);
		fListeReservation.close();
		fPlan.show();
		
	}
	
	
	public static void afficherRecherche() {
		fRecherche.show();
		
	}
	//////////////////////////////////////////////////////////
	// Mise � jour des donn�es
	//////////////////////////////////////////////////////////
	
	public static void rechercheParNumero(String numero) {
		
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


	public static int getListeReservationPlan() {
		return ListeReservationPlan;
	}

	public static void setListeReservationPlan(int listeReservationPlan) {
		ListeReservationPlan = listeReservationPlan;
	}


	
	
}
