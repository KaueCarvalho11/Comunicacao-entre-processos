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
            System.out.print("Servidor iniciado na porta " + port);

        } catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("Erro ao inicializar servidor");
        }
    }
}

    