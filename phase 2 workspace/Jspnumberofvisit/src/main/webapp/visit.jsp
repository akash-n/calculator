<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*" %>
<html>
    <head>
        <title>"HEY"</title>
    </head>
    <body>
        <form>
            
                <%
                    Integer hitsCount =
                    (Integer)application.getAttribute("Counter");
                    if( hitsCount ==null || hitsCount == 0 )
                    {   /* First visit */
                        out.println("Welcome to my website!!");
                        hitsCount = 1;
                    }
                    else
                    {
                        /* return visit */
                        out.println("Welcome to my website!!");
                        hitsCount += 1;
                    }
                    application.setAttribute("Counter", hitsCount);
                %>
                <p>You are visitor number: <%= hitsCount%></p>
           
        </form>
    </body>
    </html>

    