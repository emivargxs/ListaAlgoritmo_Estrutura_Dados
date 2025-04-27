/*Verifique se o codinome “Marselha” está na lista dos agentes. Imprima uma mensagem
personalizada se estiver. Use o método contains
import java.util.ArrayList; */

import java.util.ArrayList;

public class Exercicio2 {
 public static void main(String[] args) {
     ArrayList <String> nomes = new ArrayList<>();
     nomes.add("João");
     nomes.add("Marselha");
     nomes.add("Maria");
     nomes.add("Pedro");
     nomes.add("Lucas");
     nomes.add("Fabricio");

     if(nomes.contains("Marselha")){
         System.out.println("Marselha esta na lista de agentes");
     }else{
        System.out.println("Marselha nao esta na lista de agentes");
     }
    }   
}
