package mrak.jfx.extendfxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
    	VBox vbox = new VBox();
    	vbox.setSpacing(10);
    	vbox.getChildren().add(new BasicButton());
    	vbox.getChildren().add(new SpecializedButton());
        Scene scene = new Scene(vbox);
        
        stage.setTitle("Extending Markup with JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
