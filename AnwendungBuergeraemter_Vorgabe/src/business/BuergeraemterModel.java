package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import factory.ConcreteCsvCreator;
import factory.ConcreteTxtCreator;
import factory.Creator;
import factory.Product;
import observers.Observable;
import observers.Observer;

public class BuergeraemterModel implements Observable {
	private Buergeramt buergeramt;
	private static BuergeraemterModel instance;
	private Vector<Observer> observers;
	
	private BuergeraemterModel() {
		this.observers = new Vector<Observer>();
	}
	
	public static BuergeraemterModel getInstance() {
		
		if(instance == null) {
			instance = new BuergeraemterModel();
			return instance;
		} 
		return instance;
	}
	

	public void schreibeBuergeraemterInCsvDatei(String typ) throws IOException {
		Creator creator = new ConcreteCsvCreator();
		Product product = creator.factoryMethod();
		product.fuegeInDateiHinzu(this.buergeramt);
		product.schliesseDatei();
	}
	
	public void schreibeBuergeraemterInTxtDatei(String typ) throws IOException {
		Creator creator = new ConcreteTxtCreator();
		Product product = creator.factoryMethod();
		product.fuegeInDateiHinzu(this.buergeramt);
		product.schliesseDatei();
	}
	
	public void setBuergeramt(Buergeramt buergeramt) {
		this.buergeramt = buergeramt;
	}
	
	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}

	@Override
	public void addObserver(Observer obs) {
		observers.addElement(obs);
		
	}

	@Override
	public void removeObserfer(Observer obs) {
		observers.removeElement(obs);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer current: observers) {
			current.update();
		}
		
	}	
	
	
}