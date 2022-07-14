package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/"})
    public String index(){
        // 머스테치 기본 폴더 src/main/resources/
        // 뷰리졸브 : templates (prefix), .mustache (suffix) 생략가능
        return "index";
    }

}
