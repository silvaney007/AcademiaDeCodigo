public class Cadet {
    private String name;
    private String pitch;

    public Cadet(String name, String pitch) {
        this.name = name;
        this.pitch = pitch;
    }

    public String getName() {
        return name;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public void pitchYourself(){
        System.out.println(" My name is " + name + " and " + pitch);
    }

}
