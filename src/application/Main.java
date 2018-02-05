package application;
	
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	BorderPane root;
	Scene scene;
//	SampleController controller;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	
			
			
//			initMainPaneComponents();
//			initEventHeandlers();
			
			root.getChildren();
			primaryStage.setScene(scene);
			primaryStage.show();
			
			System.out.println("Aplikacja uruchomiona");
			sysTick_1s_init();
	}

	private Object sysTick_1s_init() {
		Timeline timeTrigger = new Timeline(new KeyFrame(Duration.seconds(1), ae-> sysTick_1s_handler()));
		timeTrigger.setCycleCount(Timeline.INDEFINITE);
		timeTrigger.play();
		return null;
	}
	
	private Object sysTick_1s_handler() {
		// TODO Auto-generated method stub
		SampleController controller = new SampleController();// ciagle jest problem z static!!!
//		controller.textFieldUpdate();
		
		System.out.println("Licznik dziala!");
		return null;
	}
	
}
