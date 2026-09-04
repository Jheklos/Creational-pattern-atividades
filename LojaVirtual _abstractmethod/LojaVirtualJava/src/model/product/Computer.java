package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class Computer extends Product {

    public Computer(NotaFiscalAbstractFactory nota) {

        super(nota);

        name = "Computer";
        price = 4500.0;

    }
}