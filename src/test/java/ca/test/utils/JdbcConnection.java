package ca.test.utils;

import java.sql.*;

public class JdbcConnection {

    public String jdbcdemo(String user) {
        try {
            //Get a connection with database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://10.2.4.9:3306/atsspec_net_staging_1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "qa.ankita", "Ankita");

            //Create a Statement
            Statement mystatement = myConn.createStatement();

            //Execute sql
            ResultSet myRs = mystatement.executeQuery("SELECT u.`username` FROM user u\n" +
                    "ORDER BY u.id DESC LIMIT 1;");
            //process the result
            while (myRs.next()) {
                String actual = myRs.getString("username");
                System.out.println("username" + actual);
            }

            myRs.close();
            mystatement.close();
            myConn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}

