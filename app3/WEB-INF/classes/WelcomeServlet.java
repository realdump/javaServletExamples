import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;
public class WelcomeServlet extends HttpServlet
{


	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
		// set content type to the response object
		response.setContentType("text/html");

		//get printwriter object
		PrintWriter out = response.getWriter();

		//generate response
		out.println("<html>");
		out.println("<body>");
		out.println("<font size='6' color='red'>");
		out.println("<b>");
		out.println("Welcome");
		out.println("<hr>");
		out.println("</b></font></body></html>");
	}

}


