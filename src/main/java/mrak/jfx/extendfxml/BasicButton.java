package mrak.jfx.extendfxml;

import java.io.IOException;
import java.net.URL;

import javafx.beans.DefaultProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

@DefaultProperty("extension")
public class BasicButton extends HBox {
	
	private @FXML Label label;
	private @FXML HBox extension;
	
	public BasicButton() {
		super();
		loadFxml(BasicButton.class.getResource("BasicButton.fxml"), this);
	}

	public void changeLabel() 
	{
		label.setText("Text changed");
	}
	
    public ObservableList<Node> getExtension() {
        return extension.getChildren();
    }
    
    protected static void loadFxml(URL fxmlFile, Object rootController) {
        FXMLLoader loader = new FXMLLoader(fxmlFile);
        loader.setController(rootController);
        loader.setRoot(rootController);
        try {
        	loader.load();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
    }
}
