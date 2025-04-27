/*
 Converta cada nome da lista de codinomes em uma versão cifrada, trocando cada
letra por ‘*’. Use o .replaceAll().
 */
import java.util.ArrayList;

public class Exercicio9 {
    public static void main(String[] args) {
    ArrayList <String> nomes = new ArrayList <> ();
    nomes.add("João");
    nomes.add("Marselha");
    nomes.add("Lisboa");
    nomes.add("Pedro");
    nomes.add("Lucas");
    nomes.add("Fabricio");

    for(int i = 0; i < nomes.size(); i++){
        nomes.set(i, nomes.get(i).replaceAll(".", "*"));
    }
    for(String versaoCifrada : nomes){
        System.out.println(versaoCifrada);
    }
    }
    
}
