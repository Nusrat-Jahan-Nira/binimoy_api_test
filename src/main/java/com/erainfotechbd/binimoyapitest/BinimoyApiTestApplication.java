package com.erainfotechbd.binimoyapitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class BinimoyApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BinimoyApiTestApplication.class, args);

//		Connection con = null;
//		String url
//				= "jdbc:oracle:thin:@10.11.201.55:1525/ucbldb"; // table details
//		String username = "EMOB"; // MySQL credentials
//		String password = "emob";
//
//		try {
//			Class.forName(
//					"oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection(
//					url, username, password);
//			System.out.println(
//					"Connection Established successfully");
//			Statement st = con.createStatement();
//
//
////            ResultSet rs
////                    = st.executeQuery(query); // Execute query
//
////            rs.next();
////			String name
////					= rs.getString("name"); // Retrieve name from db
//
//			//System.out.println(name); // Print result on console
//			//st.close(); // close statement
//			//con.close(); // close connection
//
//			//System.out.println("Connection Closed....");
//			// Driver name
//		} catch (ClassNotFoundException e) {
//			System.out.println("ClassNotFoundException...."+e);
//			throw new RuntimeException(e);
//		} catch (SQLException e) {
//
//			System.out.println("SQLException...."+e);
//			throw new RuntimeException(e);
//		}finally {
//			con.close();
//			System.out.println("Connection Closed....");
//		}
	}
}
