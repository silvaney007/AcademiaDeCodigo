package org.academiadecodigo.felinux.neteworking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) {

        int port = 8080;
        byte[] receiveBuffer = new byte[1024];
        DatagramSocket socket = null;
        String message;

        try {


            socket = new DatagramSocket(port);
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);

            message = new String(receivePacket.getData()).toUpperCase();

            System.out.println(message);

            DatagramPacket sendPacket = new DatagramPacket(message.getBytes(), message.getBytes().length,
                    receivePacket.getAddress(), receivePacket.getPort());

            socket.send(sendPacket);
            socket.close();

        } catch (SocketException err) {
            System.out.println(err.getMessage());
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
}
