/**
 * 
 */
/**
 * @author ilmathieu
 *
 */
module SAE201 {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	opens projet.controleur to javafx.graphics, javafx.fxml, javafx.base;
	opens projet.modele to javafx.graphics, javafx.fxml, javafx.base;
	opens projet.vue to javafx.graphics, javafx.fxml, javafx.base;
}