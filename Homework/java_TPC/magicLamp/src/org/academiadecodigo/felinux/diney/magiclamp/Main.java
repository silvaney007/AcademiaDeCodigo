package org.academiadecodigo.felinux.diney.magiclamp;

public class Main {
    public static void main(String[] args) {
        MagicLamp  magicLamp1 = new MagicLamp(2);
        MagicLamp magicLamp2 = new MagicLamp(3);
        genieGame(magicLamp1,3);
        genieGame(magicLamp2,3);

        magicLamp1.toCompare();
        magicLamp2.toCompare();



    }

    public static void genieGame(MagicLamp magicLamp, int wishes){

        int lampCapacity = magicLamp.getLampCapacity();
        while (lampCapacity >= 0){
            GeniesType  geniesType = magicLamp.rubLamp();
            switch (geniesType){
                case FRIENDLY:
                    FriendlyGenie friendlyGenie = new FriendlyGenie(wishes);
                    grantWishes(friendlyGenie, geniesType);
                    break;
                case GRUMP:
                    GrumpGenie grumpGenie = new GrumpGenie(wishes);
                    grantWishes(grumpGenie, geniesType);
                    break;
                case DEMON:
                    DemonGenie demonGenie = new DemonGenie(wishes);
                    grantWishes(demonGenie, geniesType);
                    magicLamp.rechargeLamp(demonGenie);
                    break;
            }
            lampCapacity--;
        }
    }

    public static void printWish (GeniesType genies, int wishOption) {
        if(wishOption != -1){
            System.out.println( genies.toString() + " Wish granted");
        }else {
            System.out.println(genies.toString() + " No wish available");
        }
    }

    public static void grantWishes(Genie genies, GeniesType geniesType){
        int validator = 0;
        do {
            validator = genies.grantWish();
            printWish(geniesType, validator);
        }while (validator != -1);
    }
}
