package mx.edu.utez.vista;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

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
    protected  void SumaV(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("suma.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();


    }
}

