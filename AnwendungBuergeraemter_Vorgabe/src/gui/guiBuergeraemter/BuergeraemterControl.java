package gui.guiBuergeraemter;

import java.io.IOException;

import business.buergeramt.BuergeraemterModel;
import business.buergeramt.Buergeramt;
import javafx.stage.Stage;
import observers.Observer;

public class BuergeraemterControl implements Observer{
	private BuergeraemterView bamView;
	private BuergeraemterModel bamModel;
	
	public BuergeraemterControl(Stage stage) {
		
		this.bamModel = BuergeraemterModel.getInstance();
		this.bamView = new BuergeraemterView(this, stage, this.bamModel);
		this.bamModel.addObserver(this);
	}
	
	public void schreibeBuergeraemterInDatei(String typ) throws IOException {
		try {
			if("csv".equals(typ)) {
				this.bamModel.schreibeBuergeraemterInCsvDatei(typ);
				this.bamView.zeigeInformationsfensterAn("Die Bürgerämter wurden gespeichert!");
				
			} else { 
				this.bamModel.schreibeBuergeraemterInTxtDatei(typ);
				this.bamView.zeigeInformationsfensterAn("Die Bürgerämter wurden gespeichert");
			}
		} catch (IOException exc) {
			this.bamView.zeigeFehlermeldungsfensterAn("IOException beim Speichern!");
		} catch (Exception exc) {
			this.bamView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
		}
	}
	
	@Override
	public void update() {
		this.bamView.zeigeBuergeraemterAn();
	}
}
