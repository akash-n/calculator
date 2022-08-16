package productmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/CRUD")
public class CRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("txtpid"));
		String pname=request.getParameter("txtpname");
		int qty=Integer.parseInt(request.getParameter("txtqty"));
		float price=Float.parseFloat(request.getParameter("txtprice"));
		float total=Float.parseFloat(request.getParameter("txttotal"));
		
		PrintWriter out=response.getWriter();
		
		try {
			
				Connection con=DBConnection.getMyConnection();
		
				String str="Insert into ProductManagement (pid,pname,qty,price,total) values(?,?,?,?,?)";
				
				PreparedStatement  ps=con.prepareStatement(str);
				ps.setInt(1,pid );
				ps.setString(2, pname);
				ps.setInt(3, qty);
				ps.setFloat(2, price);
				ps.setFloat(2, total);
				
				int ans =ps.executeUpdate();
				for(pid=1;pid<ans;pid++) {
				if(ans>0)
					out.println("Record inserted");
				else
					out.println("Record not inserted");
				con.close();
			
				}
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}

		
	}}
	