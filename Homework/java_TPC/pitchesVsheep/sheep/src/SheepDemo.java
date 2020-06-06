public class SheepDemo {

    public static void main(String[] args) {

        Sheep[] arraySheep = new Sheep[100];

        for (int i = 0; i < arraySheep.length; i++) {
            if (i < 99) {
                arraySheep[i] = new Sheep("white");
            } else {
                arraySheep[i] = new Sheep("black");
            }
        }
        int countSheep = 0;
        for (int i = 0; i < arraySheep.length;i++){
            countSheep++;
            System.out.println("Sheet number " + countSheep + " says " + arraySheep[i].makeNoise());
            arraySheep[i].setColor("pink");
        }
    }
}