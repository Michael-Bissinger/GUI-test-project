/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.test.project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class GUITestProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //setting a gap
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets (25,25,25,25));
        
        primaryStage.setTitle("JavaFX Login Form!");
        primaryStage.setScene(scene);
        primaryStage.show();

    
    
    }

    /**I
     * @param args the command line arguments
     */
    
    // Strg + Shift + I adds all needed import statements
    
    // actually launches the programm
    public static void main(String[] args) {
        launch(args);
    }
    
}
