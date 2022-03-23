package GbServlet;

import GbServlet.Model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", createProd());
        getServletContext().getRequestDispatcher("/product.jsp")
                .forward(req, resp);
    }

    private List<Product> createProd() {
        List<Product> prodList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            char title = (char) (64 + i);
            prodList.add(new Product(i, title, (i * 10)));
        }
        return prodList;
    }
}
