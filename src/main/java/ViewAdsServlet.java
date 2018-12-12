import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ViewAdsServlet", urlPatterns = "/ads")
public class ViewAdsServlet extends HttpServlet {

    public ViewAdsServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads dao = DaoFactory.getAdsDao();
        List<Ad> ads = dao.all();
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }




}
