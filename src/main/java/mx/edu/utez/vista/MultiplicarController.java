package mx.edu.utez.vista;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MultiplicarController {
    @FXML
    private TextField txt1;  // First number input

    @FXML
    private TextField txt2;  // Second number input

    @FXML
    private TextField txtResultado;  // Result field

    @FXML
    protected void operacion_calcular() {
        try {
            // Get numbers from text fields
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());

            // Calculate multiplication
            double result = num1 * num2;

            // Display result
            txtResultado.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            // Handle invalid input
            txtResultado.setText("Error: Entrada inválida");
        }
    }
}