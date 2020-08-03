package org.academiadecodigo.felinux.networking.chatconection.client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ChatClient class
 */

public class Client {

    private Socket socket;
    private BufferedReader inputBufferedReader;
    private BufferedWriter outputBufferedWriter;

    /**
     * @param serverAddress server IP address
     * @param serverPort    server port number
     */
    public Client(String serverAddress, int serverPort) {

        System.out.println("Trying to establishing the connection, please wait...");

        try {

            // connect to the specified host name and port
            socket = new Socket(serverAddress, serverPort);
            System.out.println("Connected to: " + socket);

            // create the streams
            setupSocketStreams();

        } catch (UnknownHostException ex) {

            System.out.println("Host unknown: " + ex.getMessage());
            System.exit(1);

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            System.exit(1);

        }

    }

    /**
     * ChatServer entry point, processes the arguments and instantiates the chat client object
     *
     * @param args the chat server host ip and port
     */

    public static void main(String args[]) {

        if (args.length != 2) {

            System.out.println("Usage: java ChatClient <host> <port>");
            System.exit(1);

        }

        try {

            Client client = new Client(args[0], Integer.parseInt(args[1]));
            // receive input from console and send to server
            client.communicate();
            // close the client socket and buffers
            //client.stop();

        } catch (NumberFormatException ex) {

            System.out.println("Invalid port number " + args[0]);

        }

    }

    private void communicate() {
        String line = "";

        // while the client doesn't signal to quit
        while (!line.equals("/quit")) {

            try {

                // read the pretended message from the console
                line = inputBufferedReader.readLine();

                // write the pretended message to the output buffer
                outputBufferedWriter.write(line);
                outputBufferedWriter.newLine();
                outputBufferedWriter.flush();

            } catch (IOException ex) {

                System.out.println("Sending error: " + ex.getMessage() + ", closing client...");
                break;

            }
        }
    }

    /**
     * Instantiate the buffered readers and writers from the standard input and the socket output stream
     *
     * @throws IOException
     */

    public void setupSocketStreams() throws IOException {

        inputBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        outputBufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

    }

    /**
     * Close the buffers and the socket
     */

    public void stop() {

        try {

            if (socket != null) {
                System.out.println("Closing the socket");
                socket.close();
            }

        } catch (IOException ex) {

            System.out.println("Error closing connection: " + ex.getMessage());

        }
    }
}