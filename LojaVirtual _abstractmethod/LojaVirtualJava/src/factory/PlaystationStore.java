package factory;


import factory.abstractFactory.NotaFiscalAbstractFactory;
import model.product.Playstation;
import model.product.PlaystationPortable;
import model.product.Product;

public class PlaystationStore extends ProductStore {

       
    public PlaystationStore(NotaFiscalAbstractFactory nota) {
        super(nota);
    }


    @Override
    protected Product createProduct(String type) {

        if (type.equals("playstation")) {
            return new Playstation(nota);

        } else if (type.equals("portable")) {
            return new PlaystationPortable(nota);

        } else {
            return null;
        }
    }
}
