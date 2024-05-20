package com.erainfotechbd.binimoyapitest.login.dbCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

    public static Connection getcon(){
        //driver
        //
        //con create
        //registerDriver.registerDriverFunction();

        Connection con = null;
        String url
                = "jdbc:oracle:thin:@10.11.201.55:1525/ucbldb"; // table details
        String username = "EMOB"; // MySQL credentials
        String password = "emob";

        try {
            Class.forName(
                    "oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                    url, username, password);
            System.out.println(
                    "Connection Established successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException...."+e);
            throw new RuntimeException(e);
        } catch (SQLException e) {

            System.out.println("SQLException...."+e);
            throw new RuntimeException(e);
        }

        return con;
    }

}
