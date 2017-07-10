package com.example.demo.com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hecz on 2017/7/10.
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(Model model)
    {
        model.addAttribute("a","ccc");
        return "test";
    }
}
