package gr.aueb.cf.blueapp.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {

    private static final BasicDataSource ds = new BasicDataSource();
    private static Connection connection;

    static {
        ds.setUrl("jdbc:postgresql://localhost:5432/BlueMargaritaDB");
        ds.setUsername("user-7");
        ds.setPassword(System.getenv("PASSWD_USER7"));
        ds.setInitialSize(10);
        ds.setMinIdle(10);
    }

    //constructor is private because this is a utility class
    private DBUtil(){}

    public static Connection getConnection() throws SQLException {
        connection = ds.getConnection();
        System.out.println("Connection Created");
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null) connection.close();
    }
}


