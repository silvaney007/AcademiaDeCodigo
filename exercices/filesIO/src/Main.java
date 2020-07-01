import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FilesIO filesIO = new FilesIO();

        String src = "Resource/File_in.txt";
        String dst = "Resource/file_out.txt";

        filesIO.fileCopy(src,dst);

    }
}
