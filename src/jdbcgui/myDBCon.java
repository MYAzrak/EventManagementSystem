package jdbcgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class myDBCon {
    private static final String DB_URL = "url";
    private static final String DB_USER = "user";
    private static final String DB_PASS = "pass";

    private Connection con;
    private Statement statement;
    private PreparedStatement prepStatement;
    private ResultSet rs;

    public myDBCon() {
        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Connect to Oracle Database
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException | SQLException e) {
            displayError("SQL Error - Retrieving username/password.");
        }
    }

    // returns records selected 
    public ResultSet executeStatement(String strSQL) throws SQLException {
        // make the result set scrollable forward/backward updatable
        statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // populate valid mgr numbers 
        rs = statement.executeQuery(strSQL);
        return rs;
    }

    // update, insert (return number of records affected 
    public int executePrepared(String strSQL) throws SQLException {
        prepStatement = con.prepareStatement(strSQL);
        return prepStatement.executeUpdate();
    }

    public PreparedStatement prepareStatement(String strSQL) throws SQLException {
        return con.prepareStatement(strSQL);
    }

    private void displayError(String message) {
        javax.swing.JLabel label = new javax.swing.JLabel(message);
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
        JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
