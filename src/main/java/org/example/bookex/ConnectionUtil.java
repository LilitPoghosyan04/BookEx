package org.example.bookex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection connection;
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    public static Connection getConnection() {
        if (connection==null){
            try {
                connection= DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}
