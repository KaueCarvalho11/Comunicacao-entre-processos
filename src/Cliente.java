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

            PrintWriter saida = new PrintWriter(cliente.getOutputStream(), true);

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            saida.println("Obrigado por me deixar entrar");

            System.out.println("Resposta do servidor: " + entrada.readLine());
            ;

            cliente.close();
            saida.close();
            entrada.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro ao estabelecer conexão");
        }

    }

    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.inicialiaCliente();

    }

}
