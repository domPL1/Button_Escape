/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.MouseEvent;
import static java.awt.event.MouseEvent.MOUSE_ENTERED;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author dompl
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        button.setText("Brawo");
    }
    
    @FXML
    private void escape()
    {
        Random b = new Random();
        button.setLayoutX(b.nextInt(300));
        button.setLayoutY(b.nextInt(180));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
