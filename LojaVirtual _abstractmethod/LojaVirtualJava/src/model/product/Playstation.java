package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class Playstation extends Product {

    public Playstation(NotaFiscalAbstractFactory nota) {
        super(nota);
    }

    public void getPlaystation() {
        name = "Playstation";
        price = 4000.0;
    }
}