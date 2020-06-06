public class PitchDemo {
    public static void main(String[] args) {
        Cadet[] arrayCadets = new Cadet[5];
        arrayCadets[0] = new Cadet("Tiago Silva","Fell down the stairs and broke my teeth");
        arrayCadets[1] = new Cadet("João Pinheiro","I skated naked on an ice ring");
        arrayCadets[2] = new Cadet("David","I ran away from the police hiding in a barrel");
        arrayCadets[3] = new Cadet("Bernado","I can imitate Beyoncé");
        arrayCadets[4] = new Cadet("Tiago Patricio","I always dress as a woman at the carnival");

        for(int i = 0; i < arrayCadets.length; i++){
            arrayCadets[i].pitchYourself();
        }

        int randomCadetIndex = (int) Math.floor(Math.random()*5);
        changeCadetPitch(arrayCadets[randomCadetIndex], "I have 25 brothers and only Uncles");

    }

    public static void changeCadetPitch(Cadet cadet, String pitch){
        cadet.setPitch(pitch);
        System.out.println(" " + cadet.getName() + ", changed your pitch to: "
                + cadet.getPitch());
    }
}




