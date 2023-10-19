package sampleservlet;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sampleserv
 */
@WebServlet("/Sampleserv")
public class Sampleserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sampleserv() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    	    throws IOException, ServletException
    	    {
    	        response.setContentType("text/html");
    	        PrintWriter out = response.getWriter();
    	        out.println("<html>");
    	        out.println("<head>");
    	        out.println("<title>I Love Ponies!</title>");
    	        out.println("</head>");
    	        out.println("<body>");
    	        out.println("<h1>I Love Ponies!</h1>");
    	        out.println("</body>");
    	        out.println("</html>");
    	    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the name parameter from the form
        String name = request.getParameter("name");

        // Do something with the name, e.g., store it in a database or print it
//        System.out.println("Received name: " + name);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Received name: " + name);
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Received name: " + name);
        out.println("</body>");
        out.println("</html>");
        
    }
}
