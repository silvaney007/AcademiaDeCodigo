package org.academiadecodigo.felinux.neteworking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hostName = "127.1.1.0";
        int port = 8080;
        byte[] receiveBuffer = new byte[1024];
        String message;
        DatagramSocket socket = null;

        try {

            System.out.print("write your message: ");
            message = sc.nextLine();
            socket = new DatagramSocket();
            DatagramPacket sendPacket = new DatagramPacket(message.getBytes(), message.getBytes().length,
                    InetAddress.getByName(hostName), port);
            socket.send(sendPacket);

            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            socket.receive(receivePacket);

            System.out.println(new String(receivePacket.getData()));

            socket.close();

        } catch (SocketException err) {
            System.out.println(err.getMessage());
        } catch (IOException err) {
            System.out.println(err.getMessage());
        } finally {
            sc.close();
        }
    }
}
