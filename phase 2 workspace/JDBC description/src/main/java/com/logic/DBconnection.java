package com.logic;
import java.sql.*;
public class DBconnection{
	static Connection con=null;

	public static Connection getMyConnection() {
try{  
			
			//step1 load the driver class in memory at run time 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step2 create  the connection object 
			 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis","root","vishnu@3");  
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return con;
	}
}

 

