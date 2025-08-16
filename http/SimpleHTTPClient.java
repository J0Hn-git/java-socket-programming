
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class SimpleHTTPClient {
    public static void main(String args[]) throws IOException{
        Socket socket = new Socket("localhost", 8080);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("GET / HTTP/1.1");
        out.println("Host: localhost");
        out.println(""); // blank line = end of request.

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = in.readLine()) != null){
            System.out.println(line);
        }

    }
}
