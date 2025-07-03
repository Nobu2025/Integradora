package mx.edu.utez.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML public void onSumClick() {

    }

    @FXML public void onSubClick() {

    }

    @FXML public void onMulClick() {

    }

    @FXML  public void onDivClick() {

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}