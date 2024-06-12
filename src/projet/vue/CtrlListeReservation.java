package projet.vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;
import projet.controleur.Main;

public class CtrlListeReservation {

    @FXML
    private SplitMenuButton bnFiltres;

    @FXML
    private ListView<String> listeReservation;

    @FXML
    private Button bnRecherche;

    @FXML
    void clicRecherche(ActionEvent event) {
    	Main.afficherRecherche();
    }

}
