package ua.lviv.iot.persistant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String url = "jdbc:mysql://localhost:3306/kit?useUnicode"
            + "=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    private static final String username = "root";

    private static final String password = "Pavlo?osada228";

    private static Connection connection = null;

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                try {
                    connection = DriverManager.getConnection(url, username, password);
                } catch (SQLException exception) {
                    printException(exception);
                }
            }
        } catch (SQLException exception) {
            printException(exception);
        }
        return connection;
    }

    private static void printException(SQLException exception) {
        System.out.println("SQL Exception: " + exception.getMessage());
        System.out.println("SQL State: " + exception.getSQLState());
        System.out.println("SQL Error Code: " + exception.getErrorCode());
    }
}
