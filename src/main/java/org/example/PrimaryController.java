package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

/*    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }*/

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField side_input_1;

    @FXML
    private TextField side_input_2;

    @FXML
    private TextField side_input_3;

    @FXML
    private Label perimeter;

    @FXML
    private Label area;

    @FXML
    void buttonPer(ActionEvent event) {
        try {
            Double.parseDouble(side_input_1.getText());
            Double.parseDouble(side_input_2.getText());
            Double.parseDouble(side_input_3.getText());
        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong data input");
            alert.showAndWait();
            return;
        }
        double side_1 = Math.abs(Double.parseDouble(side_input_1.getText()));
        double side_2 = Math.abs(Double.parseDouble(side_input_2.getText()));
        double side_3 = Math.abs(Double.parseDouble(side_input_3.getText()));

        if (Triangle.isExist(side_1, side_2, side_3)==false)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Triangle with such sides doesn't exist");
            alert.showAndWait();
            return;
        }

        perimeter.setText(Double.toString(side_1 + side_2 + side_3));
    }

    @FXML
    void buttonArea(ActionEvent event) {
        try {
            Double.parseDouble(side_input_1.getText());
            Double.parseDouble(side_input_2.getText());
            Double.parseDouble(side_input_3.getText());
        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong data input");
            alert.showAndWait();
            return;
        }
        double side_1 = Math.abs(Double.parseDouble(side_input_1.getText()));
        double side_2 = Math.abs(Double.parseDouble(side_input_2.getText()));
        double side_3 = Math.abs(Double.parseDouble(side_input_3.getText()));

        if (Triangle.isExist(side_1, side_2, side_3)==false)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Triangle with such sides doesn't exist");
            alert.showAndWait();
            return;
        }

        double halfper=(side_1+side_2+side_3)/2;
        double ar;
        ar=Math.sqrt(halfper*(halfper-side_1)*(halfper-side_2)*(halfper-side_3));
        area.setText(Double.toString(ar));
    }

    @FXML
    void initialize() {
    }
}
