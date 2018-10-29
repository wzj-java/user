package com.wzj.controler;

import com.wzj.entity.User;
import com.wzj.service.UserService;
import com.wzj.serviceimpl.UserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserControler {
    @Autowired
    private UserService userService;

    //查找全部用户
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> list = userService.getAll();
        model.addAttribute("list", list);
        return "list";
    }

    //添加用户
    @RequestMapping("/save")
    public void save(User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
        userService.save(user);
        response.sendRedirect(request.getContextPath() + "findAll");
    }

    //删除用户
    @RequestMapping("/deleteUser")
    public void deleteUser(int id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        userService.deleteUser(id);
        response.sendRedirect(request.getContextPath() + "findAll");
    }

    //查找用户详情
    @RequestMapping("/findUserById")
    public void  findUserById(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        User user = userService.findUserById(Integer.parseInt(id));
        request.setAttribute("user",user);
        //model.addAttribute("user",user);
        //response.sendRedirect(request.getContextPath() + "findAll");
    }

    //更新用户
    @RequestMapping("/updateUser")
    public void  updateUser(int id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        userService.updateUser(id);
        response.sendRedirect(request.getContextPath() + "findAll");
    }
}
