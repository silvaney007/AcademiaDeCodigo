import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesIO {


    public void fileCopy(String str, String dst) throws IOException {
        FileInputStream readFile = null;
        FileOutputStream writeFile = null;
        try {
            readFile = new FileInputStream(str);
            writeFile = new FileOutputStream(dst);
            int b = readFile.read();

            while (b != -1) {
                writeFile.write(b);
                b = readFile.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            readFile.close();
            writeFile.close();
        }
    }
}
