package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseUtil {
    public static void initializeDatabase() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
            Statement statement = connection.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS ORDERS (ID BIGINT PRIMARY KEY, XMLCONTENT CLOB)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
