/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Sue Lin
 */
package baseline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Application.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setTitle("To Do List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    //closes the program
    public void stop(){

    }

    //loads a pre-existing to-do list
    void openFile(File inputFile){
        //find the file that the user wants to open
        //read in the value and make sure it's not null
    }

    //handles all the events
    void handle(ActionEvent event){
        //allow for scrolling through the list
        //button handling here?
        //if the filter button is pressed, access the filter class
        //for everything else, access the task class
    }

    //exports/updates/creates a to-do list
    void saveFile(File exportFile){
        //let user type in name for to-do list if they want to change it
        //save string
        //name the list after the string
        //ask/allow user to decide where they want to save the list
        //export
    }
}
