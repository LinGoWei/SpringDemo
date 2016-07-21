package com.vdian.controller;

/**
 * Created by liuguowei on 7/21/16.
 */

import com.vdian.model.HelloCompute;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    private static final Logger logger = Logger.getLogger(HelloWorldController.class);

    String message = "Welcome to Spring MVC!";

    @RequestMapping("/hello")
    public ModelAndView showMessage(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
        ModelAndView mv = new ModelAndView("helloworld");
        HelloCompute helloCompute = new HelloCompute();
        mv.addObject("message", helloCompute.GetHelloResult());
        mv.addObject("name", name);
        logger.info("Hello World");
        return mv;
    }
}