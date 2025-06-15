import java.io.*;
import java.net.*;

public class Cliente {

    private String host;
    private int porta;

    public Cliente() {
        host = "localhost";
        porta = 8000;
    }

    public void inicialiaCliente() {

        try {
            Socket cliente = new Socket(host, porta);
            System.out.println("Estabelecendo conexão com a porta: " + porta);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro ao estabelecer conexão");
        }

    }

}
