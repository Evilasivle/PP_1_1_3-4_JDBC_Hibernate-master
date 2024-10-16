package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USERNAME = "root";

    private static final String databaseName = "users";
    // реализуйте настройку соеденения с БД
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL + databaseName, USERNAME, PASSWORD);
    }
    }

