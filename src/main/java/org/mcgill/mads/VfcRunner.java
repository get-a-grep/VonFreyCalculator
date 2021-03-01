package org.mcgill.mads;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VfcRunner extends Application {
    public static void main(String[] args) {Application.launch();}

    @Override
    public void start(Stage mainStage) throws Exception{

        final FXMLLoader loadModel = new FXMLLoader();
        final Scene root =
                new Scene(loadModel.load(VfcRunner.class.getClassLoader().getResourceAsStream("vfc-gui.fxml")));
        //root.getStylesheets().add("css/checkbox.css");
        mainStage.setScene(root);
        mainStage.setMinHeight(460);
        mainStage.setMinWidth(700);
        mainStage.setResizable(false);
        mainStage.setTitle("Von Frey Calculator");
        mainStage.show();
    }
}
