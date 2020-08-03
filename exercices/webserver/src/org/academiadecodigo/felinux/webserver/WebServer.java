package org.academiadecodigo.felinux.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer implements Runnable {


    public static final int SERVER_PORT = 9090;
    private Socket clientSocket;
    private static ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;
    private DataOutputStream dataOutputStream;
    private String path = "";


    public WebServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }


    public static void main(String[] args) {

        try {
            ExecutorService fixedPool = Executors.newFixedThreadPool(5);

            System.out.println("\nBinding to port " + SERVER_PORT);

            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println(serverSocket + " ON ");
            System.out.println("\nWaiting for client ...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                fixedPool.submit(new WebServer(clientSocket));
                System.out.println(Thread.currentThread().getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            inputBufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            clientRequest();
            serverResponse();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    private void clientRequest() {
        try {

            path = inputBufferedReader.readLine().split(" ")[1];
            System.out.println("Client Request: " + path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void serverResponse() {

        try {

            InputStream fileReader;
            String myPagePath = "/index.html";
            String notFoundPath = "/404NotFound.html";
            String myImagePath = "/inspiration.jpg";
            File file;

            if (path.equals(myPagePath)) {
                file = file(myPagePath);
                fileReader = new FileInputStream(file);
                dataOutputStream.writeBytes(header(file));
            } else if (path.equals(myImagePath)) {
                file = file(myImagePath);
                fileReader = new FileInputStream(file);
                dataOutputStream.writeBytes(headerFile(file, "jpg"));
            } else {
                file = file(notFoundPath);
                fileReader = new FileInputStream(file);
                dataOutputStream.writeBytes(headerNotFound(file));
            }

            dataOutputStream.write(fileReader.readAllBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String header(File file) {
        return "HTTP/1.1 200 Document Follows\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: " + file.length() + "\r\n\r\n";
    }

    private String headerNotFound(File file) {
        return "HTTP/1.1 404 Not Found\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length:" + file.length() + "\r\n\r\n";
    }

    private String headerFile(File file, String extension) {
        return "HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: image/" + extension + "\r\n" +
                "Content-Length: " + file.length() + "\r\n\r\n";
    }

    private File file(String nameAndExtension) {
        return new File("resources" + nameAndExtension);
    }

    public void close() {
        try {
            inputBufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}