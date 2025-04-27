
//Adicione várias mensagens secretas em uma lista. Acesse e imprima a última
//mensagem recebida.
import java.util.ArrayList;
public class Exercicio4 {
    public static void main(String[] args) {
        
    
    ArrayList <String> mensagem = new ArrayList<>();
    //Adicionando varias mensagens
    mensagem.add("Adicionando mensagem 1");
    mensagem.add("Adicionando mensagem 2");
    mensagem.add("Adicionando mensagem 3");
    mensagem.add("Adicionando mensagem 4");

    //imprimindo todas as mensagens
        System.out.println(mensagem);

    //acessando a ultima mensagem
        System.out.println("Acessando a ultima mensagem:");
        System.out.println(mensagem.get(3));
    }
}
