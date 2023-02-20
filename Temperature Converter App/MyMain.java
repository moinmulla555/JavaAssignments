package com.internshala.javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.beans.EventHandler;
import java.util.Optional;

public class MyMain extends Application {

	public static void main(String[]args){
       launch(args);
	}



	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
		VBox rootNode = loader.load();

		MenuBar menuBar=createmenu();
		rootNode.getChildren().add(0,menuBar);

		Scene scene = new Scene(rootNode);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Temperature Converter Tool");
		primaryStage.show();
	}

	private MenuBar createmenu(){
		 Menu filemenu=new Menu("File");
		MenuItem newmenu=new MenuItem("New");
		newmenu.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("New menu Clicked items");
			}
		});



		MenuItem Quitmenu=new MenuItem("Quit");
		Quitmenu.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
				System.exit(0);
			}
		});
		filemenu.getItems().addAll(newmenu,Quitmenu);

		Menu helpmenu=new Menu("Help");
		MenuItem aboutapp=new MenuItem("About");

		aboutapp.setOnAction(event -> aboutapp());
		helpmenu.getItems().addAll(aboutapp);

		MenuBar menuBar=new MenuBar();
		menuBar.getMenus().addAll(filemenu,helpmenu);

		return menuBar;
	}

	private void aboutapp() {
		Alert alertdialog = new Alert(Alert.AlertType.INFORMATION);
		alertdialog.setTitle("Tempreature Converter");
		alertdialog.setContentText("App Convert Temperaure From Different Unit");

		ButtonType yesbtn =new ButtonType("Yes");
		ButtonType nobtn =new ButtonType("No");

		 alertdialog.getButtonTypes().setAll(yesbtn, nobtn);

		Optional<ButtonType> clickbtn= alertdialog.showAndWait();

		if( clickbtn.isPresent() &&clickbtn.get()==yesbtn){
			System.out.println("Yes button is clicked");
		}

		else{
			System.out.println("No button is clicked");

		}
	}

}
