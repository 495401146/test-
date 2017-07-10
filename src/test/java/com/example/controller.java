package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hecz on 2017/7/10.
 */
@Controller
public class controller {
    @RequestMapping(path = "/index",method = RequestMethod.GET)
    @ResponseBody
    public String hello()
    {
        return "hello";
    }
}
