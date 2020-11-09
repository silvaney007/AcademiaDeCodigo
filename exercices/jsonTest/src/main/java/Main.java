import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
         IpLocation ipLocation =  mapper.readValue(new URL("http://ipinfo.io/json"), IpLocation.class);
            System.out.println(ipLocation.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
