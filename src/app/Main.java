package app;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage Stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/view/jfx1.fxml"));
		Scene scene = new Scene (parent);
		Stage.setScene(scene);
		Stage.setTitle("Exc JavaFX app");
		Stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
