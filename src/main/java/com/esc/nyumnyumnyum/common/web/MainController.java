package com.esc.nyumnyumnyum.common.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String test() {

        return "view/test.jsp";
    }
}