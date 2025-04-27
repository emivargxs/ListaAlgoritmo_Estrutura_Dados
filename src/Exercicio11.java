import java.util.ArrayList;

public class Exercicio11 { 
    //metodo que vai iniciar a missao: recebe a lista e eimprime
    public static void iniciarMissao(ArrayList<String>nomes){
        System.out.println("Agentes escalados:");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes.get(2));
    }
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Marselha");
        nomes.add("Lisboa");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Fabricio");

        iniciarMissao(nomes);

    }
}
