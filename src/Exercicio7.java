/*Substitua o codinome "Lisboa" por "Valência" na lista de agentes. Use o .set() */
import java.util.ArrayList;

public class Exercicio7 {
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Marselha");
        nomes.add("Lisboa");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Fabricio");

        nomes.set(2, "Valencia");
        System.out.println(nomes);
    }
    
}
