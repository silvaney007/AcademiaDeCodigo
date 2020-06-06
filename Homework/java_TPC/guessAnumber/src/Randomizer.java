public class Randomizer {

    public static int randomBetween(int max, int min){
        int range = max - min + 1;
        return (int) (Math.random()*range) + min;
    }

}
