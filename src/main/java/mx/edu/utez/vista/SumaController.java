package mx.edu.utez.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumaController {
    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    private Label result;

    @FXML
    public void onSumClick() {
            double num1 = Double.parseDouble(number1.getText());
            double num2 = Double.parseDouble(number2.getText());
            double resultado = num1 + num2;
             result.setText("Resultado: " + resultado);

        }
    }

