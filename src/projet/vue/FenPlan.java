package projet.vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class FenPlan extends Stage {
	
	public FenPlan() throws IOException {
		this.setTitle("Plan de la salle");
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException {
     	FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/projet/planLePatio.fxml"));
        Pane root = loader.load();
        loader.getController();
     	return root;
	}

}

