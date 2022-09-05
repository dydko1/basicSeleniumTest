package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2jdbcCreateDemo1 {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:c:/temp/test";
    static final String USER = "sa";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Creating connection to DB ...");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            System.out.println("Creating table in given DB ...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE   REGISTRATION1 " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given DB ...");

            stmt.close();
            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                //nothing to do
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se3) {
                //ended finally
            }
        }
        System.out.println("By BY By ...!!!");
    }
}
