package org.example;

import org.h2.tools.Server;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Initialize Database
//        DatabaseUtil.initializeDatabase();

        // Create Order object
        Order order1 = new Order();
        order1.setStock("AAPL");
        order1.setPrice(105);

        // Convert object to XML
        XmlService xmlService = new XmlService();
        try {
            String xmlContent = xmlService.toXml(order1);

            // Save XML to Database
            DatabaseService databaseService = new DatabaseService();
            databaseService.saveXmlToDatabase(xmlContent);

            System.out.println("Successfully saved XML to database.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Start H2 Console for accessing the database through the browser
        try {
            System.out.println("Starting H2 server using port: http://localhost:8082");
            System.out.println("Login username: sa");
            Server webServer = Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
            webServer.start();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
