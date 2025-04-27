/* Mostre a ordem de chegada dos agentes à base imprimindo todos os elementos da
lista. */
import java.util.ArrayList;

public class Exercicio3 {
public static void main(String[] args) {
    ArrayList <String> nomes = new ArrayList <> ();
     nomes.add("João");
     nomes.add("Marselha");
     nomes.add("Maria");
     nomes.add("Pedro");
     nomes.add("Lucas");
     nomes.add("Fabricio");
     
     int contador = 1;
     for(int i = 0; i < nomes.size(); i++) {
        int chegada = contador++;
         System.out.println(chegada + "-" +nomes.get(i));
     }
}
}
