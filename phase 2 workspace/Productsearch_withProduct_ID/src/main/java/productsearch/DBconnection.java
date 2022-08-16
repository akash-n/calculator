package productsearch;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
 static Connection con=null;

public static Connection MyConnection() {
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasis","root","vishnu@3"); 
	 }
catch(Exception e) {
		e.printStackTrace();
	}

	return con;
}}
