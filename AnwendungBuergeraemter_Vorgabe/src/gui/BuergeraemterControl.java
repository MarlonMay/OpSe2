package gui;

import java.io.IOException;

import business.BuergeraemterModel;
import business.Buergeramt;
import javafx.stage.Stage;

public class BuergeraemterControl {
	private BuergeraemterView bamView;
	private BuergeraemterModel bamModel;
	
	public BuergeraemterControl(Stage stage) {
		this.bamModel = new BuergeraemterModel();
		this.bamView = new BuergeraemterView(this, stage, this.bamModel);
	}
	
	public void schreibeBuergeraemterInDatei(String typ) throws IOException {
		try {
			if("csv".equals(typ)) {
				this.bamModel.schreibeBuergeraemterInCsvDatei(typ);
				this.bamView.zeigeInformationsfensterAn("Die Bürgerämter wurden gespeichert!");
			} else { 
				this.bamView.zeigeInformationsfensterAn("Noch nicht implementiert");
			}
		} catch (IOException exc) {
			this.bamView.zeigeFehlermeldungsfensterAn("IOException beim Speichern!");
		} catch (Exception exc) {
			this.bamView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
		}
	}
}
