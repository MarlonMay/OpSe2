package factory;
import java.io.IOException;

import business.Buergeramt;

public abstract class Product {
    public abstract void addBuergeramt(Buergeramt buergeramt) throws IOException;
}
