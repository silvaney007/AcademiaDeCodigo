package org.academiadecodigo.felinux.networking.chatconection.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;


public class Server implements Runnable {

    private Socket clientSocket;
    private ServerSocket serverSocket;
    private BufferedReader inputBufferedReader;
    private DataOutputStream dataOutputStream;
    private ExecutorService pool;
    private final int numPool = 5;
    private String input;
    private ArrayList <Socket> clientList;


    public Server(int port) {

        try {

            System.out.println("Binding to port " + port);
            serverSocket = new ServerSocket(port);
            pool = Executors.newFixedThreadPool(numPool);
            this.clientList = new ArrayList<>();
        } catch (IOException ioe) {

            System.out.println(ioe.getMessage());

        }
    }

    public void start() {

        System.out.println("Waiting for a client connection");

        try {

            while (true) {

                clientSocket = serverSocket.accept();
                System.out.println(clientSocket.getInetAddress() + " join chat.");
                setClientList(clientSocket);
                pool.submit(this::run);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        handleClient();
    }

    private synchronized void setClientList(Socket clientSocket) {
        clientList.add(clientSocket);
    }

    /**
     * Handles Client connection only ending when receiving null or "/quit"
     */

    public synchronized void handleClient() {

        try {

            if (clientList.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (Socket clientSocket : clientList){

                if (input.equals("/quit")) {
                    input = "Client leave the chat";
                    clientList.remove(clientSocket);
                }

                System.out.println(input);
                broadCast(clientList);
                notify();
            }

        } catch (IOException ex) {

            System.out.println("Receiving error: " + ex.getMessage());

        }
    }

    private void broadCast(ArrayList clientList) {

        try {
            for (Socket sc : clientList){

                if (clientSocket.equals(sc)) {
                    continue;
                }
                setupOutputStream(sc);
                dataOutputStream.writeBytes(input);
            }

        } catch (IOException ex) {

            System.out.println("Receiving error: " + ex.getMessage());

        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Instantiate a buffered reader from the input stream of the client socket
     *
     * @throws IOException
     */

    public String setupInputStream(Socket clientSocket) throws IOException {

        String response = "";
        String line = "";

        inputBufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        if ((line = inputBufferedReader.readLine()) == null) {
            return response;
        }

        while (line != null) {
            response += line + "/n";
            line = inputBufferedReader.readLine();
        }
        return response;
    }

    public void setupOutputStream(Socket clientSocket) throws IOException {
        dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
    }

    /**
     * Closes the client socket and the buffered input reader
     */

    public void close() {

        try {

            if (clientSocket != null) {
                System.out.println("Closing client connection");
                clientSocket.close();
            }

            if (serverSocket != null) {
                System.out.println("Closing server socket");
                serverSocket.close();
            }

        } catch (IOException ex) {

            System.out.println("Error closing connection: " + ex.getMessage());

        }

    }
}

