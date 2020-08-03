package org.academiadecodigo.felinux.designpattern.noDeliveryStrategy;

import java.util.Scanner;

public class NoStrategyDemo {
    public static void main(String[] args) {

        System.out.print("Delivery way: Normal | DHL  :");
        Scanner scanner = new Scanner(System.in);
        String delivery = scanner.next();

        DeliveryNoStrategy deliveryNoStrategy = new DeliveryNoStrategy(delivery);
        System.out.println("Delivery total is: " + deliveryNoStrategy.calDelivery(55));

        scanner.close();
    }

}

