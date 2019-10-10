package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    public boolean tryConnect() {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://hackathonateam.postgres.database.azure.com:5432/postgres?sslmode=require", "adminch@hackathonateam", "test1231!")) {
            if (conn != null) {
                System.out.println("Connected to the database!");
                return conn.isValid(10);
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
