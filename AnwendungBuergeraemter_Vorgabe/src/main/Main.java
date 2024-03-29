package main;


import java.io.IOException;

import business.sporthallen.SporthallenModel;
import gui.guiBuergeraemter.BuergeraemterControl;
import gui.guiStaedtischeEinrichtungen.StaedtischeEinrichtungenControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	
	public static void main(String[] args){
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) {
		new BuergeraemterControl(primaryStage);
		Stage fensterStaedtischeEinrichtungen = new Stage();
		new StaedtischeEinrichtungenControl(fensterStaedtischeEinrichtungen);
	}	
}
