package com.example.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 苏辰
 */
@RestController
public class DefaultController {

    @GetMapping("/hello")
    public String hello(){
        return "欢迎来到程序员苏辰的音乐盒";
    }
}
