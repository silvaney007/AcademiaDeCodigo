package org.academiadecodigo.felinux.io.wordReader;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        WordReader wordReader = new WordReader("resource/textTest.txt");
        for (String word : wordReader) {
            System.out.println(word);
        }
    }
}
