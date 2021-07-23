package com.manhlee.controller;

import com.manhlee.model.User;
import com.manhlee.services.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/change", "/edit"})
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        HttpSession session = request.getSession();
        List<User> userList = (List<User>) session.getAttribute("userList");
        User userEdit = UserService.findUserById(userList,id);
        session.setAttribute("user", userEdit);
        request.getRequestDispatcher("/views/editpage.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<User> userList = (List<User>) session.getAttribute("userList");
        int id= Integer.parseInt(request.getParameter("id"));
        String emailEdit=request.getParameter("emailEdit");
        String firstNameEdit=request.getParameter("firstNameEdit");
        String lastNameEdit=request.getParameter("lastNameEdit");
        UserService.editUserById(userList,id,emailEdit,firstNameEdit,lastNameEdit);
        session.setAttribute("user",userList);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
