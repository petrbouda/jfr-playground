package pbouda.jfr;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) throws Exception{
        Jfr.start("jdk.SocketRead", "jdk.SocketWrite");
        Scanner scn = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 5056);
             DataInputStream dis = new DataInputStream(socket.getInputStream());
             DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {

            while (true) {
                System.out.println(dis.readUTF());
                String name = scn.nextLine();
                dos.writeUTF(name);

                String received = dis.readUTF();
                System.out.println(received);
            }
        }
    }
} 