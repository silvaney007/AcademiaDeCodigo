package org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy;

public class Normal implements DeliveryStrategy {

    @Override
    public double deliveryCost(int distance){
        return distance * 0.0;
    }
}
