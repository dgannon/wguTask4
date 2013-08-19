package wgutask4;

import java.sql.*;

public class Connect {

    public Connect() throws SQLException {
        makeConnection();
    }
    private Connection conn;

    public Connection makeConnection() throws SQLException {
        if (conn == null) {
            
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/registrar",
                    "wgutask4",
                    "student");
        }
        return conn;
    }

    public Statement makeStatement() throws SQLException {
        Statement st = conn.createStatement();
        return st;
    }

    public int close() throws SQLException {
        conn.close();
        return 1;
    }
}
