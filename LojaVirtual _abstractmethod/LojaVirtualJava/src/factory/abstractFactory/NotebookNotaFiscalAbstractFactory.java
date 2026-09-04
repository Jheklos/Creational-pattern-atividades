package factory.abstractFactory;


import model.nota.NotaFiscal;
import model.nota.NotebookNotaFiscal;

public class NotebookNotaFiscalAbstractFactory implements NotaFiscalAbstractFactory{

    
    public NotaFiscal createNotaFiscal() {
        return new NotebookNotaFiscal();
    }

}
