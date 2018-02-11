package db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionProvider {

    private static DBConnectionProvider provider;

    private String dbDriver;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    private Connection connection;

    private DBConnectionProvider() {
        try {
            loadConfigProperties ();
            Class.forName (dbDriver);
        } catch (Exception e) {
            throw new RuntimeException ("Failed to " +
                    "initialize DB Connection Provider", e);
        }
    }

    private void loadConfigProperties() throws IOException {
        InputStream inStream = DBConnectionProvider.class.getClassLoader ()
                .getResourceAsStream ("config.properties");
        Properties dbProps = new Properties ();
        dbProps.load (inStream);

        dbDriver = dbProps.getProperty ("db.driver");
        dbUrl = dbProps.getProperty ("db.url");
        dbUsername = dbProps.getProperty ("db.username");
        dbPassword = dbProps.getProperty ("db.password");
    }

    public static DBConnectionProvider getInstance() {
        if (provider == null) {
            synchronized (DBConnectionProvider.class) {
                if (provider == null) {
                    provider = new DBConnectionProvider ();
                }
            }
        }
        return provider;
    }

    public synchronized Connection getConnection() {
        try {
            if (connection == null || connection.isClosed ()) {
                connection = DriverManager.getConnection (dbUrl,
                        dbUsername, dbPassword);
            }
            return connection;
        } catch (Exception e) {
            throw new RuntimeException (e);
        }
    }

    public void close() {
        if (connection != null) {
            try {
                if (!connection.isClosed ()) {
                    connection.close ();
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
            connection = null;
        }
    }
}
