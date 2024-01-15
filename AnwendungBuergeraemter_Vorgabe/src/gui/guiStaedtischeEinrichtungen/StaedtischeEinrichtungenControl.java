package gui.guiStaedtischeEinrichtungen;

import business.buergeramt.BuergeraemterModel;
import business.sporthallen.SporthallenModel;
import javafx.stage.Stage;
import observers.Observer;

public class StaedtischeEinrichtungenControl implements Observer {
	private BuergeraemterModel bamModel;
	private SporthallenModel shModel;
	private StaedtischeEinrichtungenView seView;

	public StaedtischeEinrichtungenControl(Stage stage) {
		
		this.bamModel = BuergeraemterModel.getInstance();
		this.shModel = SporthallenModel.getInstance();
		this.seView = new StaedtischeEinrichtungenView(this, stage, this.bamModel, this.shModel);
		this.bamModel.addObserver(this);

	}

	@Override
	public void update() {
		this.seView.zeigeBuergeraemterAn();
	}

}
