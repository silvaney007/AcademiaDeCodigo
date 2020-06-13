package org.academiadecodigo.felinux.diney.magiclamp;

public class Main {

    public static void main(String[] args) {
        MagicLamp  magicLamp1 = new MagicLamp(5);
        Genie [] genies = new   Genie[7];
        for (int i = 0; i<genies.length;i++){
            genies[i] = createGenie(magicLamp1,3);
        }
    }

    public static Genie createGenie(MagicLamp magicLamp, int wishes) {
            switch (magicLamp.rubLamp()){
                case FRIENDLY:
                    return new FriendlyGenie(wishes);
                case GRUMP:
                    return  new GrumpGenie(wishes);
        }
        return new DemonGenie(wishes);
    }
}
