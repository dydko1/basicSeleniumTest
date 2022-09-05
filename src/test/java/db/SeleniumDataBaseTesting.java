package db;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;

public class SeleniumDataBaseTesting {

    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    @BeforeClass
    public void setUp() {
        String databaseURL = "jdbc:h2:c:/temp/test";
        String user = "sa";
        String password = "";
        connection = null;
        try {
            Class.forName("org.h2.Driver");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(databaseURL, user, password);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void getEmployeesFromDataBase() {
        try {
            String query = "select * from employee";
            String query2 = "INSERT INTO EMPLOYEE VALUES(4, 'Miro3', 'Dydko', 41);";

            statement = connection.createStatement();
            //statement.executeUpdate(query2);
            rs = statement.executeQuery(query);

            // przerobic
            while (rs.next()) {
                int EmpId = rs.getInt("Id");
                String EmpName = rs.getString("first");
                String EmpLast = rs.getString("last");
                Integer age = rs.getInt("age");
                Double EmpSal = rs.getDouble(4);
                System.out.println(EmpId + "\t" + EmpName + "\t" + EmpLast + "\t" + age);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}