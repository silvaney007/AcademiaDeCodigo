package wordsApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class WordsApp {

    public static String getWords(String file) {

        return readFileToStream(file)
                .reduce("", (acc, word) -> acc.concat(word).concat("\n"));
    }

    public static long getTotalWords(String file) {

        return readFileToStream(file).count();
    }

    public static String getFirstWordLongerThan(String file, int nLength) {

        return readFileToStream(file)
                .filter(word -> word.length() > nLength)
                .findFirst().orElse("No result");
    }

    public static String getLongestWords(String file, int nLength) {

        return readFileToStream(file)
                .filter(word -> word.length() >= nLength)
                .reduce("", (acc, word2) -> acc.concat(word2).concat("\n"));
    }

    public static String getCommonWords(String fileName1, String fileName2) {

        Stream<String> file1 = readFileToStream(fileName1);
        Stream<String> file2 = readFileToStream(fileName2);
        final int nLength = 3;

       return file1.filter(word1 -> word1.length() > nLength )
                .reduce( "" , (acc ,word) -> {
                    acc.concat(file2.filter( word2 -> word2.equals(word))
                    .findFirst().orElse(""));
                return acc;
                    We can say that zip is functionally dependent on street, city, which in turn are functionally dependent on full_name

                    The attribute zip is said to be transitively dependent on full_name!
                });
    }

    private static Stream<String> readFileToStream(String file) {

        return Stream.of(readSource(file).split("[ \\t\\n]+"));
    }

    private static String readSource(String path) {

        String result = "";
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(path));
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
}
