package org.academiadecodigo.felinux.diney;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Pestana", 100);
        Client client1 = new Client("Diney", hotel);
        client1.clientService(ServiceType.CHECKOUT);
        client1.clientService(ServiceType.CHECKIN);
        Client client2 = new Client("Ney", hotel);
        client2.clientService(ServiceType.CHECKIN);
        client2.clientService(ServiceType.CHECKOUT);
    }
}