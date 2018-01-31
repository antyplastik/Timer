package application;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class SampleController {
	
	@FXML ToggleButton tgbOFF;
	private boolean tgbOFF_state = false;
	
	@FXML Button btnGetTime;
	
	@FXML Spinner spnHour;
	@FXML Spinner spnMinute;
	@FXML Spinner spnSecond;
	@FXML Spinner spnYear;
	
	@FXML TextField txtWorkTime;
	@FXML TextField txtLearningTime;
	@FXML TextField txtPastime;
	@FXML TextField txtInaction;
	
	
	@FXML private void tgbOFF_clicked (MouseEvent event) {
		if (tgbOFF_state == false) {
			tgbOFF.setText("ON");
			tgbOFF.setStyle("-fx-text-fill: red");
			tgbOFF_state = true;
		}
		else{
			tgbOFF.setText("OFF");
			tgbOFF.setStyle("-fx-text-fill: black");
			tgbOFF_state = false;
		}
		
		System.out.println("toggle OFF dziala!" + " stan: " + tgbOFF_state);
	}
	
	@FXML private void btnGetTime_clicked (MouseEvent event) {
		System.out.println("button Get time dziala");
//		System.out.println(System.currentTimeMillis());


		System.out.println(LocalDateTime.now());
		
	}
	

	
	
	
	}
