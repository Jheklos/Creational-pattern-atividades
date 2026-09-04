package factory;

import factory.abstractFactory.NotaFiscalAbstractFactory;
import model.product.Computer;
import model.product.NoteBook;
import model.product.Product;

public class ComputerStore extends ProductStore {

    public ComputerStore(NotaFiscalAbstractFactory nota) {

        super(nota);

    }

    @Override
    protected Product createProduct(String type) {

        if (type.equals("notebook")) {

            return new NoteBook(nota);

        } else if (type.equals("computer")) {

            return new Computer(nota);

        } else {

            return null;

        }
    }
}
