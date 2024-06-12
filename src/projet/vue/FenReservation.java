package projet.vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class FenReservation extends Stage {

	private CtrlReservation ctrl;
	
	public FenReservation() throws IOException {
		this.setTitle("Réservation");
		this.setResizable(false);
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/projet/.fxml"));
        Pane root = loader.load();
        loader.getController();
     	return root;
	}

}

