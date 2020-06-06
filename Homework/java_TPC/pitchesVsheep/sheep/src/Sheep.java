public class Sheep {
    private String color;

    public Sheep(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String makeNoise(){
        if(color.equals("white")){
            return "meeeeehs";
        }else if (color.equals("black")){
            return "miiiiihs";
        }else{
            return "maaaaahs";
        }
    }
}
