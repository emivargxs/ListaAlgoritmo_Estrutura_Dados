import java.util.ArrayList;

public class Exercicio10 {
//metodo que cria e retorna a lista

public static ArrayList<String> listaCodinomes(){
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("João");
    nomes.add("Marselha");
    nomes.add("Lisboa");
    nomes.add("Pedro");
    nomes.add("Lucas");
    nomes.add("Fabricio");
    return nomes;
}

public static String gerarRelatorio(ArrayList<String> nomes) {
    StringBuilder relatorio = new StringBuilder();
    relatorio.append("Relatório de Codinomes:\n");
    relatorio.append("------------------------\n");
    
    for (String nome : nomes) {
        relatorio.append(nome).append("\n");  // Adiciona cada nome seguido de uma nova linha
    }
    
    return relatorio.toString();  // Retorna o relatório como uma string
}

public static void main(String[] args) {
    // Obtém a lista de codinomes
    ArrayList<String> nomes = listaCodinomes();

    // Gera o relatório com os codinomes
    String relatorio = gerarRelatorio(nomes);

    // Imprime o relatório
    System.out.println(relatorio);
}
}
