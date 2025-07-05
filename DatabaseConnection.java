import java.sql.*;

public class DatabaseConnection {
    private Connection connect() {
        String dbPath = "jdbc:ucanaccess://C:/path/to/VUE_Exhibition.accdb";
        try {
            return DriverManager.getConnection(dbPath);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
            return null;
        }
    }
}