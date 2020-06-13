public class Annimals {

    private String nome;
    private  boolean hungry;

    public   boolean eat(){
        if(hungry == true) {
            hungry = false;
        }
        return true;
    }

    public  void move (){
        System.out.println("run");
    }

}
