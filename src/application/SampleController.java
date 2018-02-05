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
	@FXML ToggleButton tgbWorkTime;
	private boolean tgbWorkTime_state = false;
	@FXML ToggleButton tgbLearningTime;
	private boolean tgbLearningTime_state = false;
	@FXML ToggleButton tgbPastime;
	private boolean tgbPastime_state = false;
	@FXML ToggleButton tgbInaction;
	private boolean tgbInaction_state = false;
	
//	@FXML tglTimerButtonGroup;
	
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
	
	@FXML private void tgbWorkTime_clicked (MouseEvent event) {
		if (tgbWorkTime_state == false) {
			tgbWorkTime.setText("ON");
			tgbWorkTime.setStyle("-fx-text-fill: red");
			tgbWorkTime_state = true;
		}
		else{
			tgbWorkTime.setText("OFF");
			tgbWorkTime.setStyle("-fx-text-fill: black");
			tgbWorkTime_state = false;
		}
	}
	@FXML private void tgbLearningTime_clicked (MouseEvent event) {
		if (tgbLearningTime_state == false) {
			tgbLearningTime.setText("ON");
			tgbLearningTime.setStyle("-fx-text-fill: red");
			tgbLearningTime_state = true;
		}
		else{
			tgbLearningTime.setText("OFF");
			tgbLearningTime.setStyle("-fx-text-fill: black");
			tgbLearningTime_state = false;
		}
	}
	@FXML private void tgbPastime_clicked (MouseEvent event) {
		if (tgbPastime_state == false) {
			tgbPastime.setText("ON");
			tgbPastime.setStyle("-fx-text-fill: red");
			tgbPastime_state = true;
		}
		else{
			tgbPastime.setText("OFF");
			tgbPastime.setStyle("-fx-text-fill: black");
			tgbPastime_state = false;
		}
	}
	@FXML private void tgbInaction_clicked (MouseEvent event) {
		if (tgbInaction_state == false) {
			tgbInaction.setText("ON");
			tgbInaction.setStyle("-fx-text-fill: red");
			tgbInaction_state = true;
		}
		else{
			tgbInaction.setText("OFF");
			tgbInaction.setStyle("-fx-text-fill: black");
			tgbInaction_state = false;
		}
	}
	
	@FXML private void btnGetTime_clicked (MouseEvent event) {
		System.out.println("button Get time dziala");
		
		
//		System.out.println(time.getTime());
//		time.getTime();
//		txtMain.setText(time.year+" "+time.month+" "+time.day+" "+time.hour+":"+time.minute+":"+time.second);
		txtMain.setText(time.str_year+"/"+time.str_month+"/"+time.str_day+" "+time.str_hour+":"+time.str_minute+":"+time.str_second);
//		textFieldUpdate();
	}
	

	public void textFieldUpdate() {
		time.getTime();
//		correctionNumberString();
		setMainTime();
//		setWorkTime();
//		setLearningTime();
//		setInactionTime();
//		setPastime();
	}
	
	
	public void setMainTime() {
//		txtMain.setText(time.year+" "+time.month+" "+time.day+" "+time.hour+":"+time.minute+":"+time.second);
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
