package org.academiadecodigo.felinux.designpattern.DeliveryStrategy;

import org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy.DHL;
import org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy.Normal;
import org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy.DHLExpress;


import java.util.Scanner;

public class StrategyDemo {

    public static void main(String[] args) {

        Delivery delivery = new Delivery();

        System.out.print("Delivery way: Normal | DHL | DHLExp: ");
        Scanner scanner = new Scanner(System.in);
        String method = scanner.next();

        switch (method){
            case "Normal" : delivery.setDeliveryStrategy(new Normal()); break;
            case "DHL": delivery.setDeliveryStrategy(new DHL()); break;
            case "DHLExp":delivery.setDeliveryStrategy(new DHLExpress()); break;
        }

        System.out.println("Delivery cost total: " + delivery.calDelivery(55));
        scanner.close();
    }
}
