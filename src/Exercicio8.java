/* Ordene alfabeticamente a lista de codinomes. Use o .sort de Collections.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio8 {
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList <>();
        nomes.add("João");
        nomes.add("Marselha");
        nomes.add("Lisboa");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Fabricio");

        Collections.sort(nomes);
        for(String ordenacao : nomes){
            System.out.println(ordenacao);
        }
    }
    
}
