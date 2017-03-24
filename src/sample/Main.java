package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.boardGameLib.model.Grid;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        Grid grid = new Grid(10,10);
    }



    public void testPrint(Grid grid){
        for(int i = 0; i < grid.getSizeX(); i++){
            for(int j = 0; j < grid.getSizeY(); j++){

            }
        }
    }
}
