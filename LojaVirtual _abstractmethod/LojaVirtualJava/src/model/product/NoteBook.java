package model.product;

import factory.abstractFactory.NotaFiscalAbstractFactory;

public class NoteBook extends Product {

    public NoteBook(NotaFiscalAbstractFactory nota) {
        super(nota);
    }

    public void getNoteBook() {
        name = "Notebook";
        price = 3500.0;
    }
}