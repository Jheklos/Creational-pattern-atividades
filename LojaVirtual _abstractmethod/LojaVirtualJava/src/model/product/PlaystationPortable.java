package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class PlaystationPortable extends Product {

    public PlaystationPortable(NotaFiscalAbstractFactory nota) {
        super(nota);
    }

    public void getPlaystationPortable() {
        name = "Playstation Portable";
        price = 3000.0;
    }
}