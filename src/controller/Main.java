package controller;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage){
		FXMLLoader loader=new FXMLLoader(
				Main.class.getResource("/view/AnimationWindowView.fxml"));
		try {
			AnchorPane pane=loader.load();
			
			Stage animationWindowStage=new Stage();
			animationWindowStage.setMinWidth(500.0);
			animationWindowStage.setMinHeight(500.0);
			animationWindowStage.setTitle("Aquarium");
			animationWindowStage.initModality(Modality.WINDOW_MODAL);
			animationWindowStage.initOwner(primaryStage);
			Scene scene=new Scene(pane);
			
			AnimationWindowController animationWindowController=
					loader.getController();
			animationWindowController.setStage(animationWindowStage);
			animationWindowController.animation();
			animationWindowStage.setScene(scene);
			animationWindowStage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
