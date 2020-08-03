package org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy;

public class DHL implements DeliveryStrategy {

    private final double dhlTax = 0.15;

    @Override
    public double deliveryCost(int distance) {
        return distance * dhlTax;
    }
}
