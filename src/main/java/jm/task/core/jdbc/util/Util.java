package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306/users?serverTimezone=Europe/Moscow&useSSL=false";
    private final String USR = "root";
    private final String PASS = "testtest";


    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USR, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
