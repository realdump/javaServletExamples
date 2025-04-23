package com.example.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:mysql://localhost:3306/loginappdb?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // 👉 Your MySQL username
    private static final String PASSWORD = "root_pass_1234"; // 👉 Your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL Driver not found!", e);
        }

        // Return the DB connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
