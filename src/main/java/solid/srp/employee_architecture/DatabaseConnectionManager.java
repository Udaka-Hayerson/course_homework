package solid.srp.employee_architecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection connection;
    private static DatabaseConnectionManager databaseConnectionManager;

    private DatabaseConnectionManager(){};

    public  void  connect() throws SQLException {
        connection = DriverManager.getConnection("Database URL");
        System.out.println("connection DB establishet");
    }

    public  void  disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from DB");
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnectionManager getDatabaseConnectionManager() {
        return databaseConnectionManager;
    }

    public static void setDatabaseConnectionManager(DatabaseConnectionManager databaseConnectionManager) {
        DatabaseConnectionManager.databaseConnectionManager = databaseConnectionManager;
    }
}
