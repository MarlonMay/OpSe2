package factory;

public class ConcreteCsvCreator extends Creator {

    @Override
    public Product factoryMethod() {
        // TODO Auto-generated method stub
        return new ConcreteCsvProduct();
    }

}
