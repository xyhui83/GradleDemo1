package com.ivan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yinghui on 2017/8/30.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello";
    }
}
