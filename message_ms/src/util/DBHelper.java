package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    public static Connection getConnection() throws Exception {
        String user = "sa";
        String password = "ha19990903";
        String dataBase = "MessageMS";
        String host = "localhost:1433";
        String url = "jdbc:sqlserver://" + host + ";databaseName=" + dataBase + ";user=" + user + ";password=" + password;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }
}