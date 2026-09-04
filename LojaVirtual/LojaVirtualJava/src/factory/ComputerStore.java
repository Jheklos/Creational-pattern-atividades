package factory;

import model.Computer;
import model.NoteBook;
import model.Product;

public class ComputerStore extends ProductStore {

    @Override
    protected Product createProduct(String type) {

        if (type.equals("notebook")) {
            return new NoteBook();

        } else if (type.equals("computer")) {
            return new Computer();

        } else {
            return null;
        }
    }
}
