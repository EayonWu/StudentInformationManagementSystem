package com.eayon.controller;

import com.eayon.model.CourseEntity;
import com.eayon.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
/**
 * Created by Eayon on 16/12/14.
 */

@Controller
public class CourseController {
    // 自动装配数据库接口，不需要再写原始的Connection来操作数据库
    @Autowired
    CourseRepository courseRepository;

    @RequestMapping(value = "/admin/Courses", method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap) {
        // 查询user表中所有记录
        List<CourseEntity> CourseList = courseRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在userList当中
        modelMap.addAttribute("CourseList", CourseList);

        // 返回pages目录下的admin/users.jsp页面
        return "admin/Courses";
    }

    // get请求，访问添加用户 页面
    @RequestMapping(value = "/admin/Courses/add", method = RequestMethod.GET)
    public String addStudent(ModelMap modelMap) {

        // 转到 admin/addUser.jsp页面
        return "admin/addStudents";
    }

    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/admin/Courses/addP", method = RequestMethod.POST)
    public String addStuPost(@ModelAttribute("Course") CourseEntity CourseEntity) {
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        courseRepository.saveAndFlush(CourseEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/admin/Courses";
    }
}