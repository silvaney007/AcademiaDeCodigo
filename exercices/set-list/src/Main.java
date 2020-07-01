public class Main {

    public static final String TEXT = "sara robin mary não sei o que escrever qualquer coisa mary qualquer coisa não mary";

    public static void main(String[] args) {

        UniqueWord words = new UniqueWord(TEXT);
        for (String str : words) {
            System.out.println(str);
        }
    }
}
