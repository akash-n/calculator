package productsearch;

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

@WebServlet("/Valueoutlet")
public class Valueoutlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Valueoutlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

			PrintWriter out = response.getWriter();
			try {
				Connection con = DBconnection.MyConnection();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

				ResultSet rs = stmt.executeQuery("SELECT S.* FROM new_product S");
				out.println("Before Changes All Records...<br>");
				
				out.println("pid  name<br>");
				while (rs.next()) {
					out.println(rs.getInt(1) + "      " + rs.getString(2) + "<br>");
				}	
				// inserting a new row				rs.moveToInsertRow();
				rs.updateInt("pid", 16);
				rs.updateString("name", "abb");
				rs.insertRow();

				// updating 2nd row – changing name to Seetha
				rs.absolute(2);
				rs.updateString("name", "xxxyy");
				rs.updateRow();

				out.println("After Changes All Records...<br>");
				rs.beforeFirst();// to move cursor in begining of resultset
				
				
				while (rs.next()) {
					out.println(rs.getInt(1) + "      " + rs.getString(2) + "<br>");
				}
			} catch (Exception e) {
				out.println(e);
				e.printStackTrace();
			}

		}
	}
	