package model;

public abstract class Product {

    protected String name;
    protected Double price;

    public void getProduct() {
        System.out.println("Product: " + name);
    }

    public void getPrice() {
        System.out.println("Price: R$ " + price);
    }

    public String getName() {
        return name;
    }
}