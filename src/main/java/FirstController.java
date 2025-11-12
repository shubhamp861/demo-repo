import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstController extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet v1.FirstController</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet v1.FirstController</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
