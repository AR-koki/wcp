package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private final static String URL = "jdbc:mysql://localhost:3306/webdb?useSSL=false";
    private final static String USER = "root";
    private final static String PASSWORD = "root";
    
    private Connection connection = null;
    private static ConnectionManager instance = new ConnectionManager();
    static {
    	String drv = "com.mysql.jdbc.Driver";
        try {
            Class.forName(drv);
        } catch (ClassNotFoundException e) {
            System.out.println("ドライバがありません" + e.getMessage());
        }
    }
    private ConnectionManager() {   }
    public static ConnectionManager getInstance() { return instance; }
    public synchronized Connection getConnection() throws DAOException {
    	try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            connection = null;
            throw new DAOException("[conect]異常", e);
        }
        return connection;
    }
    public void closeConnection() throws DAOException{
        try {
            if (connection != null) {   connection.close(); }
        } catch (SQLException e) {
            throw new DAOException("[closeConnection]異常", e);
        } finally {
            connection = null;
        }
    }
}
