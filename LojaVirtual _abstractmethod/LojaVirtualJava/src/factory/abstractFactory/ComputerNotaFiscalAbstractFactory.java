package factory.abstractFactory;

import model.nota.ComputerNotaFiscal;
import model.nota.NotaFiscal;

public class ComputerNotaFiscalAbstractFactory
        implements NotaFiscalAbstractFactory {

    @Override
    public NotaFiscal createNotaFiscal() {

        return new ComputerNotaFiscal();

    }
}
