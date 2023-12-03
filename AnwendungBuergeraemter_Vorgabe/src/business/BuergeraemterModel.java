package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import factory.Creator;
import factory.Product;
import factory.ConcreteCsvCreator;
import factory.ConcreteTxtCreator;


public class BuergeraemterModel {
	private Buergeramt buergeramt;
	

	public void schreibeBuergeraemterInCsvDatei() throws IOException {
	    Creator csvCreator = new ConcreteCsvCreator();
	    Product prodi = csvCreator.factoryMethod();
	    prodi.addBuergeramt(this.buergeramt);   
	}
	
	public void schreibeBuergeraemterInTxtDatei() throws IOException {
        Creator txtCreator = new ConcreteTxtCreator();
        txtCreator.factoryMethod().addBuergeramt(this.buergeramt);
        
    }
	
	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
	}
	
	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}	
}