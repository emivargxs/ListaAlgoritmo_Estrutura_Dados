/*Imprima a lista de mensagens cadastradas em ordem inversa (da mais recente para a
mais antiga). */
import java.util.ArrayList;

public class Exercicio5 {
    public static void main(String[] args) {
        ArrayList <String> mensagem = new ArrayList <> ();
        mensagem.add("Adicionando mensagem 1");
        mensagem.add("Adicionando mensagem 2");
        mensagem.add("Adicionando mensagem 3");
        mensagem.add("Adicionando mensagem 4");

        // mensagem em ordem inversa
        for(int i = mensagem.size() - 1; i >= 0; i--){
            System.out.println(mensagem.get(i));
        }
    }
}
