package gui.guiStaedtischeEinrichtungen;

import business.BuergeraemterModel;
import javafx.stage.Stage;
import observers.Observer;

public class StaedtischeEinrichtungenControl implements Observer {
	private BuergeraemterModel bamModel;
	private StaedtischeEinrichtungenView seView;

	public StaedtischeEinrichtungenControl(Stage stage) {
		
		this.bamModel = BuergeraemterModel.getInstance();
		this.seView = new StaedtischeEinrichtungenView(this, stage, this.bamModel);
		this.bamModel.addObserver(this);

	}

	@Override
	public void update() {
		this.seView.zeigeBuergeraemterAn();
	}

}
