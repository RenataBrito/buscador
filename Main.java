import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //buscar dados do endereco viacep.com.br/ws/01001000/json/
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        System.out.println("Digite o numero de cep para consulta:");
        var cep = leitura.nextLine(); //entende que é uma string pq eh nextline
        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            geradorDeArquivo.salvaArquivoJson(endereco);
            System.out.println(endereco);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}