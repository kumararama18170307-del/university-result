import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public static Connection getConnection() {
            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/university",
                        "root",
                        "komala@2006"
                );
                System.out.println("Database connected successfully!");
                return con;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
