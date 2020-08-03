package org.academiadecodigo.felinux.mapeditor.utilits;

import java.io.*;

public class FileManager {

    private static final String FILE = "resource/file.txt";


    public static String readFile() {
        String result = "";
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
            reader.close();
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
        return result;
    }


    public static void writeFile(String file) {
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(FILE));
            writer.write(file);
            writer.close();
        }catch (IOException err){
            System.out.println(err.getMessage());
        }
    }

}
