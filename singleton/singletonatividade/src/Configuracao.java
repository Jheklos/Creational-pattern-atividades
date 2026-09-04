public class Configuracao {

    private String idioma;
    private String tema;

    // Única instância da classe
    private static Configuracao instance;

    // Construtor privado
    private Configuracao() {
        idioma = "Português";
        tema = "Claro";
    }

    // Método para obter a única instância
    public static Configuracao getInstance() {

        if (instance == null) {
            instance = new Configuracao();
        }

        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}