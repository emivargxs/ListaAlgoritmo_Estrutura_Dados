/* Crie um ArrayList<String> com os codinomes de 5 agentes. Adicione um novo agente e
remova um infiltrado identificado. Use os métodos .add e .remove */
import java.util.ArrayList;
public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Fabricio");

        System.out.println("Todos os agentes" + nomes);
        //adicionando novo agente
        nomes.add("Cesar");
        System.out.println("Todos os agentes" + nomes);

        nomes.remove("Maria");
        System.out.println("Todos os agentes" + nomes);

    }

}
