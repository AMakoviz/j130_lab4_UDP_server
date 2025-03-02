package org.example;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.time.LocalDateTime;

public class UDPServer implements AutoCloseable {
    private DatagramSocket ds;
    private DatagramPacket dp;
    private byte[] data;
    public static int MAX_LENGTH = 65000;


    public UDPServer(AppProperties properties) throws SocketException {
        ds = new DatagramSocket(properties.getPort());
        data = new byte[MAX_LENGTH];
        dp = new DatagramPacket(data, data.length);
    }

    public void send() throws IOException {

        System.out.println("Сервер начинает обмен данными с клиентом в потоке: " + Thread.currentThread().getId());
        LocalDateTime now = LocalDateTime.now();
        ds.receive(dp);
        InetAddress clientAddress = dp.getAddress();
        String message = new String (dp.getData(), 0, dp.getLength());
        System.out.println("Сообщение от клиента [" + clientAddress + "]: "+ message + "/n Время получения сообщения: " + now);


        message = "Данные успешно получены. Время получения: " + now;
        dp.setData(message.getBytes());
        ds.send(dp);

    }


    @Override
    public void close() throws Exception {
        if (!ds.isClosed()) {
            ds.close();
        }
    }
}
