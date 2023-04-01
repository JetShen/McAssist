import java.net.*;
import java.io.*;

public class APIRequest {
    public static void main(String[] args) {
        try {
            String positions = "positions_value";
            int x = 784;
            int y = 64;
            int z = 100;
            // positions_value?x=784&y=7854&z=45
            String urlStr = "http://127.0.0.1:8000/poss/" + positions + "?x="+ x + "&y=" + y + "&z=" + z;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}