package org.academiadecodigo.felinux.designpattern.noDeliveryStrategy;

public class DeliveryNoStrategy {

    private String method;
    private final double dhlTax = 0.15;
    private final double dhlExpTax = 0.2;

    public DeliveryNoStrategy(String method) {
        this.method = method;
    }

    public double calDelivery(int distance) {

        if (method.equals("Normal")) {
            return distance * 0;
        } else if (method.equals("DHL")) {
            return distance * dhlTax;
        }
        return distance * dhlExpTax;
    }
}
