import java.io.*;
import java.net.*;

public class Server {
    private int port;

    public Server(){
        port = 8000;
    }

    public void iniciarServidor(){
        try{
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado na porta " + port);

            Socket cliente = server.accept();
            System.out.println("Cliente conectado: + " + cliente.getInetAddress());

            PrintWriter saida = new PrintWriter(cliente.getOutputStream(), true);

            BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            System.out.println("Mensagem recebida: " + entrada.readLine());
            saida.println("Hello world");

            server.close();
            cliente.close();
            saida.close();
            entrada.close();

        } catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("Erro ao inicializar servidor");
        }
    }

    public static void main(String[]args){
        Server s1 = new Server();
        s1.iniciarServidor();
    }
}      