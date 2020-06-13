package org.academiadecodigo.felinux.diney.felinuxfarm;

public class FelinuxFarm {
    private boolean sellState;
    private int felinuxNumber;

    public FelinuxFarm(int felinuxNumber) {
        this.felinuxNumber = felinuxNumber;
        this.sellState = true;
    }

    public boolean sell() {
        if (sellState == true) {
            felinuxNumber--;
        }
        return sellState;
    }

    public void count() {
        int count = 0;
        while(count <= felinuxNumber) {
            System.out.println("Felinux Number: " + count);
        }
    }

    public boolean receiveFelinux(Felinux felinux){
        if(sellState == true){
            if( felinux instanceof Tiger){
                sellState = false;
            }
            felinuxNumber++;
            return true;
        }
        return false;
    }

}



