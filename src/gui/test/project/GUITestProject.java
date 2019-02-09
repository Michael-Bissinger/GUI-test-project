/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.test.project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class GUITestProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         
        primaryStage.setTitle("JavaFX Login Form!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    // actually launches the programm
    public static void main(String[] args) {
        launch(args);
    }
    
}
