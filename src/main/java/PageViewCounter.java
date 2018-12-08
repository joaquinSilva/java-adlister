import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageViewCounter", urlPatterns = "/count")
public class PageViewCounter extends HttpServlet {

    private int counter = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        counter+=1;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String reset = req.getParameter("resetCounter");


        if (reset == null) {
            out.format("<h1>Number of times this page has been viewed: " + Integer.toString(counter) + " </h1>");
        } else {
            counter = 1;
            out.format("<h1>Number of times this page has been viewed: " + Integer.toString(counter) + " </h1>");
        }

    }
}

