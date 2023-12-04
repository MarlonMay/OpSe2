package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteCsvProduct extends Product{
	private BufferedWriter buffi = null;
	
	public ConcreteCsvProduct()  {
		try {
		buffi = new BufferedWriter(new FileWriter("Buergeraemter.csv",true));
		} catch(IOException e) {
			
		}
		
	}
	
	@Override
	public void fuegeInDateiHinzu(Object object) throws IOException {
		Buergeramt buergi = (Buergeramt) object;
		buffi.write(buergi.gibBuergeramtZurueck(';'));
		buffi.flush();
		
	}

	@Override
	public void schliesseDatei() throws IOException {
		buffi.close();
	}

}
