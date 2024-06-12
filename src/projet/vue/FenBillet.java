package projet.vue;

import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class FenBillet extends Stage {

	private CtrlBillet ctrl;
	
	public FenBillet() throws IOException {
		this.setTitle("Billet");
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

