package de.gedoplan.seminar.java.demo.stdlib;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class NetworkingDemo {

    public static void main(String[] args) {
        // read google.com
        readGoogle();

        // Socket Kommunikation
        clientServerTalking();
    }

    private static void readGoogle() {
        try {
            URL url = new URL("http://google.com");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        System.out.println();
    }

    private static void clientServerTalking() {
        startServer();
        startClient("John");
        startClient("Bob");
    }

    private static void startServer() {
        System.out.println("Starte server im eigenen Thread...");
        Runnable r = () -> {
            try (ServerSocket ss = new ServerSocket(44444)) {
                while (true) {
                    Socket client = ss.accept();
                    try (InputStream is = client.getInputStream()) {
                        Scanner scanner = new Scanner(is);
                        // Client spricht...
                        String name = scanner.nextLine();
                        System.out.println("Server: lass mal überlegen...");
                        Thread.sleep(5000);
                        // Server antwortet
                        PrintWriter pw = new PrintWriter(new OutputStreamWriter(client.getOutputStream()), true);
                        pw.println("Hallo " + name + ", Grüße vom Server!");
                    }
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(r);
        // Deamon Thread wird automatisch beendet, wenn der aufrufende Thread endet
        thread.setDaemon(true);
        thread.start();
    }

    private static void startClient(String name) {
        System.out.println("Starte client...");
        try (Socket socket = new Socket("localhost", 44444)) {
            Scanner scanner = new Scanner(socket.getInputStream());

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            // Nachricht an den Server...
            System.out.println("Client: hey, Server, was geht?");
            pw.println(name);

            // was antwortet der Server?
            String greeting = scanner.nextLine();
            System.out.println(greeting);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Client ende.");
        System.out.println();
    }
}
