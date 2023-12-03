package factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Buergeramt;

public class ConcreteCsvProduct extends Product{

    @Override
    public void addBuergeramt(Buergeramt buergeramt) throws IOException {
        BufferedWriter buffi = new BufferedWriter(new FileWriter("Buergeraemter.csv"));
        buffi.write(buergeramt.gibBuergeramtZurueck(';'));
        buffi.flush();
        buffi.close();
        
    }

}
