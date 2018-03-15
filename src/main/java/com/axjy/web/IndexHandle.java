package com.axjy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2018/3/14.
 */
@Controller
public class IndexHandle {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
