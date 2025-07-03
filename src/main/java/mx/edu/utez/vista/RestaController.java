package mx.edu.utez.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RestaController {
    @FXML private TextField txtNum1;
    @FXML private TextField txtNum2;
    @FXML private Label lblResultado;

    @FXML
    public void restar() {
        try {
            double a = Double.parseDouble(txtNum1.getText());
            double b = Double.parseDouble(txtNum2.getText());
            lblResultado.setText("Resultado: " + (a - b));
        } catch (NumberFormatException e) {
            lblResultado.setText("Números inválidos");
        }
    }
}
