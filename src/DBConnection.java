import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/studentdb";
    private static final String USER = "postgres"; 
    private static final String PASSWORD = "123sana@SS";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connected to PostgreSQL successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
