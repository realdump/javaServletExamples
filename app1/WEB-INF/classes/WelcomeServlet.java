import jakarta.servlet.*;;
import java.io.*;
public class WelcomeServlet implements Servlet
{

	public void init(ServletConfig config)throws ServletException
	{
	}

	public void service(ServletRequest request, ServletResponse response)throws ServletException,IOException
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

	public ServletConfig getServletConfig()
	{
		return null;
	}

	public String getServletInfo()
	{
		return "";
	}

	public void destroy()
	{
	}
}


