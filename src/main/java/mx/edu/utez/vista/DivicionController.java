package mx.edu.utez.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class DivicionController {

    @FXML
    private Label titleLabel;

    @FXML
    private TextField dividendField;

    @FXML
    private TextField divisorField;

    @FXML
    private Label resultLabel;

    @FXML
    protected void onCalculateButtonClick() {
        try {
            // Obtener los valores de los campos de texto
            String dividendText = dividendField.getText().trim();
            String divisorText = divisorField.getText().trim();

            // Validar que los campos no estén vacíos
            if (dividendText.isEmpty() || divisorText.isEmpty()) {
                showAlert("Error", "Por favor, ingrese ambos números.");
                return;
            }

            // Convertir a números decimales
            double dividend = Double.parseDouble(dividendText);
            double divisor = Double.parseDouble(divisorText);

            // Validar división por cero
            if (divisor == 0) {
                showAlert("Error de División", "No se puede dividir por cero.");
                resultLabel.setText("Error");
                return;
            }

            // Realizar la división
            double result = dividend / divisor;

            // Mostrar el resultado formateado
            if (result == (long) result) {
                // Si el resultado es un número entero, mostrarlo sin decimales
                resultLabel.setText(String.valueOf((long) result));
            } else {
                // Si tiene decimales, mostrar con 4 decimales máximo
                resultLabel.setText(String.format("%.4f", result));
            }

        } catch (NumberFormatException e) {
            showAlert("Error de Formato", "Por favor, ingrese números válidos.");
            resultLabel.setText("Error");
        }
    }

    @FXML
    protected void onClearButtonClick() {
        // Limpiar todos los campos
        dividendField.setText("");
        divisorField.setText("");
        resultLabel.setText("0");

        // Poner el foco en el primer campo
        dividendField.requestFocus();
    }

    // Método auxiliar para mostrar alertas
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Método que se ejecuta al inicializar la vista
    @FXML
    private void initialize() {
        // Poner el foco inicial en el campo del dividendo
        dividendField.requestFocus();

        // Permitir solo números y punto decimal en los campos de texto
        addNumericValidation(dividendField);
        addNumericValidation(divisorField);
    }

    // Método para validar que solo se ingresen números
    private void addNumericValidation(TextField textField) {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("-?\\d*\\.?\\d*")) {
                textField.setText(oldValue);
            }
        });
    }
}