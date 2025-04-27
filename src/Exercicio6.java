/*Crie uma lista com codinomes repetidos. Escreva um código para remover todas as
duplicatas, mantendo apenas um de cada.*/

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio6 {
    public static void main(String[] args) {
    ArrayList <String> nomes = new ArrayList <> ();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Lucas");
        nomes.add("Fabricio");

        HashSet <String> nomesUnicos = new HashSet<>(nomes);
        System.out.println("Sem repetir");
        for(String nome: nomesUnicos){
            System.out.println(nome);
        }
    }
    }
    
