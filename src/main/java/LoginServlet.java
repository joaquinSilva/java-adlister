import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    public LoginServlet() {
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
//        String password = request.getParameter("password");
        if (request.getMethod().equalsIgnoreCase("post")) {
//            if (username.equals("admin") && password.equals("password")) {
            if (name.equals("admin")) {
                response.sendRedirect("/profile.jsp");
            } else
                request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }




}
