package factory;


import model.Playstation;
import model.PlaystationPortable;
import model.Product;

public class PlaystationStore extends ProductStore {

    @Override
    protected Product createProduct(String type) {

        if (type.equals("playstation")) {
            return new Playstation();

        } else if (type.equals("portable")) {
            return new PlaystationPortable();

        } else {
            return null;
        }
    }
}
