package projet.vue;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import projet.controleur.Main;

public class CtrlRecherche {

    @FXML
    private TextField txtVille;

    @FXML
    private RadioButton rbReservation;

    @FXML
    private Button bnValider;

    @FXML
    private RadioButton rbClient;

    @FXML
    private Button bnAnnuler;

    @FXML
    private TextField txtNumero;

    @FXML
    private ToggleGroup ChoixRecherche;

    @FXML
    private TextField txtNom;
    
    void initialize() {
    	this.rbClient.setSelected(false);
    	this.rbReservation.setSelected(false);
    	
    	this.txtNom.clear();
    	this.txtVille.clear();
    	this.txtNumero.clear();
    	
    	this.bnValider.setDisable(true);
    	
    	this.txtNom.setDisable(true);
    	this.txtVille.setDisable(true);
    	this.txtNumero.setDisable(true);
    	
    	BooleanBinding bnClientChoisi = Bindings.createBooleanBinding(
    		    () -> this.rbClient.isSelected(),
    		    this.rbClient.selectedProperty()
    		);
    	BooleanBinding conditionValiderClient = Bindings.and(Bindings.and(Bindings.equal(txtNom.textProperty(), ""), (Bindings.equal(txtVille.textProperty(), ""))), bnClientChoisi);
		
    	BooleanBinding bnReservationChoisi = Bindings.createBooleanBinding(
    		    () -> this.rbReservation.isSelected(),
    		    this.rbReservation.selectedProperty()
    		);
    	BooleanBinding conditionValiderReservation = Bindings.and(Bindings.equal(txtNumero.textProperty(), ""),bnReservationChoisi);
		
    	
		bnValider.disableProperty().bind(
				Bindings.when(conditionValiderClient).then(true).otherwise(Bindings.when(conditionValiderReservation).then(true).otherwise(false)));
		
    }

    
    @FXML
    void clicRB(ActionEvent event) {
    	if (event.getTarget() == this.rbClient) {
        	this.txtNom.setDisable(false);
        	this.txtVille.setDisable(false);
        	this.txtNumero.setDisable(true);
    	} else {
        	this.txtNom.setDisable(true);
        	this.txtVille.setDisable(true);
        	this.txtNumero.setDisable(false);
    	}
    }


    @FXML
    void clicAnnuler(ActionEvent event) {
    	Main.fermerRecherche();
    }

    @FXML
    void clicValider(ActionEvent event) {
    	if (this.rbClient.isSelected()) {
    		Main.rechercheParClient(this.txtNom.getText(), this.txtVille.getText());
    	} else {
    		Main.rechercheParNumero(this.txtNumero.getText());
    	}
    	Main.fermerRecherche();
    }

}
