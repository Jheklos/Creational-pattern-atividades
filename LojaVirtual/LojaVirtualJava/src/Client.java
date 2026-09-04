import factory.ComputerStore;
import factory.PlaystationStore;
import factory.ProductStore;
import model.Product;


public class Client {

    public static void main(String[] args) {

        ProductStore computerStore = new ComputerStore();

        ProductStore playstationStore = new PlaystationStore();


        Product product = computerStore.orderProduct("notebook");

        System.out.println("Customer ordered a " + product.getName() + "\n");


        product = playstationStore.orderProduct("playstation");

        System.out.println( "Customer ordered a " + product.getName() + "\n");


        product = playstationStore.orderProduct("portable");

        System.out.println("Customer ordered a " + product.getName() + "\n");
    }
}