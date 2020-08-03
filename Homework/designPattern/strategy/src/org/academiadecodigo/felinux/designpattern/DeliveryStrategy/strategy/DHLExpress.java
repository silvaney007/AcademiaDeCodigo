package org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy;

public class DHLExpress implements DeliveryStrategy {

    private final double dhlExpTax = 0.2;

    @Override
    public double deliveryCost(int distance) {
        return distance * dhlExpTax;
    }
}
