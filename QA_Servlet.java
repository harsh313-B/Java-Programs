/*
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QA_Servlet extends HttpServlet {

    // Handle POST request
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        // Get answer from client
        String answer = request.getParameter("ans");

        out.println("<html><body>");

        // Check answer
        if (answer.equalsIgnoreCase("java")) {
            out.println("<h2>Correct Answer!</h2>");
        } else {
            out.println("<h2>Wrong Answer!</h2>");
        }

        out.println("</body></html>");
    }
}
*/