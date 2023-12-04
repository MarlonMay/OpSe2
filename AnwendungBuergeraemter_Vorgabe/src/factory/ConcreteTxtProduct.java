package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteTxtProduct extends Product{
	private BufferedWriter buffi = null;
	
	public ConcreteTxtProduct() {
		try {
			buffi = new BufferedWriter(new FileWriter("Buergeraemter.txt",true));
			} catch(IOException e) {
			}
	}
	
	@Override
	public void fuegeInDateiHinzu(Object object) throws IOException {
		Buergeramt buergi = (Buergeramt) object;
		String buergerAmtAlsString = getBuergeramtAlsString(buergi, ';');
		
		buffi.write(buergerAmtAlsString);
		buffi.flush();
	}

	@Override
	public void schliesseDatei() throws IOException {
		buffi.close();
		
	}
	
	private String getBuergeramtAlsString(Buergeramt buergeramt, char trenner) {
		return "Daten des Bürgeramts" + "\n"
				+ "Name des Bürgeramts: " + buergeramt.getName() + "\n"
				+ "Öffnungszeit des Bürgeramts: " + buergeramt.getGeoeffnetVon() + " - " + buergeramt.getGeoeffnetBis() + "\n"
				+ "Straße und Hausnummer des Bürgeramts: " + buergeramt.getStrasseHNr() + "\n"
				+ "Dienstleistungen des Bürgeramts: " + buergeramt.getDienstleistungenAlsString(trenner) + "\n";	
	}
}
