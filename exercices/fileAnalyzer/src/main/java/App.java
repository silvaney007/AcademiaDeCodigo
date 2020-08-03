import wordsApp.WordsApp;

public class App {

    public static void main(String[] args) {

        String path1 = "src/main/resources/file1.txt";
        String path2 = "src/main/resources/file2.txt";

        System.out.println(WordsApp.getTotalWords(path1));
        System.out.println(WordsApp.getWords(path1));
        System.out.println(WordsApp.getTotalWords(path2));
        System.out.println(WordsApp.getWords(path2));

        System.out.println("LongThan 7: " + WordsApp.getFirstWordLongerThan(path1, 20));
        System.out.println("Longest 10: " + WordsApp.getLongestWords(path1, 10));
        System.out.println(WordsApp.getCommonWords(path1, path2));

    }
}
