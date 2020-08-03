package org.academiadecodigo.felinux.io.wordReader;

import java.io.*;
import java.util.Iterator;

public class WordReader implements Iterable<String> {

    private String path;
    private FileReader fileReader;
    private BufferedReader bfReader;
    private LineNumberReader lineNumberReader;


    public WordReader(String path) throws FileNotFoundException {
        fileReader = new FileReader(path);
    }


    @Override
    public Iterator<String> iterator() {

        bfReader = new BufferedReader(fileReader);
        lineNumberReader = new LineNumberReader(bfReader);
        int nLine = 0;


        return new Iterator<String>() {

            @Override
            public boolean hasNext() {
                try {
                    return lineNumberReader.readLine() != null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return false;
            }

            @Override
            public String next() {

                return null;
            }
        };
    }
}
