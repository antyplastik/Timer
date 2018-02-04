package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;


public class SampleController {
	
	private static SystemTime time = new SystemTime();
	
	
	@FXML ToggleButton tgbOFF;
	private boolean tgbOFF_state = false;
	
	@FXML Button btnGetTime;

	@FXML TextField txtMain;
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
		
		
//		System.out.println(time.getTime());
		time.getTime();
		txtMain.setText(time.year+" "+time.month+" "+time.day+" "+time.hour+":"+time.minute+":"+time.second);
//		txtMain.setText("Hello");
		
	}
	

	public void textFieldUpdate() {
		setMainTime();
//		setWorkTime();
//		setLearningTime();
//		setInactionTime();
//		setPastime();
	}
	
	
	public void setMainTime() {
		time.getTime();
		txtMain.setText(time.year+" "+time.month+" "+time.day+" "+time.hour+":"+time.minute+":"+time.second);
//		System.out.println(time.getTime());
	}

	public static void setWorkTime() {
		
	}
	
	public static void setLearningTime() {
		
	}
	
	public static void setInactionTime() {
		
	}
	
	public static void setPastime() {
		
	}
	
	
}
