package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;

public class Test {

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    void leftButtonPressed(ActionEvent event) {
        // tu jakiś kod, żeby zapisało do pliku, że lewy przycisk został wciśnięty
    }

    @FXML
    void rightBuuttonPressed(ActionEvent event) {
        // tu jakiś kod, żeby zapisało do pliku, że prawy przycisk został wciśnięty


    }

}
