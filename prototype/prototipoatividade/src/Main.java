public class Main {

    public static void main(String[] args) {

        // Criando o personagem protótipo
        Personagem guerreiro = new Personagem();

        guerreiro.setNome("Guerreiro");
        guerreiro.setVida(100);
        guerreiro.setMana(50);
        guerreiro.setForca(80);
        guerreiro.setDefesa(90);

        // Clonando o protótipo
        Personagem guerreiro2 = guerreiro.clone();
        Personagem guerreiro3 = guerreiro.clone();
        Personagem guerreiro4 = guerreiro.clone();

        // Fazendo pequenas alterações
        guerreiro2.setForca(85);
        guerreiro3.setForca(70);
        guerreiro4.setDefesa(100);

        // Exibindo o guerreiro original
        System.out.println("=== Guerreiro Original ===");
        System.out.println("Nome: " + guerreiro.getNome());
        System.out.println("Vida: " + guerreiro.getVida());
        System.out.println("Mana: " + guerreiro.getMana());
        System.out.println("Força: " + guerreiro.getForca());
        System.out.println("Defesa: " + guerreiro.getDefesa());

        // Exibindo o guerreiro 4
        System.out.println("\n=== Guerreiro 4 ===");
        System.out.println("Nome: " + guerreiro4.getNome());
        System.out.println("Vida: " + guerreiro4.getVida());
        System.out.println("Mana: " + guerreiro4.getMana());
        System.out.println("Força: " + guerreiro4.getForca());
        System.out.println("Defesa: " + guerreiro4.getDefesa());
    }
}
