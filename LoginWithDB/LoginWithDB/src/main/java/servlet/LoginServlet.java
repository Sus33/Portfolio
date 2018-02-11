package servlet;

import manager.BookManager;
import manager.UserManager;
import model.User;
import util.Validator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter ("email");
        String password = req.getParameter ("password");
        String errMesage = "";
        if (Validator.isEmpty (email)){
            errMesage += "Email is empty <br>";
        }
        if (Validator.isEmpty (password)){
            errMesage += "Password is empty <br>";
        }
        UserManager userManager = new UserManager();
        BookManager bookManager = new BookManager ();
        if (errMesage.equals ("")){
            User user = userManager.getUserEmailAndPassword(email,password);
            if (user != null){
                HttpSession session = req.getSession ();
                session.setAttribute ("user",user);
                req.setAttribute ("userBooks", bookManager.getBooksByUserId (user.getId ()));

                req.getRequestDispatcher ("home.jsp").forward (req,resp);
            }else {
                errMesage = "Invalid login or password";
                req.setAttribute ("errMessage",errMesage);
                req.getRequestDispatcher ("index.jsp").forward (req,resp);
            }
        }else {
            req.setAttribute ("errMessage", errMesage);
            req.getRequestDispatcher ("index.jsp").forward (req,resp);
        }
    }
}
