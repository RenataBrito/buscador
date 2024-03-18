public class Main {
    public static void main(String[] args) {
        //buscar dados do endereco viacep.com.br/ws/01001000/json/

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco endereco = consultaCep.buscaEndereco("1");

        System.out.println(endereco);
    }
}