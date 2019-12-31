package pbouda.jfr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        Jfr.start("jdk.SocketRead", "jdk.SocketWrite");

        try (ServerSocket ss = new ServerSocket(5056)) {
            while (true) {
                Socket socket = ss.accept();
                System.out.println("A new client is connected : " + socket);

                new ClientHandler(socket).start();
            }
        }
    }


    private static class ClientHandler extends Thread {
        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (DataInputStream dis = new DataInputStream(socket.getInputStream());
                 DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                 socket) {

                while (true) {
                    dos.writeUTF("Tell me your name");
                    String name = dis.readUTF();
                    dos.writeUTF("Hello " + name);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
