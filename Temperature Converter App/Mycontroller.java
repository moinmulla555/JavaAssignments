package com.internshala.javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.SocketPermission;
import java.net.URL;
import java.util.ResourceBundle;

public class Mycontroller implements Initializable{

	@FXML
	public Label welcomelebel ;


	@FXML
	public ChoiceBox <String> choicebox;

	@FXML
	public TextField userinput;

	@FXML
	public Button buttoninput;

	private boolean isC_To_F=true;




	@Override
	public void initialize(URL location, ResourceBundle resources) {

		choicebox.getItems().add("Celcius To Fahrenheit");
		choicebox.getItems().add("Fahrenheit To Celcius ");


		choicebox.setValue("Celcius To Fahrenheit");
		choicebox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{

			     if(newValue.equals("Celcius To Fahrenheit")){
				     isC_To_F=true;
			     }
			     else{
			     	isC_To_F=false;
			     }


		});




		buttoninput.setOnAction(event -> {

			convert();

			});


	}
	private void convert(){
		String input=userinput.getText();
		float enteredvalue=0.0f;
		try {
			 enteredvalue=Float.parseFloat(input);
		}catch (Exception ex){
			warnUser();
			return;
		}



		float newenteredvalue=0;
		if(isC_To_F){
			newenteredvalue=(enteredvalue*9/5)+32;
		}
		else {
			newenteredvalue=(enteredvalue-32)*5/9;
		}

		display(newenteredvalue);
	}

	private void warnUser() {

		Alert alert=new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error Occured");
		alert.setHeaderText("Invalid Tempreature Entered");
		alert.setContentText("Please Entered Valid Temprature");
		alert.show();

	}

	private void display(float newenteredvalue) {
		String unit= isC_To_F? "F":"C";
		System.out.printf("The new temperature is:"+newenteredvalue+unit);

		Alert alert=new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Result");
		alert.setContentText("The new temperature is :"+" "+newenteredvalue + unit);
		alert.show();
	}

}
