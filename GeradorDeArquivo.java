import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class GeradorDeArquivo {
    public void salvaArquivoJson(Endereco endereco){
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); //imprima com a formatacao legal
            FileWriter escrita = new FileWriter(endereco.cep() + ".json");

            escrita.write(gson.toJson(endereco));
            escrita.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
