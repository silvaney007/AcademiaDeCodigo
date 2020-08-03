package org.academiadecodigo.felinux.networking.chatconection.server;

public class ServerMain {

    public static void main(String[] args) {

        // exit application if no port number is specified
        if (args.length == 0) {
            System.out.println("Usage: java ChatServer [port]");
            System.exit(1);
        }

        Server chatServer = null;

        try {
            // try to create an instance of the ChatServer at port specified at args[0]
            chatServer = new Server(Integer.parseInt(args[0]));
            while (true) {
                chatServer.start();
            }
        } catch (NumberFormatException ex) {
            // write an error message if an invalid port was specified by the user
            System.out.println("Invalid port number " + args[0]);

        }
    }
}
