package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
/**
 * ConverterController for handle Event
 * @author Wuttipat Nilsiri
 *
 */
public class ConverterController {
	
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	ComboBox<Length> menuBar1;
	@FXML
	ComboBox<Length> menuBar2;
	/**
	 * JavaFX calls the initialize() method of your controller when
	 * it creates the UI form, after the components have been created
	 * and @FXML annotated attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		// This is for testing
		System.out.println("Running initialize");
		if (menuBar1 != null) {
			menuBar1.getItems().addAll( Length.values() );
			menuBar1.getSelectionModel().select(0); // select an item to show
		}
		if (menuBar2 != null) {
			menuBar2.getItems().addAll( Length.values() );
			menuBar2.getSelectionModel().select(1); // select an item to show
		}
	}
	
	/**
	 * handle if Key that press is ENTER
	 * @param ke
	 */
//	public void handleConvertKey(KeyEvent ke){
//		if (ke.getCode().equals(KeyCode.ENTER)){
//			handleConvert();
//		}
//		if (ke.getCode().equals(KeyCode.DELETE)){
//			if(!textfield2.getText().trim().equals("")){
//				textfield2.setText("");
//			}
//		}
//		
//	}
	/**
	 * handle pressing key for txtfield1
	 * @param ke key that press
	 */
	public void handleKeyTxt1(KeyEvent ke){
		if (ke.getCode().equals(KeyCode.ENTER)){
			handleConvert();
		}
		if (ke.getCode().equals(KeyCode.DELETE)){
			if(!textfield1.getText().trim().equals("")){
				textfield1.setText("");
			}
		}
	}
	/**
	 * handle pressing key for txtfield2
	 * @param ke key that press
	 */
	public void handleKeyTxt2(KeyEvent ke){
		if (ke.getCode().equals(KeyCode.ENTER)){
			handleConvert();
		}
		if (ke.getCode().equals(KeyCode.DELETE)){
			if(!textfield2.getText().trim().equals("")){
				textfield2.setText("");
			}
		}
	}

	/**
	 * Handle from 2 textfield then convert the another if one of have error input or no input
	 */
	public void handleConvert(){
		textfield1.setStyle("-fx-border-color: white;");
		textfield2.setStyle("-fx-border-color: white;");
		Length baseLength = menuBar1.getValue();
		Length toConvertLength = menuBar2.getValue();
		
		double value1;
		double value2;
		double ans;
		
		try{
			//try convert left text field if it work convert to right if it have error check the right one
			value1 = Double.parseDouble(textfield1.getText().trim());
			ans = value1*baseLength.getValue()/toConvertLength.getValue();
			textfield2.setText(String.valueOf(ans));
		}catch (NumberFormatException e1){
			try{
				value2 = Double.parseDouble(textfield2.getText().trim());
				ans = value2/baseLength.getValue()*toConvertLength.getValue();
				textfield1.setText(String.valueOf(ans));
			//if right one got error throw error
			}catch (NumberFormatException e2){
				System.out.println("Fuck Damn User");
				textfield1.setText("");
				textfield1.setStyle("-fx-border-color: red;");
				textfield2.setText("");
				textfield2.setStyle("-fx-border-color: red;");
				ans = 0;
			}
		}
		System.out.println(ans);
	}
	/**
	 * clear all state and parameter on UI
	 * @param event
	 */
	public void clear(ActionEvent event){
		textfield1.setText("");
		textfield1.setStyle("-fx-border-color: white;");
		textfield2.setText("");
		textfield2.setStyle("-fx-border-color: white;");
	}
}
