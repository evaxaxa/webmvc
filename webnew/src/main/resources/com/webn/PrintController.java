package com.webn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PrintController{

    @RequestMapping("/add")
    public void add()
    {
        System.out.print("You're inside Print controller!!");
    }
}