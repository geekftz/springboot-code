package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    // public String doJsp(HttpServletRequest request) {
    //     request.setAttribute("data", "springboot use jsp");
    //  视图的逻辑名称
    //     return "index";
    // }

    /**
     * ModelAndView
     * @param model
     * @return
     */
    @RequestMapping("/myjsp")
    public String doJsp(Model model) {
        // 把数据放入到request作用域
        model.addAttribute("data", "9090");
        //  视图的逻辑名称
        return "index";
    }
}
