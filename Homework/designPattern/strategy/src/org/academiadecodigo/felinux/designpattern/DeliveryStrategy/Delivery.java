package org.academiadecodigo.felinux.designpattern.DeliveryStrategy;

import org.academiadecodigo.felinux.designpattern.DeliveryStrategy.strategy.DeliveryStrategy;

public class Delivery {

    private DeliveryStrategy deliveryStrategy;

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double calDelivery(int distance){
       return deliveryStrategy.deliveryCost(distance);
    }

}
