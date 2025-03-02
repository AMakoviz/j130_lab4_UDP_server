import org.example.AppProperties;
import org.example.UDPServer;

import java.io.IOException;
import java.net.SocketException;


    public static void main(String[] args) {
        AppProperties properties = new AppProperties();

        try {
            UDPServer server = new UDPServer(properties);
            (new Thread (() -> {
                try {
                    server.send();
                    server.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            })).start();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
