package productmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			Connection con=DBConnection.getMyConnection();
		
			String str="select * from ProductMangement";
			
			//to execute query create object of Statement
			Statement  ps=con.createStatement();
		
			ResultSet ans =ps.executeQuery(str);
		
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr><th>PID</th><th>PName</th><th>QTY</th></tr>Price</th><th>total</th><th>");
	
			while(ans.next()) {
				out.println("<tr>");
				out.print("<td>"+ans.getInt("pid")+"</td>");
				out.print("<td>"+ans.getString("pname")+"</td>");
				out.print("<td>"+ans.getInt("qty")+"</td>");
				out.print("<td>"+ans.getFloat("price")+"</td>");
				out.print("<td>"+ans.getFloat("total")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	

}	

