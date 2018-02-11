package servlet;

import manager.BookManager;
import model.Book;
import model.User;
import util.Validator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet
public class AddBookServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter ("name");
        String author = req.getParameter ("author");
        String price = req.getParameter ("price");
        String description = req.getParameter ("description");
        String errMessage = "";

        if (Validator.isEmpty (name)) {
            errMessage += "Name is empty<br>";
        }
        if (Validator.isEmpty (author)) {
            errMessage += "Author is empty <br>";
        }
        if (Validator.isEmpty (price)) {
            errMessage += "Price is empty<br>";
        }
        BookManager bookManager = new BookManager ();
        HttpSession session = req.getSession ();
        User user = (User) session.getAttribute ("user");
        if (errMessage.equals ("")) {
            Book book = new Book (name, author, Double.parseDouble (price), description);
            bookManager.addBook (book);
            req.setAttribute ("info", " Book is added");
            req.setAttribute ("userBooks", bookManager.getBooksByUserId (user.getId ()));
            req.getRequestDispatcher ("/home.jsp").forward (req, resp);
        } else {
            req.setAttribute ("userBooks", bookManager.getBooksByUserId (user.getId ()));
            req.setAttribute ("errMesage", errMessage);
            req.getRequestDispatcher ("/home.jsp").forward (req, resp);
        }
    }
}
