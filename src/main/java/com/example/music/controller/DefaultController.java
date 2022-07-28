package com.example.music.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 苏辰
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {

    @GetMapping
    public String hello(){
        return "欢迎程序员苏辰的音乐盒";
    }
}
