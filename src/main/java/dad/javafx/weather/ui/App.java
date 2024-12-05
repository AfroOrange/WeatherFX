package dad.javafx.weather.ui;

import dad.javafx.weather.api.controllers.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private final RootController rootController = new RootController();

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene wheaterScene = new Scene(rootController.getRoot());

		Stage wheaterStage = new Stage();
		wheaterStage.setTitle("Weather App");
		wheaterStage.setScene(wheaterScene);
		wheaterStage.show();
	}
}