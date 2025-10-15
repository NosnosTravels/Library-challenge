/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package http;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

/**
 *
 * @author M2200478
 */

public class HttpService {
    private static HttpServer server;
    
    public static void startServer(int port) throws IOException {
        server = HttpServer.create(new InetSocketAddress(port), 0);
        
        System.out.println("Server started at http://localhost:" + port + "/home");
        
        registerEndPoints();
        server.setExecutor(null);
        server.start();
    }
    
    public static void stopServer() {
        server.stop(0);
    }
    
    private static void registerEndPoints() {
        server.createContext("/home", new HomeHandler());
    } 
}
