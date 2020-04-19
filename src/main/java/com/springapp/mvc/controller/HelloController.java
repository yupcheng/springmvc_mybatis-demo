package com.springapp.mvc.controller;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.model.DateVO;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/restful")
@Slf4j
public class HelloController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/userinfo/{id}", method = RequestMethod.GET)
    public String showUserInfo(@PathVariable int id, ModelMap model) {
        User user = userService.getUserById(id);
        if (user != null) {
            model.addAttribute("name", user.getName());
        } else {
            model.addAttribute("name", "查无此用户");
        }
        return "home";
    }


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHome(ModelMap model) {
        int count = userService.getUserCount();
        model.addAttribute("count", count);
        return "count";
    }

    @RequestMapping(value = "/getDate", method = RequestMethod.GET)
    @ResponseBody
    public DateVO getDate(DateVO vo) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (vo != null && vo.getDate() != null) {
            System.out.println(sdf.format(vo.getDate()));
        }
        return vo;
    }

}