package com.invengo.web.servlet;

import cn.itcast.servlet.BaseServlet;
import com.invengo.service.UserService;
import com.invengo.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class UserServlet extends BaseServlet {
    private UserService userService = new UserService();

    public void findAll(HttpServletRequest request, HttpServletResponse response){
        List<User> users = userService.findAll();
        request.setAttribute("users",users);
        try {
            request.getRequestDispatcher("/WEB-INF/user/list.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
