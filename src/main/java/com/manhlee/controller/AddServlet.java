package com.manhlee.controller;

import com.manhlee.model.User;
import com.manhlee.services.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<User> userList = (List<User>) session.getAttribute("userList");
        int id= UserService.generalUserId(userList);
        String newEmail = request.getParameter("email");
        String newFirstName = request.getParameter("firstName");
        String newLastName = request.getParameter("lastName");
        User user = new User(id,newEmail,newFirstName,newLastName);
        userList.add(user);
        session.setAttribute("userList", userList);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
