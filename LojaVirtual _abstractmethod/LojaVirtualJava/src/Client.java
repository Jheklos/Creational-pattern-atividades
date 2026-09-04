import factory.ComputerStore;
import factory.ProductStore;
import factory.abstractFactory.ComputerNotaFiscalAbstractFactory;
import factory.abstractFactory.NotaFiscalAbstractFactory;
import model.product.Product;

public class Client {

    public static void main(String[] args) {

        NotaFiscalAbstractFactory nota =new ComputerNotaFiscalAbstractFactory();
        ProductStore store = new ComputerStore(nota);

        Product product = store.orderProduct("computer");

        System.out.println("Customer ordered a "+ product.getName());

        product.printNotaFiscal();
    }
}