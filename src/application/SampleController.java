package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;


public class SampleController {
	
	private static SystemTime time = new SystemTime();
	
	public String timerWorkStatus;
	
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
	
	@FXML ToggleGroup tglTimerButtonGroup;
//	private boolean tglOFF_state_true = false;
	
	@FXML Button btnGetTime;

	@FXML TextField txtMain;
	@FXML TextField txtWorkTime;
	@FXML TextField txtLearningTime;
	@FXML TextField txtPastime;
	@FXML TextField txtInaction;
	
	@SuppressWarnings("unchecked")
	@FXML private void tglTimerButtonGroupAction(ActionEvent action) { // <---- NIE DZIALA bo nie jest wywolywana!!!
		System.out.println("Wcisniety ktorys przycisk z grupy");
		
		tglTimerButtonGroup.selectedToggleProperty().addListener((javafx.beans.value.ChangeListener<? super Toggle>) new ChangeListener() {
			
			private Toggle t1;

			@Override
			public void changed(ObservableValue arg0, Object arg1, Object arg2) {
				// TODO Auto-generated method stub
				t1 = null;
				ToggleButton tglPrzycisk = (ToggleButton)t1.getToggleGroup().getSelectedToggle();
				System.out.println("Wcisniety"+tglPrzycisk.getText());
			}
		});
	}
	
	@FXML private void tgbOFF_clicked (MouseEvent event) {
		tgbOFF_stateChange();
		check_tglTimerButtonGroup_state();
	}
	
	@FXML private void tgbWorkTime_clicked (MouseEvent event) {
		tgbWorkTime_stateChange();
		check_tglTimerButtonGroup_state();
	}
	
	@FXML private void tgbLearningTime_clicked (MouseEvent event) {
		tgbLearningTime_stateChange();
		check_tglTimerButtonGroup_state();
	}
	
	@FXML private void tgbPastime_clicked (MouseEvent event) {
		tgbPastime_stateChange();
		check_tglTimerButtonGroup_state();
	}
	
	@FXML private void tgbInaction_clicked (MouseEvent event) {
		tgbInaction_stateChange();
		check_tglTimerButtonGroup_state();
	}
	
	@FXML private void btnGetTime_clicked (MouseEvent event) {
		System.out.println("button Get time dziala");
		
		ReadAndWriteToFile file = new ReadAndWriteToFile();
		System.out.println(file.OSdetection());

		txtMain.setText(time.getTime());
	}
	
	
// --------------- Zmiana stanu przelacznikow -----------------
	private boolean tgbOFF_stateChange() {
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
		return tgbOFF_state;
	}
	private boolean tgbWorkTime_stateChange() {
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
		
		System.out.println("toggle WorkTime dziala!" + " stan: " + tgbWorkTime_state);
		return tgbWorkTime_state;
	}
	private boolean tgbLearningTime_stateChange() {
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
		
		System.out.println("toggle LearningTime dziala!" + " stan: " + tgbLearningTime_state);
		return tgbLearningTime_state;
	}
	private boolean tgbPastime_stateChange() {
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
		
		System.out.println("toggle Pastime dziala!" + " stan: " + tgbPastime_state);
		return tgbPastime_state;
	}
	private boolean tgbInaction_stateChange() {
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
		System.out.println("toggle Inaction dziala!" + " stan: " + tgbInaction_state);
		return tgbInaction_state;
	}
	

	private String check_tglTimerButtonGroup_state() {
		
//		if (tgbOFF_state == false)
//			timerWorkStatus = "OFF";
		
		if (tgbWorkTime_state == true && tgbOFF_state == true) {
			timerWorkStatus = "WorkTime ON";
//			tgbWorkTime_stateChange();
			tgbLearningTime_stateChange();
			tgbPastime_stateChange();
			tgbInaction_stateChange();
		}

		if (tgbLearningTime_state == true && tgbOFF_state == true) {
			timerWorkStatus = "LearningTime ON";
			tgbWorkTime_stateChange();
//			tgbLearningTime_stateChange();
			tgbPastime_stateChange();
			tgbInaction_stateChange();
		}
		
		if (tgbPastime_state == true && tgbOFF_state == true) {
			timerWorkStatus = "Pastime ON";
			tgbWorkTime_stateChange();
			tgbLearningTime_stateChange();
//			tgbPastime_stateChange();
			tgbInaction_stateChange();
		}
		
		if (tgbInaction_state == true && tgbOFF_state == true) {
			timerWorkStatus = "Inaction ON";
			tgbWorkTime_stateChange();
			tgbLearningTime_stateChange();
			tgbPastime_stateChange();
//			tgbInaction_stateChange();
		}
		
		else
			timerWorkStatus = "OFF";
		
		System.out.println(timerWorkStatus);
		return timerWorkStatus;
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
