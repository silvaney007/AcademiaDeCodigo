package org.academiadecodigo.felinux.diney;

import org.academiadecodigo.felinux.diney.hotel.Hotel;
import org.academiadecodigo.felinux.diney.hotel.ServiceType;
import org.academiadecodigo.felinux.diney.hotel.clients.Client;

public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Pestana", 100);
        Hotel hotel2 = new Hotel("Pirata", 100);
        Client client1 = new Client("Diney", hotel1);
        client1.clientService(ServiceType.CHECKOUT);
        client1.clientService(ServiceType.CHECKIN);
        Client client2 = new Client("Ney", hotel2);
        client2.clientService(ServiceType.CHECKIN);
        client2.clientService(ServiceType.CHECKOUT);
    }
}