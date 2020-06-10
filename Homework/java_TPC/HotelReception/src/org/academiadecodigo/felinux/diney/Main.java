package org.academiadecodigo.felinux.diney;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Diney");
        client1.clientService(ServiceType.CHECKOUT);
        client1.clientService(ServiceType.CHECKIN);
        client1.clientService(ServiceType.CHECKOUT);
        Client client2 = new Client("Diney");
    }
}