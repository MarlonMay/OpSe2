package business.sporthallen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SporthallenModel {

	private ArrayList<Sporthalle> sporthallen = new ArrayList<Sporthalle>();
	private static SporthallenModel instance;

	private SporthallenModel() {
	}

	public static SporthallenModel getInstance() {
		if (instance == null) {
			instance = new SporthallenModel();
			return instance;
		}
		return instance;
	}

	public void leseSporthallenAusCsvDatei() throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Sporthallen.csv"));
		ArrayList<Sporthalle> ergebnis = new ArrayList<>();
		String zeileStr = ein.readLine();
		while (zeileStr != null) {
			String[] zeile = zeileStr.split(";");
			ergebnis.add(new Sporthalle(zeile[0], Integer.parseInt(zeile[1]), zeile[2]));
			zeileStr = ein.readLine();
		}
		ein.close();
		this.sporthallen = ergebnis;
	}

	public void setBuergeramt(Sporthalle sporthalle) {
		this.sporthallen.add(sporthalle);
	}

	public ArrayList<Sporthalle> getSporthallen() {
		return this.sporthallen;
	}
}