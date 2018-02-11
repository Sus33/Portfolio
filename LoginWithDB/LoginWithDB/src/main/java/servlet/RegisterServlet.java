package servlet;

import manager.UserManager;
import model.Gender;
import model.User;
import util.Validator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter ("name");
        String surename = req.getParameter ("surename");
        String email = req.getParameter ("email");
        String gender = req.getParameter ("gender");
        String password = req.getParameter ("password");
        String rePassword = req.getParameter ("repassword");

        UserManager userManager = new UserManager ();

        String errMessage = "";
        if (Validator.isEmpty (name)) {
            errMessage += "Name is empty<br>";
        }
        if (Validator.isEmpty (surename)) {
            errMessage += "Surename is empty <br>";
        }
        if (Validator.isEmpty (email)) {
            errMessage += "Email is empty<br>";
        }else if (userManager.isEmailExsist(email)){
            errMessage += "Email is already empty<br>";
        }
        if (Validator.isEmpty (gender)) {
            errMessage += "Gender is empty<br>";
        }
        if (Validator.isEmpty (password)) {
            errMessage += "Password is empty<br>";
        }
        if (Validator.isEmpty (rePassword)) {
            errMessage += "Re-Password is empty<br>";
        }
        if (Validator.isEmpty (password)&&
                 !Validator.isEmpty (rePassword)){
            if (!password.equals (rePassword)){
                errMessage += "Passwords don't match<br>";
            }
        }
        if (errMessage.equals ("")) {
            User user = new User (name,surename,email,
                    Gender.valueOf (gender.toUpperCase ()),password);
            userManager.addUser (user);
            resp.sendRedirect("index.jsp");
        } else
        req.setAttribute ("message", errMessage);
        req.getRequestDispatcher ("/register.jsp").forward (req, resp);
    }
}

