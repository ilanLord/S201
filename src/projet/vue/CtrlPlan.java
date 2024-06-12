package projet.vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import projet.controleur.Main;

public class CtrlPlan {

    @FXML
    private Menu bnReservations;

    @FXML
    private Menu bnPlan;

    @FXML
    void clicMenu(ActionEvent event) {
    	if (event.getTarget() == this.bnReservations) {
    		Main.afficherListeReservation();
    	} else if (event.getTarget() == this.bnPlan){
    		Main.afficherPlan();
    	}
    }
    
    void initialize() {
    	if (Main.getListeReservationPlan() == 1) {
    		this.bnReservations.setDisable(true);
    		this.bnPlan.setDisable(false);
    	} else {
    		this.bnReservations.setDisable(false);
    		this.bnPlan.setDisable(true);
    	}
    }
    

}
