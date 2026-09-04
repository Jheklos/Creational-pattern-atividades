public class App {
    public static void main(String[] args) throws Exception {

        Configuracao c1 = Configuracao.getInstance();

        Configuracao c2 = Configuracao.getInstance();

        System.out.println(c1 == c2);

       Configuracao ca = Configuracao.getInstance();
       Configuracao cb = Configuracao.getInstance();

       ca.setIdioma("Inglês");

        System.out.println(cb.getIdioma());

        /* 
        ConfiguracaoErrada c11 = new ConfiguracaoErrada();
        ConfiguracaoErrada c22 = new ConfiguracaoErrada();

        // Configuração 1
        c11.setIdioma("Português");
        c11.setTema("Escuro");

        // Configuração 2
        c22.setIdioma("Inglês");
        c22.setTema("Claro");

        System.out.println("Configuração 1");
        System.out.println("idioma = " + c11.getIdioma());
        System.out.println("tema = " + c11.getTema());

        System.out.println();

        System.out.println("Configuração 2");
        System.out.println("idioma = " + c22.getIdioma());
        System.out.println("tema = " + c22.getTema());
        */
        
    }
}
