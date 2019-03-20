package main.java.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static final String URL = "jdbc:mysql://@178.128.205.150:3306/test?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "password123";

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }
}