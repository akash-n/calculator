package productsearch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductCalling")
public class ProductCalling extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int pid=Integer.parseInt(request.getParameter("txtpid"));
	try {
		Connection con=DBconnection.MyConnection();
		CallableStatement stmt=con.prepareCall("{call getRecord(?,?,?)}");
		 stmt.setInt(1,pid);
		    stmt.registerOutParameter(2, Types.VARCHAR);
		    stmt.registerOutParameter(3, Types.INTEGER);
		    
		    
		    stmt.execute();
		    PrintWriter out=response.getWriter();
		    out.println("<table border=2>");
			out.println("<tr><th>Rollno</th><th>Name</th><th>Price</th></tr>");
			out.println("<tr>");
			out.print("<td>"+pid+"</td>");
			out.print("<td>"+stmt.getString(2)+"</td>");
			out.print("<td>"+stmt.getInt(3)+"</td>");
			
			
			out.println("</tr>");
		
		out.println("</table>");
				
				
			con.close();
		     
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	
	}

	
}