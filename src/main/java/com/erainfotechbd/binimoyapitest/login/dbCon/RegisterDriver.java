//package com.erainfotechbd.binimoyapitest.login.dbCon;
//
//import java.sql.*;
//
//public class RegisterDriver {
//    void registerDriverFunction() throws SQLException {
//
////        // Establish a connection
////        Connection connection = null;
////
////        try {
////            // Load the Oracle JDBC driver class dynamically
////            Class.forName("oracle.jdbc.driver.OracleDriver");
////
////            // Establish a connection
////            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.11.201.55:1525:ucbldb", "EMOB", "emob");
////
////            // Connection successful
////            System.out.println("Connected to Oracle database");
////
////            // Perform database operations here
////            // Example: execute SQL queries, insert/update/delete data
////
////
////        } catch (ClassNotFoundException e) {
////            // Connection failed or driver not found
////            System.out.println("ClassNotFoundException"+e);
////            e.printStackTrace();
////        } catch (SQLException e) {
////
////            System.out.println("SQLException"+e);
////            throw new RuntimeException(e);
////        }finally {
////            // Close the connection
////            connection.close();
////        }
//
//        Connection con = null;
//        String url
//                = "jdbc:oracle:thin:@10.11.201.55:1525/ucbldb"; // table details
//        String username = "EMOB"; // MySQL credentials
//        String password = "emob";
//
////		String query
////				= "select *from APP_USER_MASTER_TEST"; // query to be run
//
////        String query = "SELECT column_name \n" +
////                "FROM all_tab_columns \n" +
////                "WHERE table_name = 'APP_USER_MASTER_TEST'";
//        try {
//            Class.forName(
//                    "oracle.jdbc.driver.OracleDriver");
//            con = DriverManager.getConnection(
//                    url, username, password);
//            System.out.println(
//                    "Connection Established successfully");
//            Statement st = con.createStatement();
//
//
////            ResultSet rs
////                    = st.executeQuery(query); // Execute query
//
////            rs.next();
////			String name
////					= rs.getString("name"); // Retrieve name from db
//
//            //System.out.println(name); // Print result on console
//            //st.close(); // close statement
//            //con.close(); // close connection
//
//            //System.out.println("Connection Closed....");
//            // Driver name
//        } catch (ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException...."+e);
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//
//            System.out.println("SQLException...."+e);
//            throw new RuntimeException(e);
//        }finally {
//            con.close();
//            System.out.println("Connection Closed....");
//        }
//
//
//    }
//}
